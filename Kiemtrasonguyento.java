import java.util.Scanner;

public class Kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        System.out.println("Nhập số cần kiểm tra: ");
        Number = scanner.nextInt();
        System.out.println(Math.sqrt(Number));

        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(Number)) {
           if (Number % 2 == 0) {
               check = false;
               break;
             }
           i++;
       }
       if (check)
           System.out.println(Number + " Là số NT");
       else
           System.out.println(Number +  " Không phải số NT");
    }
}
