public class Application {
    static void input(String a){
        System.out.println("My name is "+a);
    }
    static void age(int b){
        System.out.println("I'm "+b+"" +" years old");
    }

    public static void main(String[] args) {
        Application a = new Application();
        input("Isuri");
        age(23);
    }
}
