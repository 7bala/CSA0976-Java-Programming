class Box
{
	double width,height,depth;
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return(width*height*depth);
	}
}
class Boxdemo
{
	public static void main(String arg[])
	{	
		Box b1=new Box(10.2,20.3,30.2);
		System.out.println("Volume of box :"+b1.volume());
	}
}