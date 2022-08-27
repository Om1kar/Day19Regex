package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    static void validateFirstName() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");

        String name=sc.next();
        //first letter capital and minimum 3 character
        String regex = "[A-Z]+[a-z]{3,}+$";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(name);
        boolean result = matcher.matches();

        if(result){
            System.out.println("Name is Valid");
        }
        else {
            System.out.println("Name is Invalid");
        }
    }

    public static void main(String[] args) {
        validateFirstName();
    }
}
