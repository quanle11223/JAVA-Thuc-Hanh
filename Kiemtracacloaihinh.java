import java.util.Scanner;

public class Kiemtracacloaihinh {
    public static void main(String[] args) {
        int a;
        String output = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        a = input.nextInt();

        if (a == 2) {
            System.out.println("Print the square triangle");
            for (int i = 0; i < 6; i++) {
                for (int j = 1; j < i; j = j + 4) {
                    output = output + '*' + " ";
                }
                System.out.printf(output + "\n");
            }
        } else if (a == 1) {
            System.out.println("Print the rectangle");
            for (int i = 1; i <= 3 ; i++) {
                for (int j = 1; j <= 7; j++ ) {
                    output = output + '*' + " ";
                }
                output += "\n";
            } System.out.printf(output + "\n");
        } else if (a == 3 ) {
            System.out.println("Print isosceles triangle");
                for (int i = 5 ; i >= 1 ; i--) {
                    for (int j = 1 ; j <= i ; j++) {
                       output = output + "*" + " ";
                    }
                }
                System.out.printf(output + "\n");
        } else if (a == 0) {
            System.out.println("");
        }
    }
}