import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class EventHandlingApplet extends Applet implements ActionListener
{
	Button button;
    	String message;
    	public void init() 
	{
        	button = new Button("Click me!");
        	add(button);
        	button.addActionListener(this);
        	message = "";
    	}
	public void actionPerformed(ActionEvent event) 
	{
        	if (event.getSource() == button) 
		{
            	message = "Hello, world!";
        	}
        	repaint();
    	}
    	public void paint(Graphics g) 
	{
        	g.drawString(message, 50, 50);
    	}
    	public static void main(String[] args) 
	{
        	EventHandlingApplet applet = new EventHandlingApplet();
        	applet.init();
        	Frame frame = new Frame("My Applet");
        	frame.add(applet);
        	frame.pack();
        	frame.addWindowListener(new WindowAdapter() 
		{
            	public void windowClosing(WindowEvent event) 
			{
                		System.exit(0);
            	}
        	});
        	frame.setVisible(true);
    	}
}
