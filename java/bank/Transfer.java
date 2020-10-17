import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transfer {
    String transferNumbers, note;
    double money;
    Date createdAt;

    public String getTransferNumbers() {
        return transferNumbers;
    }
    public void setTransferNumbers(String transferNumbers) {
        this.transferNumbers = transferNumbers;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

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

    public void display(){
        System.out.println(toString());
    }
    //method nhập thông tin để chuyển tiền
    public void input(double currentMoney){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin chuyển tiền: ");
        System.out.println("Tài khoản nhận tiền: ");
        transferNumbers = sc.nextLine();
        while (true){
            System.out.println("Số tiền cần chuyển: ");
            money = sc.nextDouble();
            if (money <= currentMoney && money > 0) break;
            else {
                System.err.println("Tài khoản của bạn không thực hiện giao dịch được này!");
            }
        }

        System.out.println("Nội dung ghi chú: ");
        note = sc.nextLine();

        createdAt = new Date();
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "transferNumbers='" + transferNumbers + '\'' +
                ", note='" + note + '\'' +
                ", money=" + getMoneyString() +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }
    // định dạnh lại thời điểm chuyển tiền sang dạng giờ:phút:giây ngày:tháng:năm
    public String getCreatedAtString(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd:MM:yyyy");
        return format.format(createdAt);
    }

    public String getMoneyString(){
        return NumberFormat.getCurrencyInstance().format(money);
    }
}
