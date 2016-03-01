import java.awt.*;
import java.util.ArrayList;


public class Train
{
  private String type;
  private int x;
  private int y;
  private int pos;
  private Color color;
  private ArrayList<RailCar> train = new ArrayList<RailCar>();
  
 public Train(int x,int y)
 {
     this.x = x;
     this.y = y;
     this.color = color;
     this.pos = pos;
 }
 
    public void addCars(int pos,String type,Color color)
   {
    if (type.equals("Locomotive")) {
         Locomotive loco = new Locomotive(color,x,y);
         x += 175;
         train.add(pos,loco);
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
   
   public void addCar(String type,Color color)
   {
      if (type.equals("Locomotive")) {
         Locomotive loco = new Locomotive(color,x,y);
         x += 175;
         train.add(loco);
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
   
   
   
   public void showCars(Graphics g)
   {
      for(RailCar show: train)
         show.drawCar(g);
    
   }
  
}
