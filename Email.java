package Regex.UC3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    static void validateEmail() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter E-mail");
        String lastName = sc.next();

        String regex = "[a-z]+.+[a-z]+@+[a-z]+.+[a-z]+.+[a-z]$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(lastName);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("E-mail is Valid");
        } else {
            System.out.println("E-mail is Invalid");
        }
    }

    public static void main(String[] args) {
        validateEmail();
    }
}
