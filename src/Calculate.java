/**
 * @author Adam Kujan
 */
public class Calculate {

    public static double square_root(double a, double epsilon) {

        double result = a;

        while ((result * result - a) > epsilon) {
            result = (result + a / result) * 0.5;
        }

        return result;
    }
}
