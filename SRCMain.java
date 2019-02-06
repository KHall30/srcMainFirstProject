package com.hallquist.kurtis.leigh.srcmain;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.text.*;

// Class imports;
// import  GameIntroduction.*;
// import  PlayerRegistrationInformation.*;
import JobSelection.*;
import LogInPane.*;

// My Main function. Used to pull packages and methods and complie them here;
public class SRCMain{
  public static void main(String[] args){

    LogInPaneGUI logInGUI = new LogInPaneGUI();
    logInGUI.logInFromHere();
/*
    JobSelectionGUI jobSelecting = new JobSelectionGUI();
    jobSelecting.jobSelectionJFrameGUI();
*/
  }
}
/*
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        JFrame frame = new JFrame();
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
      }
    });
*/

/*
  private JPanel mainPane = new JPanel();
  private CardLayout card = new CardLayout();
  private JButton btn1=new JButton("Show second");
  private JButton btn2=new JButton("Show First");
    mainPane.setLayout(card);
    mainPane.add(leftPane, "one"); // id one refers panelOne
    mainPane.add(rightPane, "two"); // id two refers panelTwo
    leftPane.add(new JLabel("first panel"));
    leftPane.add(btn1);
    card.show(mainPane, "one");
    btn1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
    card.show(mainPane, "two"); // shows panelTwo
    }
});
  rightPane.add(new JLabel("second panel"));
    rightPane.add(btn2);
    btn2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
    card.show(mainPane, "one"); // shows panelOne
  }
});
*/
/*
BorderPane border = new BorderPane();
HBox hbox = addHBox()
border.setTop(hbox);
border.setLeft(addVBox());
addStackPane(hbox);         // Add stack to HBox in top region
border.setCenter(addGridPane());
border.setRight(addFlowPane());
*/