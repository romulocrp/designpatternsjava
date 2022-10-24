package designpatternsbase;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        User user = new User("romulo") ;
        user.SayHello();

        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println("Account balance: " + account.getBalance());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}