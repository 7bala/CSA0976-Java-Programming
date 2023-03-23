import java.awt.*;
import java.applet.*;
/*
<applet code="AnimationEx.class" width="800" height="1000">
</applet>
*/
public class AnimationEx extends Applet
{
	Image pic;
	public void init()
	{
		pic=getImage(getDocumentBase(),"car.jpeg");
	}
	public void paint(Graphics grp)
	{
		for(int i=50;i<100;i++)
		{
			grp.drawImage(pic,i,30,this);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e){}
		}
	}
}