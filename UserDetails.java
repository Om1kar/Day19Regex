package Regex.UC2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    static void validateLastName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name");
        String lastName=sc.next();

        String regex = "[A-Z]+[a-z]{3,}+$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(lastName);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Name is Valid");
        }
        else {
            System.out.println("Name is Invalid");
        }
    }

    public static void main(String[] args) {
        validateLastName();
    }
}
