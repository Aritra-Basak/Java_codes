import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Welcome to GUI of Eclipse");
	String name = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "Hello "+name);
	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
	JOptionPane.showMessageDialog(null, name+" your age is : "+age);
	int date = Integer.parseInt(JOptionPane.showInputDialog("Enter your birthday date"));
	String month = JOptionPane.showInputDialog("Enter your birthday month in words");
	JOptionPane.showMessageDialog(null, "Your birthday is on : "+date+"th "+month);
	double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
	JOptionPane.showMessageDialog(null, "You are "+height+" feet tall");

	}

}
