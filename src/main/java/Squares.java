import java.util.Scanner;

public class Squares extends Shape{
    private Point diemTraiTren;
    private int chieuRong;



    @Override
    public double tienThanhToan() {
        return this.chieuRong * this.chieuRong;
    }

    public Squares(Point diemTraiTren, int chieuRong) {
        this.diemTraiTren = diemTraiTren;
        this.chieuRong = chieuRong;
    }

    public Squares() {
    }

    public void inputInfo(Scanner sc){
        System.out.println("Moi nhập điểm trái trên");
        this.diemTraiTren = new Point();
        diemTraiTren.input();

        System.out.println("Mời nhập chiều rộng");
        this.chieuRong = sc.nextInt();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Squares {");
        sb.append("diemTraiTren=").append(diemTraiTren);
        sb.append(", chieuRong=").append(chieuRong);
        sb.append('}');
        return sb.toString();
    }
}
