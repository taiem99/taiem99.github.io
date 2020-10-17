import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Receiver {
    double money;
    String note;
    Date createdAt;

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nạp tiền: ");
        // số tiền nạp ít nhất là $50
        while (true){
            System.out.println("Số tiền nạp vào tài khoản: ");
            money = sc.nextDouble();
            if (money >= 50) break;
            else System.out.println("Số tiền nạp không thể nhỏ hơn $50!");
        }

        System.out.println("Nội dung ghi chú: ");
        note = sc.nextLine();

        createdAt = new Date();
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "money=" + getMoneyString() +
                ", note='" + note + '\'' +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }

    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd:MM:yyyy");
        return format.format(createdAt);
    }
    public void display(){
        System.out.println(toString());
    }
    public String getMoneyString(){
        return NumberFormat.getCurrencyInstance().format(money);
    }
}
