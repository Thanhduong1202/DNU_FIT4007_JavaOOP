public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Số dư không thể âm. Đặt mặc định = 0.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Số dư không thể âm!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp " + amount + " thành công. Số dư mới: " + balance);
        } else {
            System.out.println("Số tiền nạp phải > 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Rút " + amount + " thành công. Số dư mới: " + balance);
            } else {
                System.out.println("Số dư không đủ để rút!");
            }
        } else {
            System.out.println("Số tiền rút phải > 0!");
        }
    }
}
