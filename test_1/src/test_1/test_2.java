package test_1;
import java.util.Scanner;
//import java.text.DecimalFormat;

class Rectangle {
    double width;
    double height;

    Rectangle(double a, double b) {
        width = a;
        height = b;
    }

    double getPerimeter(){
        return (width + height)*2;
    }

    double getArea() {
        return (width * height);
    }
}

public class test_2 {
	public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);

		    double w = input.nextDouble();
		    double h = input.nextDouble();
		    Rectangle myRectangle = new Rectangle(w, h);
		    System.out.println(myRectangle.getArea());
		    System.out.println(myRectangle.getPerimeter());

		    input.close();
	}
}
