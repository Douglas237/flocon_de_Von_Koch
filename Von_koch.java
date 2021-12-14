import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.Line2D;

public class Von_koch {
	public  static void von_koch(Point [] tab , int n,Graphics2D g){
		int i,j;
		for (i=0;i<(tab.length)-1 ;i++ ) {
			if (n==1) {
				draws(tab,g);
			}
			else
			{
				Point [] tabc=new Point[2];
				tabc[0]=tab[i];
				tabc[1]=tab[i+1];
				von_koch(Construir_chapeau.chapeau(tabc),n-1,g);
			}
			try {
					Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void draws(Point [] tab , Graphics2D g3){
		int i;
		for (i=0;i<(tab.length)-1 ;i++ ) {
			g3.draw (new Line2D.Double(tab[i].getX(), tab[i].getY(), tab[i+1].getX(), tab[i+1].getY()));
		}
	}
	public static Point [] triangle(Point [] tab){
		Point p = new Point();
		Point [] t=new Point [4];
		t[0]=tab[0];
		t[1]=tab[1];
		t[2]= Point.rotation(t[0],t[1],Math.PI/3);
		t[3]=tab[0];

		return t;
	}

}