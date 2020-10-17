import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Loan {
    private double money;
    private Date createdAt;
    private float yearInterest;
    private int months;

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

    public float getYearInterest() {
        return yearInterest;
    }
    public void setYearInterest(float yearInterest) {
        this.yearInterest = yearInterest;
    }

    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        this.months = months;
    }

    public void display(){
        System.out.println(toString());
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn vay: ");
        money = sc.nextDouble();
        System.out.println("Thời gian vay (tháng): ");
        months = sc.nextInt();
        createdAt = new Date();
        yearInterest = 10;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "money=" + getMoneyString() +
                ", createdAt=" + getCreatedAtString() +
                "yearInterest=" + yearInterest +
                "months=" + getMonths() +
                '}';
    }

    public String getCreatedAtString(){
        return (new SimpleDateFormat("hh:mm:ss dd:MM:yyyy")).format(createdAt);
    }
    public String getMoneyString(){
        return NumberFormat.getCurrencyInstance().format(money);
    }
}
