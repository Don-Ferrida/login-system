import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {

    public HomePage() {
        JFrame frame = new JFrame("Student Portal");

        JLabel title = new JLabel("Welcome to Student Portal");
        JLabel nameLabel = new JLabel("Student Name:");
        JLabel courseLabel = new JLabel("Course:");

        JLabel nameValue = new JLabel("Don Ferrida D");
        JLabel courseValue = new JLabel("Information Technology");

        JButton logoutBtn = new JButton("Logout");
        title.setBounds(40, 20, 250, 30);

        nameLabel.setBounds(30, 70, 120, 30);
        nameValue.setBounds(150, 70, 150, 30);

        courseLabel.setBounds(30, 110, 120, 30);
        courseValue.setBounds(150, 110, 150, 30);

        logoutBtn.setBounds(90, 160, 100, 30);
        title.setForeground(Color.BLUE); 

        nameLabel.setForeground(Color.BLACK);
        courseLabel.setForeground(Color.BLACK);

        nameValue.setForeground(Color.RED);
        courseValue.setForeground(Color.RED);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(title);
        frame.add(nameLabel);
        frame.add(nameValue);
        frame.add(courseLabel);
        frame.add(courseValue);
        frame.add(logoutBtn);
        logoutBtn.addActionListener(e -> {
            frame.dispose();
            new LoginGUI();
        });

        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}