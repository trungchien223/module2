package ss1.bai_tap.bai_3;

import java.util.Scanner;

public class ReadingNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int num = scanner.nextInt();
        if (num < 0 || num > 999) {
            System.out.println("Number is invalid!");
            return;
        }
        if (num == 0) {
            System.out.println("Zero");
            return;
        }
        String result = "";
        int hundred = num / 100;
        if (hundred > 0) {
            switch (hundred) {
                case 1 -> result += "One Hundred";
                case 2 -> result += "Two Hundred";
                case 3 -> result += "Three Hundred";
                case 4 -> result += "Four Hundred";
                case 5 -> result += "Five Hundred";
                case 6 -> result += "Six Hundred";
                case 7 -> result += "Seven Hundred";
                case 8 -> result += "Eight Hundred";
                case 9 -> result += "Nine Hundred";
            }
            if (num % 100 != 0) {
                result += " And ";
            }
        }
        int dozen = (num % 100) / 10;
        int unit = num % 10;
        if (dozen == 1) {
            switch (unit) {
                case 0 -> result += "Ten";
                case 1 -> result += "Eleven";
                case 2 -> result += "Twelve";
                case 3 -> result += "Thirteen";
                case 4 -> result += "Fourteen";
                case 5 -> result += "Fifteen";
                case 6 -> result += "Sixteen";
                case 7 -> result += "Seventeen";
                case 8 -> result += "Eighteen";
                case 9 -> result += "Nineteen";
            }
        } else {
            if (dozen > 1) {
                switch (dozen) {
                    case 2 -> result += "Twenty";
                    case 3 -> result += "Thirty";
                    case 4 -> result += "Forty";
                    case 5 -> result += "Fifty";
                    case 6 -> result += "Sixty";
                    case 7 -> result += "Seventy";
                    case 8 -> result += "Eighty";
                    case 9 -> result += "Ninety";
                }
                if (unit > 0) {
                    result += " ";
                }
            }
            if (unit > 0 && dozen != 1) {
                switch (unit) {
                    case 1 -> result += "One";
                    case 2 -> result += "Two";
                    case 3 -> result += "Three";
                    case 4 -> result += "Four";
                    case 5 -> result += "Five";
                    case 6 -> result += "Six";
                    case 7 -> result += "Seven";
                    case 8 -> result += "Eight";
                    case 9 -> result += "Nine";
                }
            }
        }
        System.out.println(result);
    }
}
