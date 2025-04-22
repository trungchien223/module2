package ss12.bai_tap.view;

import ss12.bai_tap.controller.ProductController;
import ss12.bai_tap.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductController controller = new ProductController();

    public void displayMenu() {
        int choice;
        do {
            System.out.println(" QUẢN LÝ SẢN PHẨM ");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp theo giá tăng dần");
            System.out.println("7.Sắp xếp theo giá giảm dần");
            System.out.println("0.Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    displayProduct();
                    break;
                case 2:
                    updateProduct();
                    displayProduct();
                    break;
                case 3:
                    deleteProduct();
                    displayProduct();
                    break;
                case 4:
                    displayProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    controller.sortAscending();
                    displayProduct();
                    break;
                case 7:
                    controller.sortDescending();
                    displayProduct();
                case 0:
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }

    private void addProduct() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        controller.add(new Product(id, name, price));
    }

    private void updateProduct() {
        System.out.print("Nhập ID cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá mới: ");
        double price = Double.parseDouble(scanner.nextLine());
        controller.update(id, name, price);
    }

    private void displayProduct() {
        List<Product> list = controller.findAll();
        for (Product p : list) {
            System.out.println(p);
        }
    }

    private void searchProduct() {
        System.out.println("Nhập tên cần tìm: ");
        String name = scanner.nextLine();
        List<Product> result = controller.searchByName(name);
        for (Product p : result) {
            System.out.println(p);
        }
    }

    private void deleteProduct() {
        System.out.print("Nhập ID cần xoá: ");
        int id = Integer.parseInt(scanner.nextLine());
        controller.delete(id);
    }
}

