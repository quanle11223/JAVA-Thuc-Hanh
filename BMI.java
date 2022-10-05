import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Kiểm tra chỉ số BIM");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Weight: ");
        double Weight = scanner.nextDouble();

        System.out.println("Nhập Height: ");
        double Height = scanner.nextDouble();

        double Bim  = Weight / (Height * Height);
        System.out.println("Chỉ số BIM là: " + Bim);

        if (Bim < 18.5) {
            System.out.println("Underweight");
        } else if ((Bim >= 18.5) && (Bim < 25)) {
            System.out.println("Normal");
        } else if ((Bim >= 25) && (Bim < 30)) {
            System.out.println("Overweight");
        } else if (Bim >= 30) {
            System.out.println("Obese");
        }
    }
    }

