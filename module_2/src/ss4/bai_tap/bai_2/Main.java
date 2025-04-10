package ss4.bai_tap.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấn Enter để bắt đầu");
        scanner.nextLine();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Nhấn Enter để dừng lại");
        scanner.nextLine();
        stopWatch.stop();
        System.out.println("Thời gian đã chạy: " + stopWatch.getElapsedTime() + " ms");
    }
}
