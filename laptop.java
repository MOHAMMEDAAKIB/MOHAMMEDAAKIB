import java.util.Scanner;
public class laptop {

    String name = "unknown";
    String prosesor ="0";
    int Ram = 0;
    int price = 0;  
    public static void main (String[] args){
        laptop laptop1 = new laptop();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("what is the lap top name");
        laptop1.name= scan1.nextLine( );
        System.out.print("processer: ");
        laptop1.prosesor =scan1.nextLine();
        System.out.print("Ram: ");
        laptop1.Ram = scan1.nextInt();
        System.out.print("price: ");
        laptop1.price =scan1.nextInt();
 

        System.out.println("Name: "+laptop1.name);
        System.out.println("processor"+laptop1.prosesor);
        System.out.println("Ram"+laptop1.Ram);
        System.out.println("Price"+laptop1.price);
    }
}