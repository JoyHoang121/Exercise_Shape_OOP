
import java.util.Scanner;

public class Circle extends Shape{
    private Point trungTam;
    private int banKinh;

    public Circle() {
    }

    @Override
    public double tienThanhToan() {
        double duongkinh = banKinh * 2;
        return Math.pow(duongkinh,2)/4* Math.PI;
    }



    public void inputInfo(Scanner sc){
        System.out.println("Mời nhập trung tâm");
        this.trungTam = new Point();
        trungTam.input();

        System.out.println("Mời nhập Bán Kính");
        this.banKinh = sc.nextInt();
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HinhTron {");
        sb.append("TrungTam=").append(trungTam);
        sb.append(", BanKinh=").append(banKinh);
        sb.append('}');
        return sb.toString();
    }
}
