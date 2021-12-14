import java.util.*;

public class Point {
	private double x;
	private double y;

	public Point (double a,double b){
		this.x=a;
		this.y=b;
	}
	public Point (){
		x=0;
		y=0;
	}
	public Point(Point a){
		this.x=a.getX();
		this.y=a.getY();
	}

	public static double distance(Point p1,Point p2){
		double d=0;
		d=Math.sqrt((Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)));
		return d;
	}
	public String toString(){
		return ("("+x+","+y+")");
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public void setX(double a){
		this.x=a;
	}
	public void setY(double b){
		this.y=b;
	}
	public static Point rotation(Point c ,Point p,double an){
		Point pr=new Point();
		if ((c.getY())!=(p.getY())) {
			if (((c.getX())>(p.getX())) && (((c.getY())>(p.getY())))) {
				double cos,sin,xe,ye;
				cos = Math.toDegrees(Math.toRadians((Math.cos(an))));
	    		sin = Math.toDegrees(Math.toRadians((Math.sin(an))));
				xe=(((p.getX()-c.getX())*cos)-(((p.getY()-c.getY())*sin))+c.getX());
				ye=(c.getY());
				pr.setX(xe);
				pr.setY(ye);
			}
			else if(((c.getX())>(p.getX())&&((c.getY())<(p.getY())))){
				double cos,sin,xe,ye;
				cos = Math.toDegrees(Math.toRadians((Math.cos(an))));
	    		sin = Math.toDegrees(Math.toRadians((Math.sin(an))));
				xe=(((p.getX()-c.getX())*cos)-(((p.getY()-c.getY())*sin))+c.getX());
				ye=(p.getY());
				pr.setX(xe);
				pr.setY(ye);
			}
			else if (((c.getX())<(p.getX()))&&(((c.getY())>(p.getY())))) {
				double cos,sin,xe,ye;
				cos = Math.toDegrees(Math.toRadians((Math.cos(an))));
	    		sin = Math.toDegrees(Math.toRadians((Math.sin(an))));
				xe=(((p.getX()-c.getX())*cos)-(((p.getY()-c.getY())*sin))+c.getX());
				ye=(p.getY());
				pr.setX(xe);
				pr.setY(ye);
			}
			else if (((c.getX())<(p.getX()))&&((c.getY())<(p.getY()))) {
				double cos,sin,xe,ye;
				cos = Math.toDegrees(Math.toRadians((Math.cos(an))));
	    		sin = Math.toDegrees(Math.toRadians((Math.sin(an))));
				xe=(((p.getX()-c.getX())*cos)-(((p.getY()-c.getY())*sin))+c.getX());
				ye=(c.getY());
				pr.setX(xe);
				pr.setY(ye);
			}
		}
		else
		{
			double cos,sin,xe,ye;
			cos = Math.toDegrees(Math.toRadians((Math.cos(an))));
	    	sin = Math.toDegrees(Math.toRadians((Math.sin(an))));
			xe=(((p.getX()-c.getX())*cos)-(((p.getY()-c.getY())*sin))+c.getX());
			ye=(((p.getX()-c.getX())*sin)-(((p.getY()-c.getY())*cos))+c.getY());
			pr.setX(xe);
			pr.setY(ye);	
		}

		return pr;
	}
	public static Point[] rotation2(Point[] tab){
		Point p=new Point();
		Point p1=new Point();
		Point [] t=new Point [4];
		t[0]=tab[1];
		p1.setX(((tab[1].getX())*2)-(tab[0].getX()));
		p1.setY(t[0].getY());
		t[1]=p1;
		t[2]=rotation(t[0],t[1],Math.PI/3);
		t[3]=t[0];

		return t;
	}
}