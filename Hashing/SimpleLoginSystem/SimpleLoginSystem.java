import java.io.*;
import java.util.Base64;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.SecureRandom;
public class SimpleLoginSystem {
    static final String FILE_PATH = "userdata.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\uD83D\uDD39 Welcome to Simple Login System \uD83D\uDD39");
        System.out.print("Choose (register/login): ");
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("register")) {
            register(sc);
        } else if (choice.equalsIgnoreCase("login")) {
            login(sc);
        } else {
            System.out.println("❌ Invalid choice!");
        }
    }

    private static void register(Scanner sc) {
        try {
            System.out.print("🆕 Enter new username: ");
            String username = sc.nextLine();
            System.out.print("\uD83D\uDD11 Enter new password: ");
            String password = sc.nextLine();

            SecureRandom random = new SecureRandom();
            byte[] saltBytes = new byte[16];
            random.nextBytes(saltBytes);
            String salt = Base64.getEncoder().encodeToString(saltBytes);

            String saltedPassword = salt + password;
            String hashedPassword = hashPassword(saltedPassword);

            File file = new File(FILE_PATH);
            if(!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
                System.out.println("📄 File created for storing user data!");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(username + ":" + salt + ":" + hashedPassword);
            bw.newLine();
            bw.close();

            System.out.println("✅ Registration successful for user: " + username);
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    private static void login(Scanner sc) {
    try {
        System.out.print("\uD83D\uDC64 Enter username:");
        String username = sc.nextLine();
        System.out.print("\uD83D\uDD11 Enter password: ");
        String password = sc.nextLine();

        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("❌ No user data found. Please register first.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 3 && parts[0].equals(username)) {
                found = true;
                String salt = parts[1];
                String storedHash = parts[2];

                String enteredSaltedPassword = salt + password;
                String enteredHash = hashPassword(enteredSaltedPassword);

                if (enteredHash.equals(storedHash)) {
                    System.out.println("✅ Login successful! Welcome back, " + username + "!");
                } else {
                    System.out.println("❌ Incorrect password!");
                }
                break;
            }
        }

        br.close();

        if (!found) {
            System.out.println("❌ Username not found. Please register first.");
        }

    } catch (Exception e) {
        System.out.println("⚠️ Error: " + e.getMessage());
    }

    }

    private static String hashPassword(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(input.getBytes());

        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }
}


