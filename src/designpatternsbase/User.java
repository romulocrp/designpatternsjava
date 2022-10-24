package designpatternsbase;

public class User {
    // Atributtes
    public String name;

    public User(String name) {
        this.name = name;
    }

    //Methods

    public void SayHello () {
        System.out.println("Hello felow user " + name + "!");
    }
}
