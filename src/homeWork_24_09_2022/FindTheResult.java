package homeWork_24_09_2022;

import java.util.Scanner;

public class FindTheResult {
    /*
    Task 6: Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
     */


        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            int price = 0;
            while (true){
                System.out.println("which bedroom d you want to reserve? These are room types: \nKing Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$");
                String room = scan.nextLine().toLowerCase();

                System.out.println("how many nights will you stay?");
                int day = scan.nextInt();

                if (room.equals("king bed")) {
                    price = (day*120);
                } else if (room.equals("queen bed")) {
                    price = (day*100);
                } else {
                    price = (day*80);
                }
                System.out.println("your price is: " + price);


                System.out.println("Would you like to reserve another room? yes/no");
                String  ans = scan.next().toLowerCase();
                scan.nextLine();

                while(!(ans.equalsIgnoreCase("yes") ||ans.equalsIgnoreCase("no"))){
                    System.out.println("Invalid answer, please re-enter. Would you like to reserve another room?");
                    ans= scan.next();
                }
                if (ans.equals("no")) {
                    System.out.println("Your price is: " + price);
                    System.exit(0);
                }
            }
        }
    }
