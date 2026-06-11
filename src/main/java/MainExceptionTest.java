import java.util.ArrayList;

public class MainExceptionTest {
    public static void main(String[] args) {
        int a = 6, b = 0, index = 0, index1 = 3;
        String s = null;
        String s1 = "hello";
        String s2 = "23a";
        int[] ar = {1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);


        try {
            int c = a / b;
            //ArithmeticException

            System.out.println("C = " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // работает в отдельном потоке, говорит "где"
        }

        try {

            char sym = s.charAt(1);
            //NullPointerException
            System.out.println(sym);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {

            char sym = s1.charAt(-1);
            System.out.println(sym);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            int res = ar[4];
            // ArrayIndexOutOfBoundsException
            System.out.println(" reult = " + res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            //NumberFormatException
            int res = Integer.parseInt(s2);
            System.out.println("res = " + res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            int res = list.get(index1);
//IndexOutOfBoundsException
            System.out.println("res =" + res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

            System.out.println("The end!");
        }


    }
