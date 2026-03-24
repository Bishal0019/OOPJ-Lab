package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringGUI extends JFrame implements ActionListener {

    JTextField t1 = new JTextField(), t2 = new JTextField();

    StringGUI() {
        setTitle("My Frame");
        setSize(700,400);
        setLayout(null);
        getContentPane().setBackground(new Color(230,150,150));

        add(lbl("Enter the string:",120,80));
        t1.setBounds(250,80,250,25); add(t1);

        add(lbl("String in upper case:",120,130));
        t2.setBounds(250,130,250,25); add(t2);

        String b[] = {"IN CAPS","IN SMALL","REVERSE","VOWELS",
                "CONVERT CASE","WORDS","LETTERS","FREQUENCY","BEGIN CAPS"};

        int x=40;
        for(String s:b){
            JButton btn=new JButton(s);
            btn.setBounds(x,200,110,30);
            btn.addActionListener(this);
            add(btn);
            x+=120;
        }

        JButton reset=new JButton("RESET");
        reset.setBounds(300,270,100,30);
        reset.addActionListener(this);
        add(reset);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JLabel lbl(String s,int x,int y){
        JLabel l=new JLabel(s);
        l.setBounds(x,y,150,25);
        return l;
    }

    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand(), str=t1.getText();

        switch(s){
            case "IN CAPS": t2.setText(str.toUpperCase()); break;
            case "IN SMALL": t2.setText(str.toLowerCase()); break;

            case "REVERSE":
                t2.setText(new StringBuilder(str).reverse()+""); break;

            case "VOWELS":
                int v=0;
                for(char c:str.toLowerCase().toCharArray())
                    if("aeiou".indexOf(c)!=-1) v++;
                t2.setText("Vowels = "+v); break;

            case "WORDS":
                t2.setText("Words = "+str.trim().split("\\s+").length); break;

            case "LETTERS":
                t2.setText("Letters = "+str.length()); break;

            case "CONVERT CASE":
                String r="";
                for(char c:str.toCharArray())
                    r+=Character.isUpperCase(c)?Character.toLowerCase(c):Character.toUpperCase(c);
                t2.setText(r); break;

            case "FREQUENCY":
                int f=0;
                for(char c:str.toLowerCase().toCharArray())
                    if(c=='a') f++;
                t2.setText("Frequency of 'a' = "+f); break;

            case "BEGIN CAPS":
                String res="";
                for(String w:str.split(" "))
                    res+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
                t2.setText(res); break;

            case "RESET":
                t1.setText(""); t2.setText(""); break;
        }
    }

    public static void main(String[] args) {
        new StringGUI();
    }
}