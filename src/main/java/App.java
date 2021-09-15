import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn mua bao nhiêu mảnh đất: ");
        int n = sc.nextInt();
        Shape[] list = new Shape[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập mảnh đất thứ :" + (i + 1));
            System.out.println("1: hình tam giác. 2. hình chữ nhật. 3. hình tròn. 4. hình vuông");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    list[i] = new Triangles();
                    break;
                case 2:
                    list[i] = new Rectangle();
                    break;
                case 3:
                    list[i] = new Circle();
                    break;
                case 4:
                    list[i] = new Squares();
                    break;
                default:
                    break;
            }
            list[i].inputInfo(sc);

        }
        System.out.println("Danh sách các mảnh đất đã mua: ");
        for (Shape sp : list) {
            System.out.println(sp);
        }

        double pricePerUnit = 100;
        double total = 0;
        for (Shape s : list) {
            total += pricePerUnit * s.tienThanhToan();
        }

        System.out.println("Tổng số tiền phải thanh toán: " + total);
    }


    private static Shape createShape(int type) {
        switch (type) {
            case 1:
                return new Squares();
            case 2:
                return new Circle();
            case 3:
                return new Rectangle();
            case 4:
                return new Triangles();
            default:
                return null;
        }
    }

    private static int random(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }
}
