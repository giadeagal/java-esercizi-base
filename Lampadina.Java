public class Lampadina{
    private String currentStatus;
    private int maxSwitches;
    private int numClicks;
    
    public Lampadina(){
        this.currentStatus = "spenta"
        this.maxSwitches = 3;
    }

    public static String stato() {
        String s = "La lampadina è " + this.currentStatus + ".";
        return s;
    }

    public static void click() {
        if (this.numClicks < this.maxSwitches && this.currentStatus == "spenta") {
                this.currentStatus = "accesa";
                numClicks++;
            } else if (this.numClicks < this.maxSwitches && this.currentStatus == "accesa") {
                this.currentStatus = "spenta";
                numClicks++;
            } else {
                System.out.println("Non succede niente...");
                this.currentStatus = "rotta";
                numClicks++;
            }
    }

}