import java.util.Arrays;

public class DealerShip {
     private Car[] cars;

    public DealerShip( Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length ; i++) {
            this.cars[i] = new Car(cars[i]);
        }

    }

    //
    public void setCar(Car car1, int index){
        this.cars[index] = new Car(car1);

    }

    public Car getCar(int index){

        return new Car(this.cars[index]);
    };


    public void sell(int index){
       this.cars[index].drive();
       this.cars[index]= null;


    }

    public int search(String make, int budget){

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            }  else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget ) {
                System.out.println( "\nwe found a car in spot\n"+i+ "\n\n"+ cars[i].toString());
                System.out.println(" If you are interested, type 'yes': ");
                return i;
            }
        }
        System.out.println("\nYour search did not match any result\n");
        return 404;
    }


    public String toString2(){
        String temp="";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "parking spot "+ i +"\n";

            if (this.cars[i] == null) {
                temp += "Empty Spot"+"\n";
            }else{
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }

}
