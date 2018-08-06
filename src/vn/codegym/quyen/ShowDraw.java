package vn.codegym.quyen;
import java.util.Scanner;

public class ShowDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt, n, m;

// opt là biết tùy chọn menu, m là chiều dài của hình chữ nhật
// n là biến chiều rộng của hcn, chiều cao của hình tam giác

        do {
            System.out.println("Lựa chọn hình muốn in:");
            System.out.println("1. Hình chữ nhật.");
            System.out.println("2. Tam giác vuông.");
            System.out.println("3. Tam giác cân");
            System.out.println("4. Thoát.");
            System.out.print("Lựa chọn: ");

            opt = scanner.nextInt();
            switch (opt) {
                case 1: {
                    System.out.print("Nhập vào chiều dài: ");
                    m = scanner.nextInt();
                    System.out.print("Nhập vào chiều rộng: ");
                    n = scanner.nextInt();
                    DrawRectangle(n, m);
                    break;
                }
                case 2: {
                    SwCase(scanner);
                    break;
                }
                case 3: {
                    System.out.print("Nhập vào chiều cao của tam giác: ");
                    n = scanner.nextInt();
                    IsoscelesSquare(n);
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:
                    System.out.println("Vui lòng chọn lại!!!\n");
            }
        }
        while (opt > 4);
    }

//    Vẽ hình chữ nhật
    public static void DrawRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

//    Vẽ tam giác vuông góc trên bên trái
    public static void SquareTriangleTopLefp(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

//    Vẽ tam giác vuông góc trên bên phải
    public static void SquareTriangleTopRight(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

//    Vẽ tam giác vuông góc dưới bên phải
    public static void SquareTriangleBottonRight(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < n - (i - 1); k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

//    Vẽ tam giác vuông góc dưới bên trái
    public static void SquareTriangleBottonLeft(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

//    Vẽ tam giác cân
    public static void IsoscelesSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

//    Menu chọn vẽ tam giác vuông
    public static void SwCase(Scanner scanner) {
        int n, opt;
        do {
            System.out.println("Vui lòng lựa chọn: ");
            System.out.println("1. Góc vuông trên trái.");
            System.out.println("2. Góc vuông trên phải.");
            System.out.println("3. Góc vuông dưới trái.");
            System.out.println("4. Góc vuông dưới phải.");
            System.out.println("5. Quay lại.");
            System.out.println("Lựa chọn: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1: {
                    System.out.print("Nhập vào chiều cao: ");
                    n = scanner.nextInt();
                    SquareTriangleTopLefp(n);
                    break;
                }
                case 2: {
                    System.out.print("Nhập vào chiều cao: ");
                    n = scanner.nextInt();
                    SquareTriangleTopRight(n);
                    break;
                }
                case 3: {
                    System.out.print("Nhập vào chiều cao: ");
                    n = scanner.nextInt();
                    SquareTriangleBottonLeft(n);
                    break;
                }
                case 4: {
                    System.out.print("Nhập vào chiều cao: ");
                    n = scanner.nextInt();
                    SquareTriangleBottonRight(n);
                    break;
                }
                case 5: {
                    break;
                }
                default:
                    System.out.println("Vui lòng nhập lại!!!");
            }
        }
        while (opt > 4);
    }
}
