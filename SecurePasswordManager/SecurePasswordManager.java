import java.util.Scanner;
class PasswordManager {
    private String encryptedPassword;

    private String encrypt(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    private String decrypt(String encrypted) {
        return new StringBuilder(encrypted).reverse().toString();
    }

    public void setPassword(String password) {
        this.encryptedPassword = encrypt(password);
        System.out.println("Password stored securely.");
    }

    public String getPassword(String securityAnswer) {
        if (securityAnswer.equals("12345")) {
            return decrypt(encryptedPassword);
        } else {
            return "Access Denied!";
        }
    }
}

public class SecurePasswordManager {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password to store: ");
        String password = sc.nextLine();
        manager.setPassword(password);

        System.out.print("Enter security answer to retrieve the password: ");
        String answer = sc.nextLine();
        System.out.println("Decrypted Password: " + manager.getPassword(answer));

    }
}
