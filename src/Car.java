import java.lang.reflect.Array;
import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

     private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts){
      this.make= make;
      this.price=price;
      this.year=year;
      this.color=color;
      this.parts= Arrays.copyOf(parts,parts.length);


    }
    public Car(Car source){
      this.make= source.make;
      this.price= source.price;
      this.year= source.year;
      this.color= source.color;
      this.parts= Arrays.copyOf(source.parts,source.parts.length);

    }
//GETTER ARE USE TO GET THE VALUE OF A PRIVATE VARIABLE
    public String getMake(){
        return this.make;
    }

    public double getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public String getColor(){
        return this.color;
    }
//---------------------------------------------------


    // SETTER ARE USE TO MODIFY THE EXISTING VALUE
    public void setMake(String setterMake){
        this.make= setterMake;
    }

    public void setColot(String setterColor){
        this.color= setterColor;
    }

    public void setYear(int setterYear){
        this.year = setterYear;
    }
//------------------------------------------------------
    public void drive(){
        System.out.println("you bought a beautiful car for the price of "+ this.price+ "car color is "+ this.color+ " and the make model is "+this.year);
    }


    public  String[] getParts(){
        return  Arrays.copyOf(this.parts,this.parts.length);
    }


    public void setParts(String[]parts){
        this.parts= Arrays.copyOf(parts,parts.length);
    }


    public String toString(){
    return "make :" + this.make+"\n"+
                "price: "+ this.price+"\n"+
                "color: " + this.color+"\n"+
                 "parts: "+ Arrays.toString(parts)+ "\n";

    }








}
