package Day10;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {

    JFrame f;
    JTextField t1, t2, t3;
    JButton add, sub, mul, reset;

    CalculatorGUI() {
        f = new JFrame("Calculator");
        f.setSize(350, 300);
        f.setLayout(null);

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(30, 30, 120, 25);
        t1 = new JTextField();
        t1.setBounds(160, 30, 120, 25);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(30, 70, 120, 25);
        t2 = new JTextField();
        t2.setBounds(160, 70, 120, 25);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(30, 110, 120, 25);
        t3 = new JTextField();
        t3.setBounds(160, 110, 120, 25);
        t3.setEditable(false);

        add = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Mul");
        reset = new JButton("Reset");

        add.setBounds(30, 160, 70, 30);
        sub.setBounds(110, 160, 70, 30);
        mul.setBounds(190, 160, 70, 30);
        reset.setBounds(110, 200, 80, 30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(reset);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            if (e.getSource() == add)
                t3.setText(String.valueOf(a + b));
            else if (e.getSource() == sub)
                t3.setText(String.valueOf(a - b));
            else if (e.getSource() == mul)
                t3.setText(String.valueOf(a * b));
            else if (e.getSource() == reset) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        } catch (Exception ex) {
            t3.setText("Invalid");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
