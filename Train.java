// Lab 14 v 100.
// By Emma Foley and Justin Victoria.
// This class constructs and draws a train array.


import java.awt.*;
import java.util.ArrayList;


public class Train
{
  private String type;
  private int x;
  private int y;
  private int pos;
  private Color color;
  private ArrayList<RailCar> train;    // construct new ArrayList train
  private ArrayList<Color> colors;     // array of all the car colors
  private ArrayList<String> types;     // array of all the car types
  
 public Train(int x,int y)    // train constructor
 {
     this.x = x;
     this.y = y;
     this.pos = pos;
     this.color = color;
     train = new ArrayList<RailCar>();
     colors = new ArrayList<Color>();
     types = new ArrayList<String>();
 }
 

   public void addCar(String type,Color color)     // first addCar method
   {
         types.add(type);     // add each type to array
         colors.add(color);   // add each color to array
   }
   
   public void addCar(int pos,String type,Color color)     // overloaded addCar method, included position
   {
         types.add(pos,type);    // add type at position
         colors.add(pos,color);  // add color at position
   } 
   
   public void createTrain(ArrayList<String> array)
   {
      int k = 0;
      for (String type: array)
         {
      //for each car type, add a new object to the arrayList 
         if(type.equals("Locomotive"))      
            train.add(new Locomotive(colors.get(k), x, y));
         if(type.equals("PassengerCar"))
            train.add(new PassengerCar(colors.get(k), x, y));
         if(type.equals("FreightCar"))
            train.add(new FreightCar(colors.get(k), x, y));
         if(type.equals("Caboose"))
            train.add(new Caboose(colors.get(k), x, y));
         
         x += 175;   // adjust cars to correct location
         k++;     // change index
         }
   }  
   
   public void showCars(Graphics g)
   {
      createTrain(types);  // send array of all the types of trains to the createTrain method
      for(RailCar car:train)
         car.drawCar(g);
   }
  
}
