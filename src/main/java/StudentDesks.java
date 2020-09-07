import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int userint1= scanner.nextInt();
        int userint2= scanner.nextInt();
        int userint3=scanner.nextInt();
        System.out.println("Number of students in classroom 1:");
        System.out.println("Number of students in classroom 2:");
        System.out.println("Number of students in classroom 3: ");


        /*
         *  your code goes here
         */
         System.out.println("Total desks needed for all classrooms:"+((userInt1/2)+userInt1 %2) + (userInt2/2 + userInt2 %2)+ (userInt3/2 + userInt3 %2));


        // closing the scanner object
        scanner.close();
    }
}