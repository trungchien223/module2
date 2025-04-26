package ss19.bai_tap.bt_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String FORMAT_WITH_BRACKETS = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    private static final String FORMAT_INTERNATIONAL = "^\\+84\\d{9}$";

    private static final Pattern patternWithBrackets = Pattern.compile(FORMAT_WITH_BRACKETS);
    private static final Pattern patternInternational = Pattern.compile(FORMAT_INTERNATIONAL);

    public static boolean isValidPhone(String phone) {
        Matcher matcherBrackets = patternWithBrackets.matcher(phone);
        Matcher matcherInternational = patternInternational.matcher(phone);
        return matcherBrackets.matches() || matcherInternational.matches();
    }

    public static void main(String[] args) {
        String[] validPhones = {"(84)-(0978489648)", "+84978489648"};
        String[] invalidPhones = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

        for (String phone : validPhones) {
            System.out.println(phone + " is valid: " + isValidPhone(phone));
        }

        for (String phone : invalidPhones) {
            System.out.println(phone + " is valid: " + isValidPhone(phone));
        }
    }
}
