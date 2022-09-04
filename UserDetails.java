package Regex.UC9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = "abc";
        String lastName = "abc";
        String eMail = "abc";
        String phoneNumber = "abc";
        String password1 = "abc";
        String password2 = "abc";
        String password3 = "abc";
        String password4 = "abc";

        while (!validateFirstName(firstName)) {
            System.out.println("Enter First Name");
            firstName = scan.nextLine();
            if (!validateFirstName(firstName))
                System.out.println("Invalid Input");
        }
        while (!validateLastName(lastName)) {
            System.out.println("Enter Last Name");
            lastName = scan.nextLine();
            if (!validateLastName(lastName))
                System.out.println("Invalid Input");
        }
        while (!validateEMail(eMail)) {
            System.out.println("Enter E-Mail");
            eMail = scan.nextLine();
            if (!validateEMail(eMail))
                System.out.println("Invalid Input");
        }
        while (!validatePhoneNumber(phoneNumber)) {
            System.out.println("Enter Phone Number");
            phoneNumber = scan.nextLine();
            if (!validatePhoneNumber(phoneNumber))
                System.out.println("Invalid Input");
        }
        while (!validatePassword1(password1)) {
            System.out.println("Enter Password");
            password1 = scan.nextLine();
            if (!validatePassword1(password1))
                System.out.println("Invalid Input");
        }
       while (!validatePassword2(password2)) {
           System.out.println("Enter Password");
           password2 = scan.nextLine();
           if (!validatePassword2(password2))
               System.out.println("Invalid Input");
       }
       while (!validatePassword3(password3)) {
            System.out.println("Enter Password");
            password3 = scan.nextLine();
            if (!validatePassword3(password3))
                System.out.println("Invalid Input");

        }
       while (validatePassword4(password4)) {
           System.out.println("Enter Password");
           password4 = scan.nextLine();
           if (!validatePassword3(password4))
               System.out.println("Invalid Input");

       }
        }

        private static boolean validatePhoneNumber (String phoneNumber){
            Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}$");
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        }

        private static boolean validateEMail (String eMail){
            Pattern pattern = Pattern.compile("^[a-z]+.+[a-z]+@+[a-z]+.+[a-z]+.+[a-z]");
            Matcher matcher = pattern.matcher(eMail);
            return matcher.matches();
        }

        private static boolean validateFirstName (String firstName){
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
        private static boolean validateLastName (String lastname){
            Pattern pattern = Pattern.compile("^[A-Z]+[a-z]{3,}+$");
            Matcher matcher = pattern.matcher(lastname);
            return matcher.matches();
        }
        private static boolean validatePassword1 (String password1){
            Pattern pattern = Pattern.compile("^[a-zA-z]{8,}$");
            Matcher matcher = pattern.matcher(password1);
            return matcher.matches();
        }
        private static boolean validatePassword2 (String password2){
            Pattern pattern = Pattern.compile("[A-z]{1}[a-z]{7}$");
            Matcher matcher = pattern.matcher(password2);
            return matcher.matches();

        }
        private static boolean validatePassword3(String password3) {
        Pattern pattern = Pattern.compile("[0-9]{1}[A-z]{1}[a-z]{6,}$");
        Matcher matcher = pattern.matcher(password3);
        return matcher.matches();
        }
        private static boolean validatePassword4(String password4) {
            Pattern pattern = Pattern.compile("[0-9]{1}[A-z]{1}[a-z]{5,}[!@#$%^&*]{1}$");
            Matcher matcher = pattern.matcher(password4);
            return matcher.matches();
        }
    }





