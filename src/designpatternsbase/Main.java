package designpatternsbase;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        User user = new User("romulo") ;
        user.SayHello();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}