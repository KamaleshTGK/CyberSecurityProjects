import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilePermissionChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path to check or create: ");
        String path = sc.nextLine();

        File file = new File(path);

        try {
            if (!file.exists()) {
                if (file.getParentFile() != null) {
                    file.getParentFile().mkdirs(); // Create folders if needed
                }
                file.createNewFile(); // Create file
                System.out.println("✅ File created successfully at: " + path);
            } else {
                System.out.println("✅ File already exists at: " + path);
            }

            System.out.println("🔍 Readable: " + file.canRead());
            System.out.println("🔍 Writable: " + file.canWrite());
            System.out.println("🔍 Executable: " + file.canExecute());

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        sc.close();
    }
}
