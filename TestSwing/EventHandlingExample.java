package TestSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Event Handling Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Create a button
        JButton button = new JButton("Click Me");

        // Create a label
        JLabel label = new JLabel("Button not clicked");

        // Add the button and label to the panel
        panel.add(button);
        panel.add(label);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the label when the button is clicked
                label.setText("Button clicked!");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
