package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame f;
    JTextField d;
    int n1, n2; char op;

    Calculator() {
        f = new JFrame("Calculator");
        f.setLayout(new BorderLayout());

        // Top
        JPanel top = new JPanel(new GridLayout(1,2));
        top.add(new JLabel("CALCULATOR"));
        d = new JTextField();
        d.setFont(new Font("Arial", Font.BOLD, 20));
        top.add(d);
        f.add(top, BorderLayout.NORTH);

        // Buttons
        JPanel p = new JPanel(new GridLayout(5,4));
        String btns[] = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","=",
                "OFF"
        };

        for(String s: btns){
            JButton b = new JButton(s);
            b.addActionListener(this);
            p.add(b);
        }

        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if(s.matches("[0-9]")) d.setText(d.getText()+s);

        else if("+-*/%".contains(s)){
            n1 = Integer.parseInt(d.getText());
            op = s.charAt(0);
            d.setText("");
        }

        else if(s.equals("=")){
            n2 = Integer.parseInt(d.getText());
            switch(op){
                case '+': d.setText(""+(n1+n2)); break;
                case '-': d.setText(""+(n1-n2)); break;
                case '*': d.setText(""+(n1*n2)); break;
                case '/': d.setText(""+(n1/n2)); break;
                case '%': d.setText(""+(n1%n2)); break;
            }
        }

        else if(s.equals("OFF")) System.exit(0);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}