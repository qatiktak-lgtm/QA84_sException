public class MainThrowTest {
    public static void main(String[] args) {
        double res = 0;
        try {
            res = divide(6.3, 0);
        } catch (Exception e) {
            // System.out.println(e.getMessage());
        }
        //System.out.println("res = " + res);
        try {
            res = calculator(5, 2, '&');
            System.out.println("res = " + res);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int r = 0;
        int[] ar = {9, 2, -3, 0, -5};
        try {
            r = findAndSum(ar, 0, 2);
            System.out.println("res " + r);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            r= parseStrAndMult2("3 4");
            System.out.println("res = " +r);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    // s-> "34" => 34*2 = 68
    public static int parseStrAndMult2(String s)
    throws NullPointerException, Exception, NumberFormatException  //зачем здесь все кроме Exception?
    {
        int res = 0;
        if (s==null){
        NullPointerException e = new NullPointerException("String is null");
        throw e;
        }
        if (s.isBlank() == true){
            Exception e = new Exception("String is empty or blant");
            throw e;
        }
        try {
            res = Integer.parseInt(s);
        }catch (NumberFormatException e){
            throw e;
        }
        // res = Integer.parseInt(s); // Евгения предложила повторить
        return res * 2;
    }

    public static int findAndSum(int[] ar, int index1, int index2) throws
            NullPointerException,
            Exception,
            IndexOutOfBoundsException {

        if (ar == null) {
            NullPointerException e =
                    new NullPointerException("Array is null");
            throw e;
        }
        if (ar.length == 0) {
            Exception e = new Exception("Array length is empty");
            throw e;
        }
        if (index1 < 0 || index1 >= ar.length || index2 < 0 || index2 >= ar.length) {
            ArrayIndexOutOfBoundsException e =
                    new ArrayIndexOutOfBoundsException("Index out of bounds");
            throw e;
        }
        return ar[index1] + ar[index2];
    }
    /*
         0  1  2  3  4      index1 = 0  index2 = 2
   ar   [9][2][1][3][6]
*/

    public static double calculator(double a, double b, char action) throws Exception, ArithmeticException {
        double res = 0;
        switch (action) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) {
                    ArithmeticException e =
                            new ArithmeticException("Division by zero");
                    throw e;
                }
                res = a / b;
                break;
            default:
                Exception e = new Exception("Unknow action");
                throw e;
        }
        return res;
    }


    public static double divide(double a, double b) throws Exception {

        double res = 1;
        if (b == 0) {
            Exception e = new Exception("Attention: division by zero!!!");
            throw e;
        }
        res = a / b;
        return res;

    }
    /*
    res = calculator (5,3,'@');





     */
}
