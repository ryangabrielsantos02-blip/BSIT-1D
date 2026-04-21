public class ExceptionDemo4 {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;

        int age = 19;
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible");
        }
    }
}