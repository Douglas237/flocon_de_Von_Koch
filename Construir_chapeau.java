import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Construir_chapeau {
	public static void main(String[] args) {
		Construction test1 = new Construction() ;
        test1.setVisible(true) ;
	}
	public static  Point []chapeau(Point tab[]){
	  Point [] tabr = new Point[5];
	  int i;
	  double a,b,c,xe,ye,sin,cos;
	  Point p1=new Point();
	  Point p2=new Point();
	  Point p3=new Point();
	   tabr[0]=tab[0];
	   tabr[4]=tab[1];
	   p1.setX(((tabr[4].getX())/3+2*(tabr[0].getX())/3));
	   p1.setY(((tabr[4].getY())/3+2*(tabr[0].getY())/3));
	   tabr[1]=p1;
	   p3.setX((2*(tabr[4].getX())/3+(tabr[0].getX())/3));
	   p3.setY((2*(tabr[4].getY())/3+(tabr[0].getY())/3));
	   tabr[3]=p3;
	   tabr[2]= Point.rotation(tabr[1],tabr[3],-Math.PI/3);
	  
	  return tabr ;
    }
}