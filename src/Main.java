
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Car[] cars= new Car[]{
             new Car("nissan",5000,2022,"red",new String[]{"oil","tires"}),
                new Car("mazda",10000,2018,"yellow",new String[]{"motor","miror"}),
                new Car("toyota",3000,2000,"black",new String[]{"lights","seat"}),
                new Car("bmw",80000,2023,"yellow",new String[]{"lights","seat"}),
                new Car("lexus",15000,2015,"yellow",new String[]{"motor","miror"}),
                new Car("toyota",4400,2021,"black",new String[]{"lights","seat"}),
                new Car("mercedes",10000,2015,"jet black",new String[]{"motor","miror"})
        };

        DealerShip dealership = new DealerShip(cars);

        System.out.println("\n"+" ********* JAVA DEALERSHIP *********"+"\n");
        System.out.println("Welcome!! Enter the type of car you are looking for: ");
        String make= scan.nextLine();

        System.out.println("Enter your budget");
        int budget = scan.nextInt();

        int index = dealership.search(make,budget);

        switch (index){
            case 404: System.out.println("feel free to browse to our collection");
            System.out.println(dealership.toString2());
            break;


            default: scan.nextLine();
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("yes")){
                dealership.sell(index);
            }
        }





















//        System.out.println(CopyNissan.getPrice());
//        System.out.println(nissan.getColor());
//        System.out.println(dodge.getMake());
//        System.out.println(nissan.getYear());
//        System.out.println(nissan.getPrice());

//        System.out.println(nissan2);
//        System.out.println(nissan);
//        System.out.println(dodge);
//        System.out.println(CopyNissan);
//
//
//        nissan.drive();
//        dodge.drive();
//        nissan2.drive();

    }




}
