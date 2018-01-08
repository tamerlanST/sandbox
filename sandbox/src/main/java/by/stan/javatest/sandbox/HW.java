 package by.stan.javatest.sandbox;

public class HW {

  public static void main (String[] args) {
		hello("Victor");
    hello("Valera");

    double l = 7;
    System.out.println("Площадь квадрата со стороной "+l+" равна "+ sqrt (l)+".");

    double a = 4;
    double b = 5;
    System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" равна " + area(a,b) + ".");
	}

	private static void hello (String user) {
    System.out.println("Hello, " + user + "!");
  }

  private static double sqrt (double len) {
    return len * len;
  }

  private static double area (double a, double b) {
    return a * b;
  }
}