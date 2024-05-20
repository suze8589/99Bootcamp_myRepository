public class Bank {

    private double deposit;//it's an action = needs a method
    private int withdraw;//it's an action, needs a method
    private double balance; // it's an action, needs a method

    private int account;

    public Bank(double deposit, int withdraw, double balance, int account) {
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.balance = balance;
        this.account = account;
    }

    public double getDeposit() {
        return deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public double getBalance() {
        return balance;
    }

    public void setState (String state) {
        if (state.equals("600$")) {
            System.out.println("Your new balance account: 600.00$");
            return;
        }
    }



    //deposit = 100 + 500; // 600
    //public double add(double Bank.deposit() + double Bank.balance()) {
    //return deposit + balance;




    //}


    // withdraw =
    //int result2 = withdraw.subtract(100,500);
}
