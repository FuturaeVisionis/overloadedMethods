/**
 * Created by ronald on 16/01/17.
 */
public class Color {

    double blue (double a, int b){
        return  (a + b) / 2.0;
    }
    double blue (int a, double b){
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        Color color = new Color();
        System.out.println(color.blue(3.3, 8));
    }
}
