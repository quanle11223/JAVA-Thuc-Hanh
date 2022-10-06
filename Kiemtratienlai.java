import java.util.Scanner;

public class Kiemtratienlai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Nhập số tiền cần gửi: ");
        a = scanner.nextDouble();
        System.out.println("Số tháng gửi: ");
        b = scanner.nextDouble();
        System.out.println("Lãi suất/tháng: ");
        c = scanner.nextDouble();

        double result = a * c / 100 * b;
        double Lai = 0;
        for (int i = 0; i <= result; i++) {
            Lai += result;

        }
        System.out.println("Tiền lãi nhận được là: " + Lai + "VNĐ");
    }
}
