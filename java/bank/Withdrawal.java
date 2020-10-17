import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Withdrawal {
    double money;
    Date createdAt;

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void input(double currentMoney){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Số tiền cần chuyển: ");
            money = sc.nextDouble();
            if (money <= currentMoney && money > 0) break;
            else {
                System.err.println("Tài khoản của bạn không thực hiện giao dịch này!");

            }
        }

        createdAt = new Date();
    }

    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "money=" + getMoneyString() +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }
    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd:MM:yyyy");
        return format.format(createdAt);
    }
    public String getMoneyString(){
        return NumberFormat.getCurrencyInstance().format(money);
    }
}
