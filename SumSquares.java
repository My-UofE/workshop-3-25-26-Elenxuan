import java.util.Scanner;

public class SumSquares {
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

        int sum = 0;
        int i = startNum;

        while (i <= endNum) {
            sum += i * i;
            i++;
        }

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);
    }
}
