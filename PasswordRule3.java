package Regex.UC7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule3 {
    static void validatePassword() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = sc.nextLine();

        String regex = "[0-9]{1}[A-z]{1}[a-z]{6,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    public static void main(String[] args) {
        validatePassword();
    }
}
