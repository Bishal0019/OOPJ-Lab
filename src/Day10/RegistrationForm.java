package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args){
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,2));

        JLabel namelabel = new JLabel("Enter Name: ");
        frame.add(namelabel);
        JTextField namefield = new JTextField(20);
        frame.add(namefield);

        JLabel addressLabel = new JLabel("Enter Address");
        frame.add(addressLabel);
        JTextArea addressArea = new JTextArea(3,30);
        frame.add(addressArea);

        JLabel gender = new JLabel("Select Gender: ");
        frame.add(gender);
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        JPanel langPanel = new JPanel();
        langPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel course =  new JLabel("Select Languages: ");
        frame.add(course);
        JCheckBox py = new JCheckBox("Python");
        JCheckBox c = new JCheckBox("C");
        JCheckBox cpp = new JCheckBox("C++");
        JCheckBox java = new JCheckBox("Java");
        langPanel.add(py);
        langPanel.add(c);
        langPanel.add(cpp);
        langPanel.add(java);
        frame.add(langPanel);

        JButton submit = new JButton("Submit");
        frame.add(submit);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = namefield.getText();
                String address = addressArea.getText();

                String genderSelected = "";
                if(male.isSelected())
                    genderSelected = "Male";
                else if(female.isSelected())
                    genderSelected = "Female";

                String languages = "";
                if(py.isSelected()) languages += "Python ";
                if(c.isSelected()) languages += "C ";
                if(cpp.isSelected()) languages += "C++ ";
                if(java.isSelected()) languages += "Java ";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name +
                                "\nAddress: " + address +
                                "\nGender: " + genderSelected +
                                "\nLanguages: " + languages);
            }
        });

        ImageIcon image = new ImageIcon("images (1).png");
        JLabel piclabel = new JLabel(image);
        frame.add(piclabel);

        frame.pack();
        frame.setVisible(true);
    }
}