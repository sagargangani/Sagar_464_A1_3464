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
    }

    public void setType() {
        double d1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        double d2 = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        double d3 = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));

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

    public double getPerimeter(){
        double d1 = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        double d2 = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        double d3 = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
        return d1+d2+d3;
    }
}
