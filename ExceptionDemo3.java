public class ExceptionDemo3 {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;

        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Error occured");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}