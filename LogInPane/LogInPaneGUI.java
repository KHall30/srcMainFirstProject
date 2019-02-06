package LogInPane; // package name;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import JobSelection.*; //import for next GUI when LogInButton is clicked;

public class LogInPaneGUI{

  private final JFrame frame = new JFrame("FirstProject");
  private final int COLS = 10; // Max columns;
  private final JPanel panelForm = new JPanel(new GridBagLayout()); // layout
  private final JTextField fieldLogInName = new JTextField(COLS); //login
  private final JPasswordField logInPassword = new JPasswordField(COLS); //pw
  private final JButton logInButton = new JButton("Log In"); //login button
  private final JButton exitButton = new JButton("EXIT"); //system.exit button
  private final JButton newUser = new JButton("New User? Click here to sign up!"); // new user button
// Wigits on login page;
  public LogInPaneGUI(){
  GridBagConstraints c = new GridBagConstraints();
// Creates the panel that goes ontop of the JFrame;

  c.gridx = 0;
  c.gridy = 0;
  c.weighty = 0.0;
  c.weightx = 0.0;
    c.anchor = GridBagConstraints.CENTER;
    c.insets = new Insets(300,400,0,0);
      panelForm.add(new JLabel("Account Name: "), c);
  c.weighty = 0.1;
  c.weightx = 0.0;
        c.gridy ++;
    c.insets = new Insets(0,430,0,0);
    panelForm.add(new JLabel("Password: "), c);

  c.gridx = 1;
  c.gridy = 0;
  c.weighty = 0.0;
  c.weightx = 0.0;
    c.anchor = GridBagConstraints.LINE_START;
    c.insets = new Insets(300,0,0,0);
        panelForm.add(fieldLogInName, c);
  c.weighty = 0.1;
  c.weightx = 0.0;
           c.gridy++;
    c.insets = new Insets(0,0,0,0);
        panelForm.add(logInPassword, c);

  c.gridx = 1;
  c.gridy = 2;
  c.weighty = 0.1;
  c.weightx = 0.0;
    c.insets = new Insets(0,0,0,0);
      c.anchor = GridBagConstraints.LINE_START;
        panelForm.add(logInButton, c);

  c.gridx = 1;
  c.gridy = 3;
  c.weighty = 0.2;
  c.weightx = 0.0;
  c.fill = GridBagConstraints.HORIZONTAL;
  c.gridwidth = 2;
  c.ipady = 30;
    c.insets = new Insets(0,0,0,0);
      c.anchor = GridBagConstraints.LINE_END;
        panelForm.add(newUser, c);

  c.gridx = 3;
  c.gridy = 4;
  c.weighty = 0.2;
  c.weightx = 0.2;
  c.fill = GridBagConstraints.HORIZONTAL;
  c.gridwidth = 2;
  c.ipady = 10;
  c.insets = new Insets(0,0,0,0);
    c.anchor = GridBagConstraints.LAST_LINE_END;
        panelForm.add(exitButton, c);

// Goes to fourm/website on newUser click;
  newUser.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      System.out.println("Fourm/Website to sign up for game");
    }
  });
// Exits program on exitButton click;
  exitButton.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      System.exit(0);
    }
  });
// Goes to JobSelectionGUI on logInButton Click;
  logInButton.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
    JobSelectionGUI jobSelecting = new JobSelectionGUI();
    jobSelecting.jobSelectionReference();
    frame.dispose();
    }
  });
}
  public void logInFromHere(){
    logInPaneMainGUI();
  }
// Actual JFrame that everything goes ontop of;
  private void logInPaneMainGUI(){

    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(1080, 720);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.getContentPane().add(panelForm);
  }
}