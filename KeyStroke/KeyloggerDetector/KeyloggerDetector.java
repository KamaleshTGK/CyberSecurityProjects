import java.io.File;

public class KeyloggerDetector {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the path of the folder to scan: ");
        String folderPath = sc.nextLine();

        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder.");
            return;
        }

        boolean foundSuspect = false;

        System.out.println("\n🔍 Scanning files for suspicious keylogger patterns...\n");

        for (File file : files) {
            String fileName = file.getName().toLowerCase();

            if (fileName.contains("keylog") || fileName.contains("inputlogger") || fileName.contains("keystroke")) {
                System.out.println("⚠️  Suspicious file detected: " + file.getName());
                foundSuspect = true;
            }
        }

        if (!foundSuspect) {
            System.out.println("✅ No suspicious keylogger files detected.");
        }

        sc.close();
    }
}

