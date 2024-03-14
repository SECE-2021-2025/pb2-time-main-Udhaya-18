import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer hh;
        Integer mm;
        Integer ss;

        System.out.println("Enter the hour");
        hh = sc.nextInt();
        System.out.println("Enter the minute");
        mm = sc.nextInt();
        System.out.println("Enter the seconds");
        ss = sc.nextInt();

        Time t = new Time(hh, mm, ss);
        System.out.println(t.toString());
        System.out.println("Next second : " + t.nextSecond().toString());
        System.out.println("Previous second" + t.previousSecond().toString());
        sc.close();
    }
}
