package BerlinClock;


public class BerlinClock {

    // the commented code was the way we tested locally
    //String[] timeArray = new String[]{"00:00:00", "23:59:59", "02:32:06", "08:34:35", "16:35:57"};

    public void singleMinuteRow(String fullTime){

        String[] clock = new String[]{"O","O","O","O"}; 
        //for (String string : timeArray) {
            //int minute = Integer.parseInt(string.substring(4,5));
            int minute = Integer.parseInt(fullTime.substring(4,5));
            if(minute>=5) {minute = minute-5;}
            if(!(minute == 0)){
                for(int i = 0; i<minute; i++){
                    clock[i] = "Y";
                }
            //}
            for(int j = 0; j<4; j++){
                System.out.print(clock[j]);
            }
            System.out.println("\n");
            clokcReset(clock, 4);
        }
    }

    public void fiveMinuteRow(String fullTime){
        int quotient;
        String[] clock = new String[]{"O","O","O","O","O","O","O","O","O","O","O"};
        //for (String string : timeArray) {
            //int minute = Integer.parseInt(string.substring(3,5));
            int minute = Integer.parseInt(fullTime.substring(3,5));
            quotient = minute/5;
            for(int i=1; i<=11;i++){
                if(i<=quotient)clock[i-1]=  i%3==0 ? "R":"Y";
                System.out.print(clock[i-1]);
            }
            clokcReset(clock, 11);
        //}
    }

    public void singleHourRow(String fullTime){

        String[] clock = new String[]{"O","O","O","O"}; 
        //for (String string : timeArray) {
            //int hour = Integer.parseInt(string.substring(1,2));
            int hour = Integer.parseInt(fullTime.substring(1,2));
            if(hour>=5) {hour = hour-5;}
            if(!(hour == 0)){
                for(int i = 0; i<hour; i++){
                    clock[i] = "R";
                }
            }
            for(int j = 0; j<4; j++){
                System.out.print(clock[j]);
            }
            clokcReset(clock, 4);
        //}
    }

    public void fiveHourRow(String fullTime){
        int quotient;
        String[] clock = new String[]{"O","O","O","O"};
        //for (String string : timeArray) {
            //int hour = Integer.parseInt(string.substring(0,2));
            int hour = Integer.parseInt(fullTime.substring(0,2));
            quotient = hour/5;
            for(int i=1; i<=4;i++){
                if(i<=quotient)clock[i-1]=  "R";
                System.out.print(clock[i-1]);
            }
            clokcReset(clock, 4);
        //}
    }

    public void secondsRow(String fullTime){
        //for (String string : timeArray) {
        //int second = Integer.parseInt(string.substring(7));
        int second = Integer.parseInt(fullTime.substring(7));
        if (second % 2 == 0)
			System.out.print("Y");
		else
			System.out.print("O");
        //}
    }

    public void fullClock(String time){
        secondsRow(time);
        fiveHourRow(time);
        singleHourRow(time);
        fiveMinuteRow(time);
        singleMinuteRow(time);
    }

    public void clokcReset(String[] clock, int i){
        for(int j=0; j<i; j++){
            clock[j]="O";
        }
    }
}
