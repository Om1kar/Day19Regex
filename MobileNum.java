package Regex.UC4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNum {
    static void validateMobileNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        String mobileNum = sc.nextLine();

        String regex = "^[0-9]{2} [0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(mobileNum);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Mobile Number is Valid");
        } else {
            System.out.println("Mobile Number Invalid");
        }
    }

    public static void main(String[] args) {
       validateMobileNumber();
    }
}
