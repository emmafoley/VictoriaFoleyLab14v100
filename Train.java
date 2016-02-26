import java.awt.*;
import java.util.ArrayList;


public class Train
{
  private String type;
  private int x;
  private int y;
  private Color color;
  private ArrayList<RailCar> train = new ArrayList<RailCar>();
  
 public Train(int startX,int startY)
 {
     startX = x;
     startY = y;
     this.color = color;
 }
 
   public void addCar(String type,Color color)
   {
      if (type.equals("Locomotive")) {
         Locomotive loco = new Locomotive(color,x,y);
         x += 150;
         train.add(loco);
         }
      if (type.equals("Caboose")) {
         Caboose cab = new Caboose(color,x,y);
         x += 150;
         train.add(cab);
         }
      if (type.equals("PassengerCar")) {
         PassengerCar pass = new PassengerCar(color,x,y);
         x += 150;
         train.add(pass);
         }
      if (type.equals("FreightCar")) {
         FreightCar fre = new FreightCar(color,x,y);
         x += 150;
         train.add(fre);
      }
      
   
   }
   public void showCars()
   {
    
   }
  
}
