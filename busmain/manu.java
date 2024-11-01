
import java.util.ArrayList;
import java.util.Scanner;
public class manu {
    
    public static void main (String[] arge){
        //bus object crating
        ArrayList<bus> buses = new ArrayList<>(); 
        buses.add(new bus(1,'y',46));
        buses.add(new bus(2,'N',60));
        buses.add(new bus(3,'N',30));
        buses.add(new bus(4,'y',26));
        buses.add(new bus(5,'y',46));
        buses.add(new bus(6,'N',30));
        buses.add(new bus(7,'y',16));

        // show the bus infomation for user
        for( bus b:buses){
            b.displaybusinfo();
        }
       

        //geathering info forom user what he need
        // create the menu 
        int selection= 1;
        try (Scanner Scn = new Scanner(System.in)) {
            while (selection==1){
                System.out.println("choose the number\n\t\t 1. Book\n\t\t 2.Exit ");
                System.out.print("your choice1: ");
                selection = Scn.nextInt();
                if (selection == 1){
                    System.out.println("Booking...");
                }
            }
        }
    }
}
