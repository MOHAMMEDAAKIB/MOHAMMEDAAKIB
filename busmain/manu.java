
import java.util.ArrayList;
import java.util.*;
public class manu {
    
    public static void main (String[] arge){
        //bus object crating
        ArrayList<bus> buses = new ArrayList<>(); 
        //ArrayList<booking> bookings = new ArrayList<>();

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
                /*if (selection == 1){
                    booking booking1 = new booking();
                    if (booking1.isAvailable(buses,bookings)){
                        bookings.add(booking1);
                        System.out.println("your booking is succsess...");
                    }
                    else
                        System.out.println("Sorry. Bus is full. try another bus or date");*/
                    
            }
        }
    }
}

