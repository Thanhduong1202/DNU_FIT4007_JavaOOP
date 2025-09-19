class BankAccount:
    def __init__(self, account_name, balance=0):
        self.account_name = account_name
        self.balance = balance

    def deposit(self, amount):
        """Nạp tiền vào tài khoản"""
        if amount <= 0:
            print("Số tiền nạp phải lớn hơn 0.")
            return
        self.balance += amount
        print(f"[NẠP TIỀN] {self.account_name} được nạp {amount:,.0f} VND. Số dư hiện tại: {self.balance:,.0f} VND.")

    def withdraw(self, amount):
        """Rút tiền từ tài khoản"""
        if amount <= 0:
            print("Số tiền rút phải lớn hơn 0.")
            return
        if amount > self.balance:
            print(f"[RÚT TIỀN] Không đủ số dư! Số dư hiện tại: {self.balance:,.0f} VND.")
            return
        self.balance -= amount
        print(f"[RÚT TIỀN] {self.account_name} rút {amount:,.0f} VND. Số dư hiện tại: {self.balance:,.0f} VND.")

    def show_balance(self):
        """Hiển thị số dư hiện tại"""
        print(f"[SỐ DƯ] Tài khoản {self.account_name}: {self.balance:,.0f} VND.\n")


# --- Kiểm thử ---
if __name__ == "__main__":
    account = BankAccount("Nguyễn Văn A", 1000_000)  # Số dư ban đầu 1,000,000 VND
    account.show_balance()

    account.deposit(500_000)   # Nạp tiền
    account.withdraw(200_000)  # Rút tiền
    account.withdraw(2_000_000) # Rút vượt số dư
