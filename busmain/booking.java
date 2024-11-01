
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class  booking {
    private String Passengernumber;
    private  int Busno;
    private  Date B_Date;


    // set infomation abouth booking 
    public void Booking(){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter the name: ");
            this.Passengernumber = scn.nextLine();
            System.out.print("Enter the bus noumber: ");
            this.Busno =  scn.nextInt();
            //date convert string to Date format
            System.out.print("Enter the travaling Date(YY-MM-DD): ");
            String S_date = scn.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = dateFormat.parse(S_date);
                this.B_Date = date;
            }
            catch (ParseException e) {
                System.out.println("Failed to parse date: " + e.getMessage());
            }
            
        }
            
    }
        
}

    // get method
    
    // chak avilablety of bus
    //public String Avi_check(){}


