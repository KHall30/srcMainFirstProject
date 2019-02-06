package JobSelection;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Mass import from JobSelection package; All base job information;
import JobSelection.JobInformationIndex.JobAmazonData.*;
import JobSelection.JobInformationIndex.JobBanditData.*;
import JobSelection.JobInformationIndex.JobLancerData.*;
import JobSelection.JobInformationIndex.JobSorcererData.*;
import JobSelection.JobInformationIndex.JobWitchData.*;
import LogInPane.*; // to return to login screen;
import JobSelection.*; // dont know if needed;

  public class JobSelectionGUI{

  private JPanel leftPane = new JPanel();
  private JPanel rightPane = new JPanel();
  private JRadioButton jobA;
  private JRadioButton jobB;
  private JRadioButton jobL;
  private JRadioButton jobS;
  private JRadioButton jobW;
  private ButtonGroup bGroup;
  private JTextField showSelectedText;
  private Container container;
//  private JLabel logInCharacterName = new JLabel();
//  private JTextField userCharacterName = new JTextField();
//  private JButton logInAccept = new JButton("Accept");
//  private JButton logInBack = new JButton("Back");
//  private JTextArea jobSelectedInformation = new JTextArea();

  public JobSelectionGUI(){

  leftPane.setLayout(new GridBagLayout());
  GridBagConstraints c = new GridBagConstraints();

  JTextArea firstGameIntroduction = new JTextArea("Hello and WELCOME to my first text game! We will start our adventure in a far away land...Too far to even fathom...\nYikes...\nThis is just the introduction; so get comfortable and loose.");
    firstGameIntroduction.setLineWrap(true);
    firstGameIntroduction.setWrapStyleWord(true);
    firstGameIntroduction.setEnabled(false);
    JScrollPane areaScrollPane = new JScrollPane(firstGameIntroduction);
    areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    areaScrollPane.setPreferredSize(new Dimension(250, 150));
    areaScrollPane.setBorder(
      BorderFactory.createCompoundBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Introduction"),
        BorderFactory.createEmptyBorder(5,5,5,5)),
      areaScrollPane.getBorder()));
    c.gridx = 0;
    c.gridy = 0;
    leftPane.add(areaScrollPane, c);

  JTextArea descriptionIntroduction = new JTextArea("There are currently 5 jobs to choose from. Each job starts with different attributes that make them unique.\nAn example would be a Lancer has high base STR/STAM but low INT.\nHowever, Bandits have high base SPEED/LUCK with low STR.\n" + "Selecting a job will bring you to their information page where you can see their backstory and primary attributes.\n");
    descriptionIntroduction.setLineWrap(true);
    descriptionIntroduction.setWrapStyleWord(true);
    descriptionIntroduction.setEnabled(false);
    JScrollPane areaScrollPaneTwo = new JScrollPane(descriptionIntroduction);
    areaScrollPaneTwo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    areaScrollPaneTwo.setPreferredSize(new Dimension(250, 200));
    areaScrollPaneTwo.setBorder(
      BorderFactory.createCompoundBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("What to expect"),
        BorderFactory.createEmptyBorder(5,5,5,5)),
      areaScrollPaneTwo.getBorder()));
    c.gridx = 0;
    c.gridy = 1;
    leftPane.add(areaScrollPaneTwo, c);

    c.gridx = 3;
    c.gridy = 0;
    jobA = new JRadioButton("Amazon Job", true);
    leftPane.add(jobA);
    c.gridy++;
    jobB = new JRadioButton("Bandit Job", false);
    leftPane.add(jobB);
    c.gridy++;
    jobL = new JRadioButton("Lancer Job", false);
    leftPane.add(jobL);
    c.gridy++;
    jobS = new JRadioButton("Sorcerer Job", false);
    leftPane.add(jobS);
    c.gridy++;
    jobW = new JRadioButton("Witch Job", false);
    leftPane.add(jobW);
    c.gridy++;

    c.gridx = 0;
    c.gridy = 0;
    bGroup = new ButtonGroup();
    bGroup.add(jobA);
    bGroup.add(jobB);
    bGroup.add(jobL);
    bGroup.add(jobS);
    bGroup.add(jobW);

      JTextArea daBong = new JTextArea("Amazon Job Introduction");
    daBong.setLineWrap(true);
    daBong.setWrapStyleWord(true);
    daBong.setEnabled(false);
    JScrollPane daBongg = new JScrollPane(daBong);
    daBongg.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    daBongg.setPreferredSize(new Dimension(250, 150));
    daBongg.setBorder(
      BorderFactory.createCompoundBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Introduction"),
        BorderFactory.createEmptyBorder(5,5,5,5)),
      daBongg.getBorder()));

    leftPane.add(daBongg, c);

  jobA.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      if(jobA.isSelected()){

        JobAmazonData xx = new JobAmazonData();
        xx.amazonBaseStats();
        leftPane.add(jobA);
    }
  }
});
  jobB.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      if(jobB.isSelected()){
        JobBanditData.banditBaseStats();
        leftPane.add(jobB);
    }
  }
});
  jobL.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      if(jobL.isSelected()){
        JobLancerData.lancerBaseStats();
        leftPane.add(jobL);
    }
  }
});
  jobS.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      if(jobS.isSelected()){
        JobSorcererData.sorcererBaseStats();
        leftPane.add(jobS);
    }
  }
});
  jobW.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
      if(jobW.isSelected()){
        JobWitchData.witchBaseStats();
        leftPane.add(jobW);
      }
    }
  });
}

  public void jobSelectionReference(){
    jobSelectionJFrameGUI();
}

  private void jobSelectionJFrameGUI(){
      JFrame frame = new JFrame("FirstProject");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1080, 720);
      frame.setResizable(false);
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);
      frame.getContentPane().add(leftPane);
  }
}