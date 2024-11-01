public class bus {
    private final int Busno;
    private char Ac;
    private int capasity;
    // get method
    bus(int no, char ac, int seet){
        this.Busno= no;
        this.Ac = ac;
        this.capasity= seet;
    }
    //accsessers are
    public int getcapasity(){
        return capasity;
    }
    public int getbusno(){
        return Busno;
    }
    public int getac(){ 
        return Ac;
    }


    //mutater
    public void getcapasity(int new_seet){
        capasity =new_seet;
    }
    public void getac(char  ac_up){ 
        Ac =ac_up;
    }

    //display the bus info 
    public void displaybusinfo(){
        System.out.println("Bus No: "+ Busno +"\tAC: "+Ac+ "\tCapasity: "+capasity );
    }
}
