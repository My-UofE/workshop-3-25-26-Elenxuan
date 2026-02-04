import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter the size: ");
            size = in.nextInt();
            if (size < 1) System.out.println("too small!");
            if (size > 5) System.out.println("too big!");

        } while (size < 1 || size > 5);

        int rows = size * 2;

        for (int r = 0; r < rows; r++) {
            int start = (r < size) ? (1 + r) : (1 + rows - r - 1);

            for (int i = start; i < start + size; i++) {
                System.out.print(i);
            }
            for (int i = start + size - 1; i >= start; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
