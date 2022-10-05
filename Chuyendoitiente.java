import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double Vnd = 23000;
        double Usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền quy đổi: ");
        Usd = scanner.nextDouble();
        double quyDoi = Usd * 23000;
        System.out.println("Giá trị Vnđ là: " + Usd);
    }
}
