package java8.trycatch;

public class ReturnLab2 {

    public static void main(String[] args) {
        System.out.println(function1());
    }

    private static int function1() {
        int num = 100;
        try {
            System.out.println("try print");
            return num += 60;
        } catch (Exception e) {
            System.out.println("catch print");
        } finally {
            System.out.println("finally print");
            if (num > 100) {
                System.out.println("num > 100, num = " + num);
            }
            return 200;
        }
    }
    
}
