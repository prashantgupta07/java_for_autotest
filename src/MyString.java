import java.awt.*;

 public class MyString {

    static void main() {

        String hello = "Hello, Prashant!";
        System.out.println(hello);

        int stringLen = hello.length();
        System.out.println(stringLen);

        String helloUp = hello.toUpperCase();
        System.out.println(helloUp);

        String helloLow = hello.toLowerCase();
        System.out.println(helloLow);

        String addStrings = helloLow + helloUp;
        System.out.println(addStrings);

        String stringWithInt = hello + ", This String lenght is: " + stringLen;
        System.out.println(stringWithInt);

        String movie = "My favourite movie is \n\"Home Alone\" ";
        System.out.println(movie);

    }
}
