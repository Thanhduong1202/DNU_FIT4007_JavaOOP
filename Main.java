public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456", 1000);

        acc.deposit(500);   // Nạp thêm 500
        acc.withdraw(200);  // Rút 200
        acc.withdraw(2000); // Rút quá số dư
        acc.setBalance(-100); // Thử đặt số dư âm
    }
}
