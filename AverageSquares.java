import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        int startNum, endNum;

        if (args.length >= 2) {
            startNum = Integer.parseInt(args[0]);
            endNum   = Integer.parseInt(args[1]);
        } else {
            Scanner in = new Scanner(System.in);
            startNum = in.nextInt();
            endNum   = in.nextInt();
        }
        
        int sum=0;
        int i = startNum;      
        while (i <=endNum) {
            sum+=i*i;
            i++;
        }
/*         for(int i= startNum;i<= endNum;i++){

            sum+=i*i;
        } */
        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);

    }
}