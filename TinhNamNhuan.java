import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra: ");
        int Year = scanner.nextInt();

        if (Year % 4 == 0 ) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println(Year + " Là Năm Nhuận ");
                } else {
                    System.out.println(Year + " Không phải năm Nhuận ");
                }
            } else {
                    System.out.println(Year + " Là năm nhuận ");
                }
            } else {
                System.out.println(Year + " Không phải năm nhuận ");
            }
        }

    }


