import java.awt.*;
import java.util.Scanner;

public class Rectangle extends Shape{
    private Point diemTraiTren;
    private int chieuDai;
    private int chieuRong;

    public Rectangle(Point diemTraiTren, int chieuDai, int chieuRong) {
        this.diemTraiTren = diemTraiTren;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Point getDiemTraiTren() {
        return diemTraiTren;
    }

    public void setDiemTraiTren(Point diemTraiTren) {
        diemTraiTren = diemTraiTren;
    }

    public Rectangle() {
        diemTraiTren = new Point(0,0);
        chieuDai = 0;
        chieuRong = 0;
    }

    public void inputInfo(Scanner sc){
        System.out.println("Mời nhập điểm trái trên");
        this.diemTraiTren = new Point();
        diemTraiTren.input();

        System.out.println("Mời nhập chiều dài");
        this.chieuDai = sc.nextInt();
        System.out.println("Mời nhập chiều rộng");
        this.chieuRong = sc.nextInt();
    }

    @Override
    public double tienThanhToan() {
        return this.chieuDai * this.chieuRong;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle {");
        sb.append("DiemTraiTren= ").append(diemTraiTren);
        sb.append(", ChieuDai= ").append(chieuDai);
        sb.append(", ChieuRong= ").append(chieuRong);
        sb.append('}');
        return sb.toString();
    }
}
