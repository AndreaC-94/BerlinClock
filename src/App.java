import BerlinClock.BerlinClock;

public class App {
    public static void main(String[] args) throws Exception {
        
        BerlinClock bc = new BerlinClock();
        //bc.singleMinuteRow();
        bc.fullClock("23:59:59");
    }
}
