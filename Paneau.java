import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Paneau extends JPanel {
	public static  Graphics2D g4;
	public  void paintComponent(Graphics g)
    {   
    	Point [] tri=new Point[4];
    	g4=(Graphics2D)g;
    	g4.setColor (Color.blue);
    	Point [] tab={new Point(70,200),new Point(200,200)};
    	tri=Von_koch.triangle(tab);
    	Paneau.freez(tri,5,g4);
    }
    	public static void freez(Point [] tab,int n,Graphics2D g){
		int i;
		Point [][] t=new Point[n][4];
		t[0]=Point.rotation2(tab);
		for (i=1;i<n ;i++ ) {
			t[i]=Point.rotation2(t[i-1]);
		}
		for (i=0;i<n ;i++ ) {
			Von_koch.von_koch(t[i],4,g);
		}
	}
		
}