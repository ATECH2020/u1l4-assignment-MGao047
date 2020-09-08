import java.util.Scanner;

class AnalogClock {
  public static void main(String[] args) {
      

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        //Reads ints from user
       int hourHand=scanner.nextInt();

        /*
         *  your code goes here
         */
      int hour = hourHand /30;
      int minutePass= hour * 30;
      int minpass=hourHand - minutePass;
      int minute = (30 - minutePass)*6;
      System.out.print(minute);


        // closing the scanner object
        scanner.close();
    }
}