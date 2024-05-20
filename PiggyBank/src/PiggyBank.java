public class PiggyBank {
    public static void main(String[] args) {

        BankUser user = new BankUser("Susana");
        Bank bankAccount = new Bank (100, 0, 500, 0);


        System.out.println("Welcome to your piggyback account!");
        System.out.println("####################################");
        System.out.println("Account name: " + user.getName());

        System.out.println("Your account balance was: " + bankAccount.getBalance());
        System.out.println("Your deposit: " + bankAccount.getDeposit());
        System.out.println("Your withdraw: " + bankAccount.getWithdraw());


        bankAccount.setState("600$");




        //int main = account.getDeposit();


    }

}