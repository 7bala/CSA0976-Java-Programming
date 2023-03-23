import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class myframe extends JFrame implements Runnable
{
	JLabel l;
	Thread t;
	int c;
	public myframe()
	{
		l=new JLabel("AI&DS");
		this.getContentPane().setLayout(null);
		l.setBounds(300,200,250,50);
		this.getContentPane().add(l);
		Font f=new Font("Times New Roman",Font.BOLD,50);
		l.setFont(f);
		t=new Thread(this,"sri");
		t.start();
		c=1;
	}
	public void run()
	{
		while(true)
		{
			if(c==1)
			{
				Color x=Color.RED;
				l.setForeground(x);
			}
			if(c==2)
			{
				Color x=Color.PINK;
				l.setForeground(x);
			}
			if(c==3)
			{
				Color x=Color.ORANGE;
				l.setForeground(x);
			}
			if(c==4)
			{
				Color x=Color.YELLOW;
				l.setForeground(x);
			}
			if(c==5)
			{
				Color x=Color.GREEN;
				l.setForeground(x);
			}
			if(c==6)
			{
				Color x=Color.MAGENTA;
				l.setForeground(x);
			}
			if(c==7)
			{
				Color x=Color.CYAN;
				l.setForeground(x);
			}
			if(c==8)
			{
				Color x=Color.BLUE;
				l.setForeground(x);
			}
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ie){}
			++c;
			if(c>8)
			{
				c=1;
			}
		}
	}
}
class myapp
{
	public static void main(String arg[])
	{
		myframe f=new myframe();
		f.show();
	}
}