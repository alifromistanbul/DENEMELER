package çalışmalar;

public class StringMethods {
    public static void main(String[] args) {


        String srt = "   I love JAva";
        System.out.println(srt); //   I love JAva

        srt = srt.trim(); // I love JAva
        srt = srt.toUpperCase(); // I LOVE JAVA

        System.out.println("srt upper: " + srt);

        char ch = srt.charAt(7);
        System.out.println("ch: " + ch); // J

        srt = srt.toLowerCase();
        System.out.println("srt lower = " + srt); // i love java

        int lengthOfSrt = srt.length();
        System.out.println("length of srt: " + lengthOfSrt); // 10

        srt = srt.replace("java", "money");
        System.out.println("srt replacement: " + srt); // i love money

        int index = srt.indexOf("l");
        int index2 = srt.indexOf("e ");

        int index3 = srt.lastIndexOf("ey");

        System.out.println(index); // 2
        System.out.println(index2); // 5
        System.out.println(index3); // 10


    }


}
