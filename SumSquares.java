import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        /*// Prompt for input
        System.out.print("Enter your name: ");
        
        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!"); */
        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        in.nextLine();

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();
        
        double sum=0;
        int count=0; 
        int i = startNum;     
        do {
            sum+=i*i;
            count++;
            i++;
        } while (i <= endNum);
        double average = sum/count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);

    }
}