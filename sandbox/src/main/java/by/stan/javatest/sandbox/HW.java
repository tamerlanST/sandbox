 package by.stan.javatest.sandbox;

public class HW {

  public static void main (String[] args) {
		hello("Victor");
    hello("Valera");

    //print area of square
    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной "+s.l+" равна "+ area (s)+".");

    //print are of rectangle
    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" равна " + area(r) + ".");
	}

	private static void hello (String user) {
    System.out.println("Hello, " + user + "!");
  }

  private static double area (Square s) {
    return s.l * s.l;
  }

  private static double area (Rectangle r) {
    return r.a * r.b;
  }
}