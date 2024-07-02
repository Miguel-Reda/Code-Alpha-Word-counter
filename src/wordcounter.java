import com.sun.jdi.PrimitiveValue;

import javax.swing.*;

public class wordcounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);
        JButton button = new JButton("Count Words");
        button.setBounds(50, 100, 200, 30);
        frame.add(button);
        JLabel label = new JLabel();
        label.setBounds(50, 150, 200, 30);
        frame.add(label);
        button.addActionListener(e -> {
            label.setText("Words: " + counter(textField.getText()));
        });

    }


    static int counter(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }


}
