import java.io.*;
import java.util.Scanner;

public class UserRegistration {
    static final String FILE_PATH = "src/Cybersecurity/Hashing/SaltedPasswordHashing/userdata.txt";  // Path to store user data

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for registration
        System.out.print("🆕 Enter new username: ");
        String username = sc.nextLine();
        System.out.print("🔑 Enter new password: ");
        String password = sc.nextLine();

        // Creating the file if it doesn't exist
        File file = new File(FILE_PATH);

        try {
            // Check if the file exists, else create it
            if (!file.exists()) {
                file.getParentFile().mkdirs();  // Ensure directories exist
                file.createNewFile();  // Create the file
                System.out.println("📄 File created for storing user data at: " + file.getAbsolutePath() );  // Show full file path
            }

            // Writing the username and password (hashed or plain) to the file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Username: " + username);
            bw.newLine();
            bw.write("Password: " + password);  // You can hash the password here if needed
            bw.newLine();
            bw.write("------------");
            bw.newLine();
            bw.close();

            System.out.println("✅ Registration successful for user: " + username);

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
            e.printStackTrace();  // Shows full error details in case of an issue
        }
    }
}
