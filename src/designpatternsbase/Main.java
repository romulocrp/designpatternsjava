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

        var mailService = new MailService();
        mailService.sendEmail();

        var textBox = new TextBox();
        textBox.enable();

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
    public static void drawUIControl (UIControl control) {
        control.draw();
    }
}