import javax.swing.*;
public class Simple {
	JFrame f;
	Simple(){
		f = new JFrame(); //Creating instance of JFrame
		JButton b1 = new JButton("Click");//Creating instance of JButton
		b1.setBounds(10,100,100,40);
		b1.setText("Why??");
		f.add(b1);
		f.setSize(400,500);//400 widht and 500 height
		f.setLayout(null);//using no layout manager
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Simple(); 
	}

}
