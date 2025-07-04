import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;

public class SaltedPasswordHasher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("🔐 Enter your password: ");
        String password = sc.nextLine();

        try {
            // Generate random salt
            SecureRandom random = new SecureRandom();
            byte[] saltBytes = new byte[16];
            random.nextBytes(saltBytes);
            String salt = Base64.getEncoder().encodeToString(saltBytes);

            String saltedPassword = salt + password;

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(saltedPassword.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            String hashedPassword = hexString.toString();

            System.out.println("\n🧂 Salt: " + salt);
            System.out.println("🔒 Hashed Salted Password: " + hashedPassword);

            // Ask user where to save
            System.out.print("Enter the path to save the file (e.g., saltedpasswords.txt): ");
            String path = sc.nextLine();

            File file = new File(path);

            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
                System.out.println("📄 File created successfully!");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Original Password: " + password);
            bw.newLine();
            bw.write("Salt: " + salt);
            bw.newLine();
            bw.write("Hashed Salted Password: " + hashedPassword);
            bw.newLine();
            bw.write("------------");
            bw.newLine();
            bw.close();

            System.out.println("✅ Password data saved to file!");

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}
