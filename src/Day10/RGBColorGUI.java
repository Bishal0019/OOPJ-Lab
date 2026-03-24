package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorGUI implements ActionListener {

    JFrame f;
    JComboBox<Integer> r, g, b;
    JButton btn;
    JPanel panel;

    RGBColorGUI() {
        f = new JFrame("RGB Color");
        f.setSize(350, 300);
        f.setLayout(null);

        Integer values[] = new Integer[256];
        for (int i = 0; i < 256; i++) values[i] = i;

        JLabel l1 = new JLabel("Red:");
        l1.setBounds(30, 30, 50, 25);
        r = new JComboBox<>(values);
        r.setBounds(100, 30, 80, 25);

        JLabel l2 = new JLabel("Green:");
        l2.setBounds(30, 70, 50, 25);
        g = new JComboBox<>(values);
        g.setBounds(100, 70, 80, 25);

        JLabel l3 = new JLabel("Blue:");
        l3.setBounds(30, 110, 50, 25);
        b = new JComboBox<>(values);
        b.setBounds(100, 110, 80, 25);

        btn = new JButton("Show Output");
        btn.setBounds(80, 160, 130, 30);
        btn.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(200, 30, 120, 150);

        f.add(l1); f.add(r);
        f.add(l2); f.add(g);
        f.add(l3); f.add(b);
        f.add(btn);
        f.add(panel);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int red = (int) r.getSelectedItem();
        int green = (int) g.getSelectedItem();
        int blue = (int) b.getSelectedItem();

        panel.setBackground(new Color(red, green, blue));
    }

    public static void main(String[] args) {
        new RGBColorGUI();
    }
}
