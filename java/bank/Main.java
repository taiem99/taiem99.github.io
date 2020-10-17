import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        login();
        Account account = null;
        System.out.println("Vui lòng chọn chức năng: ");
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    account = new Account();
                    account.input();
                    System.out.println("Tạo tài khoản thành công!!");
                    break;
                case 2:
                    if (account != null){
                        account.addReceiver();
                        System.out.println("Tài khoản của bạn hiện có: " + account.getMoneyString());
                    } else {
                        System.err.println("Tài khoản không tồn tại!");
                    }
                    break;
                case 3:
                    if (account != null){
                        account.withdrawal();
                        System.out.println("Tài khoản của bạn còn: " + account.getMoneyString());
                    } else {
                        System.err.println("Tài khoản không tồn tại!");
                    }
                    break;
                case 4:
                    if (account != null){
                        account.transfer();
                        System.out.println("Tài khoản của bạn còn: " + account.getMoneyString());
                    } else {
                        System.err.println("Tài khoản không tồn tại!");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (account != null){
                        account.loan();
                    } else {
                        System.err.println("Tài khoản không tồn tại!");
                    }
                    break;
                case 8:
                    if (account != null){
                        System.out.println("Lịch sử giao dịch: ");
                        account.display();
                    } else {
                        System.err.println("Tài khoản không tồn tại.");
                    }
                    break;
                case 9:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhập sai!");
                    break;
            }
        } while (choose != 9);

    }
    // method hiển thị các chức năng của chương trình.
    static void showMenu(){
        System.out.println("1.Mở tài khoản.");
        System.out.println("2.Nạp tiền.");
        System.out.println("3.Rút tiền.");
        System.out.println("4.Chuyển khoản.");
        System.out.println("5.Lĩnh lãi.");
        System.out.println("6.Tất toán.");
        System.out.println("7.Vay tiền.");
        System.out.println("8. Lịch sử giao dịch.");
        System.out.println("9.Exit.");
        System.out.println("Chọn: ");
    }

    // method đăng nhập vào chương trình với tài khoản admin
    static void login(){
        System.out.println("----Hello!----");
        System.out.print("User name: ");
        String userName = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        if (userName.equalsIgnoreCase("admin") && password.equals("Tech123")){
            System.out.println("Login success!");
        } else {
            System.err.println("Login failed!");
            login();
        }

    }
}
