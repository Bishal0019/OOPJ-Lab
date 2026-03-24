package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorListGUI implements ActionListener {

    JFrame f;
    JList<String> list;
    JButton b;
    JPanel p;

    ColorListGUI() {
        f = new JFrame("Color Changer");
        f.setSize(300, 300);
        f.setLayout(null);

        String colors[] = {"Red", "Green", "Blue", "Yellow"};
        list = new JList<>(colors);
        list.setBounds(30, 30, 100, 80);

        b = new JButton("Change Color");
        b.setBounds(30, 130, 140, 30);
        b.addActionListener(this);

        p = new JPanel();
        p.setBounds(150, 30, 100, 150);

        f.add(list);
        f.add(b);
        f.add(p);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String c = list.getSelectedValue();

        if (c != null) {
            if (c.equals("Red")) p.setBackground(Color.RED);
            else if (c.equals("Green")) p.setBackground(Color.GREEN);
            else if (c.equals("Blue")) p.setBackground(Color.BLUE);
            else if (c.equals("Yellow")) p.setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new ColorListGUI();
    }
}
