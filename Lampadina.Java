public class Lampadina{
    private String currentStatus;
    private int maxSwitches;
    
    public Lampadina(){
        this.currentStatus = "spenta"
        this.maxSwitches = 3;
    }

    public static String stato(){
        String s = "La lampadina è " + this.currentStatus;
        return s;
    }

}