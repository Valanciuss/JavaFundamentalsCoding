package lt_sdacademy_deividas.array.astunta_print_back_entered_string;
//8.Write a simple"echo"application,that will:print back entered string,
//        go to the beginning of a loop if user will enter"continue",
//        break the loop with a"good bye!"message,if user will enter"quit".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Hello World";

        // create a StringBuilder objectwith a String pass as parameter
        StringBuilder str = new StringBuilder(name);
        System.out.print("Ivestas zodis yra: " + "\"" + name + "\"" );

        // reverse the string
        StringBuilder reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = " + reverseStr.toString());

        // Append ', '(44) to the String
        str.appendCodePoint(44);

        // Print the modified String
        System.out.println("Modified StringBuilder = " + str);

        // get capacity
        int capacity = str.capacity();

        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = " + capacity);
    }
}
//{
//
//        String zodis = "Hello World";
//        String reverseZodis = "";
//
//        StringBuilder backEnter = new StringBuilder();
//        System.out.println(backEnter.toString(zodis));
//
//        StringBuilder reverseStr = Str.reverse();
//        System.out.println("Reverse String = " + reverseStr.toString());
//
//
//
//    }
//
//
//}
