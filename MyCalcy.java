import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyCalcy extends WindowAdapter implements WindowListener,ActionListener
{
JFrame f;
JTextField tf;
String op1,op2,op;
JPanel p1,p2;
int k;
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
MyCalcy()
{
f=new JFrame("Kuldeep");
f.addWindowListener(this);
tf=new JTextField(100);
tf.setForeground(Color.red);
tf.setFont(new Font("Algerian",3,35));
p1=new JPanel();
p2=new JPanel();
b0=new JButton("Clear");
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("+");
b5=new JButton("4");
b6=new JButton("5");
b7=new JButton("6");
b8=new JButton("-");
b9=new JButton("7");
b10=new JButton("8");
b11=new JButton("9");
b12=new JButton("*");
b13=new JButton(".");
b14=new JButton("0");
b15=new JButton("=");
b16=new JButton("/");

b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
p2.setLayout(new GridLayout(1,2));
p2.add(tf);
p2.add(b0);
f.add(p2,BorderLayout.NORTH);
f.add(p1,BorderLayout.CENTER);
p1.setLayout(new GridLayout(4,4));
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b10);
p1.add(b11);
p1.add(b12);
p1.add(b13);
p1.add(b14);
p1.add(b15);
p1.add(b16); 
f.setVisible(true);
f.setSize(300,400);
f.setResizable(false);
}
public static void main(String ar[])
{
MyCalcy mc=new MyCalcy();
}
public void windowClosing(WindowEvent e)
{
int a=JOptionPane.showConfirmDialog(null,"Are u Sure");
if(a==0)
f.dispose();
}
public void actionPerformed(ActionEvent e)
{
JButton bt=(JButton)e.getSource();
if(bt==b1||bt==b2 || bt==b3 || bt==b5 || bt==b6 || bt==b7 || bt==b9 || bt==b10 || bt==b11 || bt==b13 || bt==b14)
{
	if(k==0)
	{
	tf.setText(bt.getLabel());
	k=1;
	}
	else
	{
	tf.setText(tf.getText()+bt.getLabel());
	}

}
if(bt==b4||bt==b8||bt==b12||bt==b16)
{
	if(op!=null)
	{
	op2=tf.getText();
	calculate(op1,op2,op);
	}
	op1=tf.getText();
	op=bt.getLabel();
	tf.setText(null);
	k=0;
}
if(bt==b15)
	{
	op2=tf.getText();
	calculate(op1,op2,op);
	op=null;          
	}
if(bt==b0)
{
tf.setText(null);
op1=op2=op=null;
}

}
void calculate(String op1,String op2,String op)
	{
	float x,y,z;
	x=Float.parseFloat(op1);
	y=Float.parseFloat(op2);
	if(op.equals("+"))
	z=x+y;
	else if(op.equals("-"))
	z=x-y;
	else if(op.equals("*"))
	z=x*y;
	else
	z=x/y;
	tf.setText(""+z);
	}


}



