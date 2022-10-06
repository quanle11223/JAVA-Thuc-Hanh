import java.util.Scanner;

public class Timuocsochunglonnhat {
    public static void main(String[] args) {
       int a;
       int b;
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("InputNumber a: ");
        a = inputNumber.nextInt();
        System.out.println("InputNumber b: ");
        b = inputNumber.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if ((a == 0) || (b == 0)) {
            System.out.println("Không có yếu tố chung lớn nhất");
        }
        while (a != b) {
            if (a < b) {
                a = a - b;
            } else {
                b = b - a;
            }
        } System.out.println("Ước số chung lớn nhất là: " + a);
    }
}
// Nếu a < b: a = a – b
//
//Còn lại b = b – a