import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    /*
    * Khai báo các field của lớp Account
    * accountNumbers: id của account
    * fullName: họ tên chủ account
    * id: chứng minh thư của chủ account
    * phone, address: số điện thoại, địa chỉ
    * money: số tiền có trong tài khoản
    * */
    private String accountNumbers, fullName, id, phone, address;
    private double money;

    // Khai báo các mảng lưu trữ thông tin giao dịch của tài khoản
    List<Receiver> receiverList = new ArrayList<>();
    List<Transfer> transferList = new ArrayList<>();
    List<Loan> loanList = new ArrayList<>();
    List<Withdrawal> withdrawalList = new ArrayList<>();

    //constructors
    public Account() {
    }

    public Account(String accountNumbers, String fullName, String id, String phone, String address, double money) {
        this.accountNumbers = accountNumbers;
        this.fullName = fullName;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.money = money;
    }

    //getter and setter.

    public String getAccountNumbers() {
        return accountNumbers;
    }
    public void setAccountNumbers(String accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    //close getter, setter.

    //method nhập thông tin khởi tạo tài khoản
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ và tên: ");
        fullName = sc.nextLine();

        System.out.println("Nhập số tài khoản: ");
        accountNumbers = sc.nextLine();

        System.out.println("Nhập CMT: ");
        id = sc.nextLine();

        System.out.println("Nhập số điện thoại: ");
        phone = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

        money = 0;
    }

    //method nạp tiền vào tài khoản và lưu vào lịch sử nạp tiền
    public void addReceiver(){
        Receiver receiver = new Receiver();
        receiver.input();
        receiverList.add(receiver);
        money += receiver.getMoney();
    }

    //method chuyển tiền, lưu lịch sử chuyển tiền
    public void transfer(){
        Transfer transfer = new Transfer();
        transfer.input(money);
        transferList.add(transfer);

        money -= transfer.getMoney();

    }

    //method vay tiền và lưu vào lịch sử vay tiền
    public void loan(){
        Loan loan = new Loan();
        loan.input();
        loanList.add(loan);
        money += loan.getMoney();
        System.out.println("Bạn đã vay " + loan.getMoneyString() + " lãi suất " + loan.getYearInterest());
    }

    //method rút tiền và lưu vào lịch sử rút tiền của tài khoản
    public void withdrawal(){
        Withdrawal withdrawal = new Withdrawal();
        withdrawal.input(money);
        withdrawalList.add(withdrawal);

        money -= withdrawal.getMoney();
    }

    //method hiển thị lịch sử nạp tiền vào tài khoản
    public void displayReceiverHistory(){
        System.out.println("Lịch sử nạp tiền: ");
        for (Receiver receiver : receiverList){
            receiver.display();
        }
    }

    //method hiển thị lịch sử chuyển tiền của tài khoản
    public void displayTransferHistory(){
        System.out.println("Lịch sử chuyển tiền: ");
        for (Transfer transfer : transferList){
            transfer.display();
        }
    }

    // hiển thị lịch sử vay tiền
    public void displayLoanHistory(){
        System.out.println("Lịch sử vay tiền: ");
        for (Loan loan : loanList){
            loan.display();
        }
    }
    //hiển thị lịch sử rút tiền
    public void displayWithdrawalHistory(){
        System.out.println("Lịch sử rút tiền: ");
        for (Withdrawal withdrawal : withdrawalList){
            withdrawal.display();
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumbers='" + accountNumbers + '\'' +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", money=" + getMoneyString() +
                '}';
    }
    public void display(){
        System.out.println(toString());
        displayReceiverHistory();
        displayWithdrawalHistory();
        displayTransferHistory();
        displayLoanHistory();
    }
    public String getMoneyString(){
        return NumberFormat.getCurrencyInstance().format(money);
    }
}
