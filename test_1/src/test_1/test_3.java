package test_1;
import java.util.Scanner;

class Triangle {
    double width;
    double height;

    Triangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return (width * height) / 2;
    }
}

public class test_3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    double w = input.nextDouble();
    double h = input.nextDouble();
    Triangle myTriangle = new Triangle(w, h);
    System.out.println(myTriangle.getArea());
    input.close();
	}
}
