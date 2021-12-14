import javax.swing.*;
import java.awt.*;

public class Construction extends JFrame{
  private Paneau pan ;
  public Construction()
  { 
   	setTitle (" Flocon de vone koch ") ;
    setSize (950, 400) ;
    pan = new Paneau() ;
    pan.setBackground(Color.cyan) ;
    getContentPane().add(pan) ;
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }
}