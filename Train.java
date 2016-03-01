import java.awt.*;
import java.util.ArrayList;


public class Train
{
  private String type;
  private int x;
  private int y;
  private Color color;
  private ArrayList<RailCar> train = new ArrayList<RailCar>();    // create train ArrayList
  
 public Train(int startX,int startY)    // train class constructor
 {
     startX = x;
     startY = y;
     this.color = color;
 }
 
   public void addCar(String type,Color color)
   {
      if (type.equals("Locomotive")) {                        // for each type of car
         Locomotive loco = new Locomotive(color,x,y);         // create new car object
         x += 150;                                            // move over
         train.add(loco);                                     // add object to ArrayList
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
   
   public void addCars(int pos,String type,Color color)
   {
    if (type.equals("Locomotive")) {
         Locomotive loco = new Locomotive(color,x,y);
         x += 150;
         train.add(pos,loco);
         }
      if (type.equals("Caboose")) {
         Caboose cab = new Caboose(color,x,y);
         x += 150;
         train.add(pos,cab);
         }
      if (type.equals("PassengerCar")) {
         PassengerCar pass = new PassengerCar(color,x,y);
         x += 150;
         train.add(pos,pass);
         }
      if (type.equals("FreightCar")) {
         FreightCar fre = new FreightCar(color,x,y);
         x += 150;
         train.add(pos,fre);}  
   }

   public void showCars(Graphics g)
   {
    
   }
  
}
