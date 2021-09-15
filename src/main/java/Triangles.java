import java.util.Scanner;

public class Triangles extends Shape {

    private Point d1, d2, d3;

    public Triangles() {
    }

    public Triangles(Point diem1, Point diem2, Point diem3) {
        this.d1 = diem1;
        this.d2 = diem2;
        this.d3 = diem3;
    }

    public void inputInfo(Scanner sc) {
        System.out.println("Nhập vào đỉnh 1");
        this.d1 = new Point();
        d1.input();
        System.out.println("Nhập vào đình 2");
        this.d2 = new Point();
        d2.input();
        System.out.println("Nhập vào đỉnh 3");
        this.d3 = new Point();
        d3.input();
    }


    @Override
    public double tienThanhToan() {
        double a = this.d1.distance(this.d2);
        double b = this.d2.distance(this.d3);
        double c = this.d3.distance(this.d1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangles {");
        sb.append("d1=").append(d1.toString());
        sb.append(", d2=").append(d2.toString());
        sb.append(", d3=").append(d3.toString());
        sb.append('}');
        return sb.toString();
    }
}
