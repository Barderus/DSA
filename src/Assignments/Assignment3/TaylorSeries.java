package Assignments.Assignment3;

public class TaylorSeries {
    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Convert degrees to radians
    public static double toRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    // Taylor series for sin(x) centered at a (in radians) with h = x - a
    public static double taylorSin(double a, double h) {
        double result = 0;

        // Sine function and its derivatives follow a cyclic pattern
        double sinA = Math.sin(a);  // sin(a)
        double cosA = Math.cos(a);  // cos(a)

        // Apply the Taylor series terms
        result += sinA;                      // f(a)
        result += cosA * h;                  // f'(a) * h
        result -= (sinA * Math.pow(h, 2)) / 2;   // f''(a) * h^2 / 2!
        result -= (cosA * Math.pow(h, 3)) / 6;   // f'''(a) * h^3 / 3!
        result += (sinA * Math.pow(h, 4)) / 24;  // f''''(a) * h^4 / 4!
        result += (cosA * Math.pow(h, 5)) / 120; // f'''''(a) * h^5 / 5!

        return result;
    }

    public static void main(String[] args) {
        // Center of the expansion (in radians, 45 degrees)
        double a = toRadians(45);
        // Difference h = 44 degrees - 45 degrees (in radians)
        double h = toRadians(44 - 45);

        // Calculate sin(44º) using the simplified Taylor series
        double sin44 = taylorSin(a, h);

        // Output the result
        System.out.println("Approximated sin(44º): " + sin44);
    }
}

