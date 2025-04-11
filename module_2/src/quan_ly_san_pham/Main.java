package quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----MENU QUẢN LÝ SẢN PHẨM-----");
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Thêm sản phẩm");
            System.out.println("3.Xóa sản phẩm");
            System.out.println("4.Sửa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    manager.display();
                    break;
                case "2":
                    manager.add();
                    manager.display();
                    break;
                case "3":
                    manager.delete();
                    manager.display();
                    break;
                case "4":
                    manager.edit();
                    manager.display();
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("Thoát chương trình.");
                    System.exit(6);
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
