import javax.swing.*;
import java.awt.event.*;

public class KeyStrokeGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Keystroke Detector:"); // Create a window
        JTextArea textArea = new JTextArea(); // Text area where you can type

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " +e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyChar());
            }
        });

        frame.add(textArea); // Add text area to the window
        frame.setSize(500, 400); // Set size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Make the window visible
    }
}
