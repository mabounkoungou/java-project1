import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InteractiveFrame extends JFrame {
    private JTextField nameField;
    private JComboBox<String> colorComboBox;
    private JTextArea outputArea;

    public InteractiveFrame() {
        setTitle("Interactive JFrame Application");
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Create and add components
        createComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createComponents() {
        // Top Panel
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("Enter your name:"));
        nameField = new JTextField(20);
        topPanel.add(nameField);

        topPanel.add(new JLabel("Choose a color:"));
        String[] colors = {"Red", "Green", "Blue"};
        colorComboBox = new JComboBox<>(colors);
        topPanel.add(colorComboBox);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        topPanel.add(submitButton);

        add(topPanel, BorderLayout.NORTH);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String color = (String) colorComboBox.getSelectedItem();
            outputArea.append("Hello, " + name + "! Your favorite color is " + color + ".\n");

            // Change background color based on selection
            switch (color) {
                case "Red":
                    outputArea.setBackground(Color.RED);
                    break;
                case "Green":
                    outputArea.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    outputArea.setBackground(Color.BLUE);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new InteractiveFrame();
    }
}
