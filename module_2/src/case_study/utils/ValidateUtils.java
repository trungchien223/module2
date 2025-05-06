package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ValidateUtils {
    public static String validateEmployeeCode(String code) throws InvalidInputException {
        if (!code.matches("^NV-\\d{4}$")) {
            throw new InvalidInputException("Mã nhân viên phải đúng định dạng NV-YYYY (Y là chữ số).");
        }
        return code;
    }

    public static String validateName(String name) throws InvalidInputException {
        if (!name.matches("^([A-Z][a-z]+\\s)*[A-Z][a-z]+$")) {
            throw new InvalidInputException("Tên phải viết hoa chữ cái đầu mỗi từ.");
        }
        return name;
    }

    public static String validateBirthday(String dateStr) throws InvalidInputException {
        try {
            LocalDate birthday = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate now = LocalDate.now();
            int age = Period.between(birthday, now).getYears();
            if (age < 18) {
                throw new InvalidInputException("Nhân viên phải đủ 18 tuổi.");
            }
            return dateStr;
        } catch (Exception e) {
            throw new InvalidInputException("Ngày sinh phải đúng định dạng dd/MM/yyyy.");
        }
    }

    public static String validateIdCard(String idCard) throws InvalidInputException {
        if (!idCard.matches("^\\d{9}|\\d{12}$")) {
            throw new InvalidInputException("CMND phải gồm 9 hoặc 12 số.");
        }
        return idCard;
    }

    public static String validatePhone(String phone) throws InvalidInputException {
        if (!phone.matches("^0\\d{9}$")) {
            throw new InvalidInputException("Số điện thoại phải bắt đầu bằng 0 và đủ 10 số.");
        }
        return phone;
    }

    public static double validateSalary(String salaryStr) throws InvalidInputException {
        try {
            double salary = Double.parseDouble(salaryStr);
            if (salary <= 0) {
                throw new InvalidInputException("Lương phải lớn hơn 0.");
            }
            return salary;
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Lương phải là số.");
        }
    }
}
