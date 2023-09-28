package square;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JFrame implements ActionListener { // Extend JFrame to create a window
    int a;
    JPanel p; // Create a panel
    JLabel number; // Create a label
    JTextField input_number; // Create a text field
    JTextField result_number;
    JButton calculate;

    public Square() {
        p = new JPanel();
        number = new JLabel("Number");
        input_number = new JTextField(15);
        result_number = new JTextField(15);
        calculate = new JButton("calculate");
        p.setLayout(new FlowLayout());
        p.add(number);
        p.add(input_number);
        p.add(result_number);
        p.add(calculate);
        this.add(p);
        setTitle("square"); // Set the title of the JFrame
        setVisible(true);
        setSize(600 , 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculate.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calculate){
            a = Integer.parseInt(input_number.getText());
            result_number.setText(""+a*a);//transfer a to a string
        }
    }
}