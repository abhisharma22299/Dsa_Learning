package TestSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BackgroundChangeSwingDemo extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public BackgroundChangeSwingDemo() {
        // Create a JPanel
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        // Create a JButton
        button = new JButton("Click Me");
        button.addActionListener(this);
        
        // Create a JLabel
        label = new JLabel();
        
        // Add button and label to panel
        panel.add(button);
        panel.add(label);
        
        // Add panel to the frame
        add(panel);
        
        // Frame settings
        setTitle("Swing Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent e) {
        // Change background color
        panel.setBackground(Color.YELLOW);
        
        // Display message
        label.setText("Welcome to Java Swing");
    }

    public static void main(String[] args) {
        BackgroundChangeSwingDemo frame = new BackgroundChangeSwingDemo();
        frame.setVisible(true);
    }
}
