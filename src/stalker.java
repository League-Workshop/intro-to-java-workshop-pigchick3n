import javax.swing.JOptionPane;

public class stalker {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hi "+name+" Answer all these questions to get a free Samsung Galaxy S8" );
	String ssn = JOptionPane.showInputDialog("What is your social security number?");
	String ccn = JOptionPane.showInputDialog("What is your credit card number?");
	String addr = JOptionPane.showInputDialog("What is your address?");
	JOptionPane.showMessageDialog(null,"is this correct? "+name+ssn+ccn+addr );

	JOptionPane.showMessageDialog(null,"Ha ha ha!!! "+name+"!!! "+"you just got trolled!!!" );

	
}
}
