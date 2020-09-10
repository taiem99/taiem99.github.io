import java.net.SocketOption;
import java.util.Scanner;
import java.lang.Math;
public class MortgagePayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P ; // tiền gốc đã vay.
        double r; // lãi suất theo năm.
        int n; //kỳ hạn vay theo năm.
        double M; // số tiền trả nợ hàng tháng.

        // Nhập số liệu từ cosole.
        System.out.println("Số tiền gốc đã vay là: ");
        P = sc.nextInt();
        System.out.println("Lãi suất theo năm là: ");
        r = sc.nextDouble();
        System.out.println("Kỳ hạn vay theo năm: ");
        n = sc.nextInt();

        r = r / 12; // lãi suất chuyển từ năm sang tháng.
        r = r /100;
        n = n * 12; // kỳ hạn vay năm chuyển sang tháng.
        M = (r*Math.pow(1+r, n)) / (Math.pow(1+r, n) -1) * P;


        System.out.println("Số tiền lãi phải trả hàng tháng là: " + (int)M);
    }
}
