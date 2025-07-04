import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.security.MessageDigest;
import java.util.Scanner;

public class PasswordHasher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("🔐 Enter your password: ");
        String password = sc.nextLine();

        try {
            // Hash password
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] digest = md.digest();

            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }
            String hashedPassword = hexString.toString();

            System.out.println("✅ Hashed Password (SHA-256): " + hashedPassword);

            // Get custom path from user
            System.out.print("📁 Enter folder path to save the file (e.g., C:\\Users\\YourName\\Documents): ");
            String folderPath = sc.nextLine();

            // Create file
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();
                System.out.println("📂 Folder created at: " + folder.getAbsolutePath());
            }

            String filePath = folderPath + File.separator + "passwords.txt";
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("📄 passwords.txt created successfully!");
            }

            // Write to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Original Password: " + password);
            bw.newLine();
            bw.write("Hashed Password: " + hashedPassword);
            bw.newLine();
            bw.write("------------");
            bw.newLine();
            bw.close();

            System.out.println("✅ Password and hashed password saved successfully in: " + file.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}
