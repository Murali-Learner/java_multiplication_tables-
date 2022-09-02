import java.util.Scanner;

public class multiplicationTables {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i : arr) {
            printTables(i);
        }
        s.close();

    }

    static void printTables(int tables) {

        for (int i = 1; i <= 10.; i++) {
            System.out.printf("\n%d * %d = %d\n", tables, i, tables * i);

        }
        System.out.println();
    }

}