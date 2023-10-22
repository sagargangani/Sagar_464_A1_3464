public class Triangle {
    public Point p1, p2, p3;
    public Type type;

    public enum Type {
        Isosceles,
        Equilateral,
        Unknown
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        setType(); // Automatically determine the type upon creation
    }

    public void setType() {
        double d1 = distance(p1, p2);
        double d2 = distance(p2, p3);
        double d3 = distance(p3, p1);

        if (d1 == d2 && d1 == d3) {
            type = Type.Equilateral;
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {
            type = Type.Isosceles;
        } else {
            type = Type.Unknown;
        }
    }

    public Type getType() {
        return type;
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double getPerimeter() {
        double d1 = distance(p1, p2);
        double d2 = distance(p2, p3);
        double d3 = distance(p3, p1);
        return d1 + d2 + d3;
    }

    public double getArea() {
        double d1 = distance(p1, p2);
        double d2 = distance(p2, p3);
        double d3 = distance(p3, p1);
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - d1) * (s - d2) * (s - d3));
    }

    public boolean insideOrOutside(Point p) {
        double area = getArea();
        double area1 = calculateTriangleArea(p, p2, p3);
        double area2 = calculateTriangleArea(p1, p, p3);
        double area3= calculateTriangleArea(p1, p2, p);

        return area == area1 + area2 + area3;
    }

    private double calculateTriangleArea(Point p1, Point p2, Point p3) {
        double side1 = distance(p1, p2);
        double side2 = distance(p2, p3);
        double side3 = distance(p3, p1);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
