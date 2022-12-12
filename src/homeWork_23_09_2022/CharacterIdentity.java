package homeWork_23_09_2022;

public class CharacterIdentity {
    public static void main(String[] args){

        char character = '@';

        if(character<91 && character > 64 || character>=97 && character<=122){
            System.out.println("Alphabetic Character");
        }else if(character>=0 && character<10){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
    }


}
