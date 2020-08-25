 /**
 *
 *@author Andrea Sanchez Cortes
 *version 1
 */
public class Recursion1 {
    // Recursion1
    public int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0)
            return 0;  // C1
        else
            return 2 + bunnyEars(bunnies - 1); // C2+ T(n- 1)
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;   //c1
        }
        return n % 10 + sumDigits(n / 10); // c2 + t(n/10)
    }
}