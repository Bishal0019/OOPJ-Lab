package Day6;

interface Greeting {
    void sayHello();
}

public class Test {
    public static void main(String[] args) {

        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, Welcome!");
            }
        };

        g.sayHello();
    }
}
