import javax.swing.*;
import java.awt.*;
public class Components extends JFrame {
//a JFrame is an object that creates a GUI window
//several constructors
//default, one that takes a string(title)
//setSize(width, height)
//setTitle(title)
//setVisible(boolean b)
//setDefaultCloseOperation
//DECLARE VARIABLES
JButton startBTN;
JLabel firstNameLBL;
JTextField firstNameTF;
JTextArea commentsTA;
JScrollPane commentsSP;
JCheckBox freshmanCB, sophomoreCB, juniorCB, seniorCB;
JRadioButton maleRB, femaleRB;
ButtonGroup gender;
JComboBox yearCMB;
JList choicesLST;
JMenuBar exampleJMB;
JMenu fileM, editM, optionsM;
JMenuItem saveMI, openMI, cutMI, pasteMI, o1MI, o2MI, o3MI;
public Components()
{
//instantiate components
startBTN=new JButton("Click Me");  //JButtons also have a setText(string) method
firstNameLBL=new JLabel("Enter your first name:", SwingConstants.RIGHT);
firstNameTF=new JTextField(20);  //int param is number of chars
/* Textfield methods
 * JTextField(string) - creates textfield with default text
 * setText(string) - changes the text in a textfield
 * setEditable(boolean) - changes ability to enter information
 */
commentsTA=new JTextArea(4, 40); //rows, colums
/* TextArea Methods
 * JTextArea(string, rows, cols) - places default text in TA
 * setColumns(int) - sets the columns
 * setRows(int) - sets the rows
 * setText(string) - sets the text
 * append(string) - appends text to the text
 * setLineWrap(boolean) - allows for lines to wrap
 * setWrapStyleWord(boolean) - allows words to wrap
 */
commentsTA.setLineWrap(true);
commentsTA.setWrapStyleWord(true);
commentsSP=new JScrollPane(commentsTA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
freshmanCB=new JCheckBox("First Year", true);
sophomoreCB=new JCheckBox("Second Year");
juniorCB=new JCheckBox("Third Year");
seniorCB=new JCheckBox("Outta Here");
maleRB=new JRadioButton("Male", true);
femaleRB=new JRadioButton("Female");
gender=new ButtonGroup();
gender.add(maleRB);
gender.add(femaleRB);
String years[] = {"fresh", "soph", "jun", "sen"};
yearCMB=new JComboBox();
String choices[]={"Newspaper", "TV", "Radio", "Internet"};
choicesLST=new JList();
exampleJMB=new JMenuBar();
setJMenuBar(exampleJMB);  //adds the menubar to the JFrame menubar
fileM=new JMenu("File");
editM=new JMenu("Edit");
optionsM=new JMenu("Options");
//the menus now need to be added to the menu bar
exampleJMB.add(fileM);
exampleJMB.add(editM);
saveMI = new JMenuItem("Save");
openMI = new JMenuItem("Open");
cutMI = new JMenuItem("Cut");
pasteMI = new JMenuItem("Paste");
o1MI = new JMenuItem("Option 1");
o2MI = new JMenuItem("Option 2");
o3MI = new JMenuItem("Option 3");
fileM.add(openMI);
fileM.add(saveMI);
fileM.add(optionsM);
editM.add(cutMI);
editM.add(pasteMI);
optionsM.add(o1MI);
optionsM.add(o2MI);
optionsM.add(o3MI);
//create the container (pane) - REQUIRED
Container pane=getContentPane();
pane.setLayout(new GridLayout(4,4));
//add the components to the pane
pane.add(startBTN);
pane.add(firstNameLBL);
pane.add(firstNameTF);
pane.add(commentsSP);
pane.add(freshmanCB);
pane.add(sophomoreCB);
pane.add(juniorCB);
pane.add(seniorCB);
pane.add(maleRB);
pane.add(femaleRB);
pane.add(yearCMB);
pane.add(choicesLST);
//set the JFrame variables - REQUIRED
setTitle("GUI Components Intro");
setSize(400, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Components c = new Components();
}
}