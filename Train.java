import java.awt.*;
import java.util.ArrayList;


public class Train
{
  private String type;
  private int x;
  private int y;
  private int pos;
  private Color color;
  private ArrayList<RailCar> train = new ArrayList<RailCar>();    // construct new ArrayList train
  
 public Train(int x,int y)    // train constructor
 {
     this.x = x;
     this.y = y;
     this.color = color;
     this.pos = pos;
 }
 

   public void addCar(String type,Color color)     // first addCar method
   {
      if (type.equals("Locomotive")) {    // depending on type
         Locomotive loco = new Locomotive(color,x,y);    // create new object
         x += 175;      // move over 175 to make train
         train.add(loco);     // add to array
         }
      if (type.equals("Caboose")) {
         Caboose cab = new Caboose(color,x,y);
         x += 175;
         train.add(cab);
         }
      if (type.equals("PassengerCar")) {
         PassengerCar pass = new PassengerCar(color,x,y);
         x += 175;
         train.add(pass);
         }
      if (type.equals("FreightCar")) {
         FreightCar fre = new FreightCar(color,x,y);
         x += 175;
         train.add(fre);
      }
      
   }
   
       public void addCar(int pos,String type,Color color)     // overloaded addCar method, included position
   {
      if (type.equals("Locomotive")) {
         Locomotive loco = new Locomotive(color,x,y);
         x += 175;
         train.add(pos,loco);    // overloaded add method inserts car at position
         }
      if (type.equals("Caboose")) {
         Caboose cab = new Caboose(color,x,y);
         x += 175;
         train.add(pos,cab);
         }
      if (type.equals("PassengerCar")) {
         PassengerCar pass = new PassengerCar(color,x,y);
         x += 175;
         train.add(pos,pass);
         }
      if (type.equals("FreightCar")) {
         FreightCar fre = new FreightCar(color,x,y);
         x += 175;
         train.add(pos,fre);}  
   }
   
   
   public void showCars(Graphics g)
   {
      for(RailCar car: train)    // for each car in the train array
         car.drawCar(g);         // call to draw car method
    
   }
  
}
