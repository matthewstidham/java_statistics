import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class linear_regression {
    /*
     * sum(xy) - sum(x)sum(y) /
     * sum(x^2) - (sum(x))^2
     */
    
    static Double numerator = 0.0;
    static float denominator = 0;
    static Double x_mean = 0.0;
    static Double y_mean = 0.0;
    static Double[] x_temp = {};
    static Double[] x_values = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
    static Double[] y_values = {0.0, 2.0, 4.0, 6.0, 8.0, 10.0};

    static void ArrayAppend() {      
        int[] arr = { 10, 20, 30 };
        System.out.println(Arrays.toString(arr));
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = 40; // Assign 40 to the last element
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        // Find mean of x_values
        for( Double i : x_values) {
            x_mean += i;
        }

        x_mean /= x_values.length;

        // Find mean of y_values

        for( Double i : y_values) {
            y_mean += i;
        }

        y_mean /= y_values.length;

        // Find numerator of Beta function
        for( Double i : x_values) {
            x_temp = ArrayUtils.add(x_temp, i - x_mean);
        }

        System.out.println("Works");

    }
}
