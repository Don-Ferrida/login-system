import javax.swing.*;

public class LoginGUI {

    public static void main(String[] args) {

        LoginService service = new LoginService();

        JFrame frame = new JFrame("Login System");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();

        JButton loginBtn = new JButton("Login");
        JLabel result = new JLabel();

        userLabel.setBounds(30, 30, 100, 30);
        passLabel.setBounds(30, 70, 100, 30);

        userField.setBounds(120, 30, 120, 30);
        passField.setBounds(120, 70, 120, 30);

        loginBtn.setBounds(80, 120, 100, 30);
        result.setBounds(80, 160, 200, 30);

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginBtn);
        frame.add(result);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if(service.authenticate(user, pass)) {
                result.setText("Login Successful");
                new HomePage(); 
            } else {
                result.setText("Login Failed");
            }
        });

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}