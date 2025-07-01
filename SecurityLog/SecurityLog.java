import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;



public class SecurityLog {
    static void SecurityLogArrayList() {
        List<String> securityLogs = new ArrayList<>();

        securityLogs.add("Login attempt by user: admin");
        securityLogs.add("File accessed: secret.txt");
        securityLogs.add("User logout: admin");

        System.out.println("Security Logs: ");
        for (String log : securityLogs) {
            System.out.println(log);
        }
    }

    static void SecurityLinkedList() {
        LinkedList<String> logs = new LinkedList<>();

        logs.add("User1 logged in");
        logs.add("User2 failed login");
        logs.addFirst("System booted"); // inserted at beginning

        logs.addLast("User1 performed data export"); // added at end

        System.out.println("Security Logs (LinkedList):");
        for (String log : logs) {
            System.out.println(log);
        }
    }

    public static void main(String[] args) {
        SecurityLogArrayList();
        System.out.println("--------------");
        SecurityLinkedList();
    }
}
