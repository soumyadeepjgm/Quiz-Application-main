package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(780, 180, 390, 160);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(710, 300, 300, 30);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(660, 360, 120, 25);
        rules.setBackground(new Color(0, 0, 0));
        rules.setForeground(Color.RED);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(940, 360, 120, 25);
        back.setBackground(new Color(0, 0, 0));
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/game.png"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(140, 30, 300, 400);
        add(image2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/qubg.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(550, 30, 590, 220);
        add(image);
        setSize(1200, 500);
        setLocation(600, 350);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

