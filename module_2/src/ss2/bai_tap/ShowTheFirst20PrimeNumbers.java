package ss2.bai_tap;

public class ShowTheFirst20PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Hello");
        int count = 0;
        int n = 0;
        while (count < 20) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }

    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
