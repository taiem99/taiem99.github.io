import java.util.Scanner;

public class NghiemPtB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc 2, a = ");
        float a = sc.nextFloat();
        System.out.println("Nhập hệ số bậc 1, b = ");
        float b = sc.nextFloat();
        System.out.println("Nhập hằng số tự do, c = ");
        float c = sc.nextFloat();

        //kiểm tra hệ số
        if(a == 0){
            if(b == 0){
                System.out.printf("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình chỉ có một nghiệm duy nhất x = " +(-c/b));
            }
            return;
        }
        // trường hợp khác --> tính delta

        float delta = b*b - 4*a*c;
        float x1, x2;
        if(delta > 0){
            x1 = (float)((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float)((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + " x2 = " + x2);
        } else if(delta == 0){
            x1 = -b / (2*a);
            System.out.println("Phương trình có nghiệm kép : x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}