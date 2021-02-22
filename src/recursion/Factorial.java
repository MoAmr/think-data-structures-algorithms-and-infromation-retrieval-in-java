package recursion;

/**
 * @author Mohammed Amr
 * @created 23/02/2021 - 00:27
 * @project think-data-structures
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println("Factorial of 3 = " + factorial(3));
    }

    public static int factorial(int n) {

        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

}
