import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class KeyLoggerApp extends JFrame implements KeyListener {
    private JTextArea textArea;
    private static final String LOG_FILE = "keystroke_log.txt"; // Save in current project directory

    public KeyLoggerApp() {
        setTitle("Keystroke Logger");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.addKeyListener(this);
        add(new JScrollPane(textArea));

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        logKey(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Optional: you can add logic if needed
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional: you can add logic if needed
    }

    private void logKey(char keyChar) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bw.write("Key Typed: " + keyChar);
            bw.newLine();

            if (textArea.getText().contains("123456") || textArea.getText().contains("admin")) {
                bw.write("Suspicious pattern detected!!!");
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KeyLoggerApp::new);
    }
}
