package ss19.bai_tap.bt_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private static final Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);

    public static boolean isValidClassName(String className) {
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validNames = {"C0223G", "A0323K", "P1234H"};
        String[] invalidNames = {"M0318G", "P0323A"};
        for (String name : validNames) {
            System.out.println(name + " is valid: " + isValidClassName(name));
        }
        for (String name : invalidNames) {
            System.out.println(name + " is valid: " + isValidClassName(name));
        }
    }
}