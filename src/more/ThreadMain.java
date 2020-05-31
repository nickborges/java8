package more;

public class ThreadMain {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Teste thread.")).start();
    }

}
