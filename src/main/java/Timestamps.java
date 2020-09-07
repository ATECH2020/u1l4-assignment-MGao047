import java.util.Scanner;
class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        System.out.println("First Hour: ");
        int minutes1 = scanner.nextInt();
        System.out.println("First Minute: ");
        int seconds1 = scanner.nextInt();
        System.out.println("First Second: ");
        int hours2 = scanner.nextInt();
          System.out.println("Scond Hour: ");
        int minutes2 = scanner.nextInt();
        System.out.println("Second Minute: ");
        int seconds2 = scanner.nextInt();
         System.out.println("Second Second: ");

      
        /*
         *  your code goes here
         */
         System.out.println("Seconds in between:"+((hours2*3600+minutes2*60+seconds2)-(hours1*3600+minutes1*60+seconds1)));
      
         


        // closing the scanner object
        scanner.close();
    }
}