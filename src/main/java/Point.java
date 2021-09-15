import java.util.Scanner;

public class Point {
    private int x, y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }
    public void input (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x = ");
        this.x = sc.nextInt();
        System.out.print("Nhập y = ");
        this.y = sc.nextInt();
    }

    public double distance(Point p2) {
        double dx = p2.x - this.x;
        double dy = p2.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Point {");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
