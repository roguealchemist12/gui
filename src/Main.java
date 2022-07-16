import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.search;

public class Main {
    public static void main(String[] args) {


        int [] a1 = new int [] {0,23,14,23,5,2,1,4242};
        Arrays.sort(a1);
        int count = 1;

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]); int indexValue = search(a1,23);
//        if(indexValue == -1)
//        {
//            System.out.println("Elements not found");
//        }
//        else {
//            System.out.println("Element is found and its index is " + indexValue);
//        }

        }

//
        Presmetki obj = new Presmetki();



        Scanner cin = new Scanner(System.in);

//        int a = cin.nextInt();
//        int b = cin.nextInt();

     //   new GUI();


    }
}
