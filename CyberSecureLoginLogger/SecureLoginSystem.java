import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class SecureLoginSystem {

    private static HashMap<String, String> userDB = new HashMap<>();
    private static HashMap<String, Integer> failedAttempts = new HashMap<>();

    private static String USERS_FILE;
    private static String LOG_FILE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Let user provide file paths
        System.out.print("Enter path to users file (e.g., users.txt): ");
        USERS_FILE = sc.nextLine();

        System.out.print("Enter path to log file (e.g., login_log.txt): ");
        LOG_FILE = sc.nextLine();

        loadUsers();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful! Welcome, " + username);
            log("SUCCESS: " + username + " logged in at " + LocalDateTime.now());
        } else {
            System.out.println("Login failed. Invalid credentials.");
            log("FAILURE: " + username + " failed login at " + LocalDateTime.now());
            trackFailedAttempt(username);
        }

        System.out.println("Process finished.");
    }

    private static void loadUsers() {
        try (BufferedReader br = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    userDB.put(parts[0].trim(), parts[1].trim());
                }
            }
            System.out.println("✅ Users loaded successfully from " + USERS_FILE);
        } catch (IOException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
    }

    private static boolean authenticate(String username, String password) {
        return userDB.containsKey(username) && userDB.get(username).equals(password);
    }

    private static void trackFailedAttempt(String username) {
        int attempts = failedAttempts.getOrDefault(username, 0) + 1;
        failedAttempts.put(username, attempts);

        if (attempts >= 3) {
            System.out.println("⚠️ WARNING: " + username + " has failed login 3 times.");
            log("ALERT: Suspicious activity detected for user " + username);
        }
    }

    private static void log(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bw.write(message);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }
}
