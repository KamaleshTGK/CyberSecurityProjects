import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class RealTimeCertReader {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter HTTPS URL (e.g., https://www.example.com): ");
            String httpsUrl = sc.nextLine();
          
            URL url = new URL(httpsUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.connect();

            System.out.println("Connected to: " + httpsUrl);
            Certificate[] certs = conn.getServerCertificates();

            for (Certificate cert : certs) {
                if (cert instanceof X509Certificate) {
                    X509Certificate x509 = (X509Certificate) cert;

                    System.out.println("\nCertificate Info:");
                    System.out.println("Subject: " + x509.getSubjectX500Principal());
                    System.out.println("Issuer: " + x509.getIssuerX500Principal());
                    System.out.println("Valid from: " + x509.getNotBefore());
                    System.out.println("Valid to: " + x509.getNotAfter());

                    //Validate certificate Expiry
                    try {
                        x509.checkValidity();
                        System.out.println("✅ Certificate is VALID.");
                    } catch (Exception e){
                        System.out.println("❌ Certificate is INVALID: " + e.getMessage());
                    }

                }
            }

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
