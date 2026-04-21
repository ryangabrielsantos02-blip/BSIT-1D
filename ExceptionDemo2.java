public class ExceptionDemo2 {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;

        try {
            int arr[] = new int[3];
            arr[2] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}