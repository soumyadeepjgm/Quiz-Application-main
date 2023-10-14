package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to QUBG");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.BOLD, 10));
        rules.setForeground(Color.WHITE);
        rules.setText(
            "<html>"+ 
                "1. Welcome to the Quiz: Get ready for a fun and exciting quiz adventure!" + "<br><br>" +
                "2. Listen Up: Pay attention to the questions – we're asking interesting stuff." + "<br><br>" +
                "3. Click to Answer: Use your mouse or tap the screen to choose your answer." + "<br><br>" +
                "4. Wait Your Turn: Be patient and take your turn to answer – everyone gets a chance." + "<br><br>" +
                "5. Take a Guess: If you're not sure, make a guess – you might just get it right!" + "<br><br>" +
                "6. One Answer Only: Each question has only one correct answer, so choose wisely." + "<br><br>" +
                "7. Be Friendly: Be nice to everyone playing, and encourage each other." + "<br><br>" +
                "8. No Cheating: Don't use books or search online – rely on what you know." + "<br><br>" +
                "9. Have a Blast: Enjoy yourself and have a blast while you're learning cool things." + "<br><br>"+
                "10. Learning is Super: Every question you tackle helps you learn and feel super smart!"+ "<br><br>"+
                 "Get set for the quiz, have a blast, and discover new things – it's a journey of fun and learning!"+ "<br><br>"+
                    "- Read each question carefully." + "<br><br>"+
                    "- Try to answer as many questions as you can!" + "<br><br>"+
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.RED);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
