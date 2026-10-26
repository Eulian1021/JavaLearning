public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("java.version = " + System.getProperty("java.version"));
        for (int i = 1; i <= 5; i++) {
            System.out.println("loop " + i);
        }
    }
}