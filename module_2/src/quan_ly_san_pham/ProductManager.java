package quan_ly_san_pham;

import java.util.Scanner;

public class ProductManager {
    private static Product[] product = new Product[50];

    static {
        product[0] = new Product(1, "ban phim", 1000000);
        product[1] = new Product(2, "man hinh", 2500000);
        product[2] = new Product(3, "chuot", 900000);
    }

    public void display() {
        System.out.println("-----Danh Sach San Pham-----");
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                System.out.println(product[i]);
            }
        }
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < product.length; i++) {
            if (product[i] == null) {
                product[i] = new Product(id, name, price);
                break;
            }
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getId() == id) {
                product[i] = null;
                System.out.println("Da xoa thanh cong: ");
            }
        }
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID can sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null && product[i].getId() == id) {
                System.out.println("Nhap lai san pham can sua: ");
                String name = scanner.nextLine();
                product[i].setName(name);
                System.out.println("nhap lai price can sua: ");
                int price = scanner.nextInt();
                product[i].setPrice(price);
            }
        }
    }
}