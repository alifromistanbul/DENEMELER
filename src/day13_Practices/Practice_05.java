package day13_Practices;

import java.util.Scanner;

public class Practice_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your credentials");
        System.out.println("Enter your user name");
        String userName = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();

        String myPassword = "WoodenSpoon";
        String myUserName = "Cydeo";

        scan.close();

        if(myUserName.equals(userName) & myPassword.equals(password)){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }

    }


}

/*
You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct


 */
