package TestSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a text field
        JTextField textField = new JTextField(20);
        panel.add(new JLabel("TextField:"));
        panel.add(textField);

        // Create a text area
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);
        panel.add(new JLabel("TextArea:"));
        panel.add(textAreaScrollPane);

        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("CheckBox 1");
        JCheckBox checkBox2 = new JCheckBox("CheckBox 2");
        panel.add(new JLabel("CheckBoxes:"));
        panel.add(checkBox1);
        panel.add(checkBox2);

        // Create a list
        String[] listItems = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(listItems);
        JScrollPane listScrollPane = new JScrollPane(list);
        list.setVisibleRowCount(4);
        panel.add(new JLabel("List:"));
        panel.add(listScrollPane);

        // Create a button
        JButton button = new JButton("Click Me");
        panel.add(button);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "TextField: " + textField.getText() + "\n";
                message += "TextArea: " + textArea.getText() + "\n";
                message += "CheckBox 1: " + (checkBox1.isSelected() ? "Selected" : "Not Selected") + "\n";
                message += "CheckBox 2: " + (checkBox2.isSelected() ? "Selected" : "Not Selected") + "\n";
                message += "List: " + list.getSelectedValue() + "\n";
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu menu = new JMenu("Menuas");

        // Create menu items
//        JMenuItem menuItem1 = new JMenuItem("Ite");
//        JMenuItem menuItem2 = new JMenuItem("Item 2");

        // Add menu items to the menu
//        menu.add(menuItem1);
//        menu.add(menuItem2);

        // Add menu to the menu bar
        menuBar.add(menu);

        // Set the menu bar for the frame
       frame.setJMenuBar(menuBar);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
      frame.setVisible(true);
    }
}
