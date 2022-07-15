import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Presmetki obj = new Presmetki();

        Scanner cin = new Scanner(System.in);

//        int a = cin.nextInt();
//        int b = cin.nextInt();

        int a = 2, b = 4;
        obj.setA(a);
        obj.setB(b);
        obj.subtract();
        obj.add();
        obj.multiply();

        new GUI();


    }
}
