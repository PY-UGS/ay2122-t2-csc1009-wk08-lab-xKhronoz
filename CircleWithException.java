import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a positive number!");
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() throws Exception {
        double area;
        area = Math.PI * (radius * radius);
        if (area > 1000) {
            throw new Exception("Area bigger than 1000!");
        } else {
            return area;
        }
    }

    public double getDiameter() {
        double diameter;
        diameter = 2 * radius;
        return diameter;
    }

    public static void main(String[] args) {
        CircleWithException circle = new CircleWithException();
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter Radius: ");
            double radius = myObj.nextDouble();

            circle.setRadius(radius);
            double area = circle.getArea();
            double diameter = circle.getDiameter();

            System.out.println("Radius: " + circle.getRadius());
            System.out.println("Area: " + area);
            System.out.println("Diameter: " + diameter);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}
