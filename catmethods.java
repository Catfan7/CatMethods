import javax.swing.*;
import java.util.Scanner;

public class catmethods {
    public static double CelToFah(double x) {
        return (x * 1.8) + 32;
    }
    public static double CelToKel(double x) {
        return x + 273.15;
    }
    public static double CelToRan(double x) {
        return (x * 1.8) + 491.67;
    }
    public static double FahToCel(double x) {
        return (x - 32) / 1.8;
    }
    public static double FahToKel(double x) {
        return FahToCel(x) + 273.15;
    }
    public static double FahToRan(double x) {
        return x + 459.67;
    }
    public static double KelToCel(double x) {
        return x - 273.15;
    }
    public static double KelToFah(double x) {
        return ((x - 273.15) * 1.8) + 32;
    }
    public static double KelToRan(double x) {
        return x * 1.8;
    }
    public static double RanToCel(double x) {
        return (x - 491.67) / 1.8;
    }
    public static double RanToFah(double x) {
        return x - 459.67;
    }
    public static double RanToKel(double x) {
        return x / 1.8;
    }
    public static void prts(String x) {
        System.out.println(x);
    }
    public static void prti(int x) {System.out.println(x);}
    public static void prtf(float x) {System.out.println(x);}
    public static void prtd(double x) {System.out.println(x);}
    public static void prtb(boolean x) {System.out.println(x);}
    public static void prtc(char x) {System.out.println(x);}
    public static void dialog(String title, int x, int y, String input) {
        JDialog d = new JDialog();
        JLabel l = new JLabel(input);
        l.setBounds((x/2) - 50,(y/2) - 30,100,30);
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        d.setLayout(null);
        d.setTitle(title);
        d.setSize(x, y);
        d.setVisible(true);
        d.add(l);
    }
    public static String scanStr() {
        Scanner obj = new Scanner(System.in);
        return obj.nextLine();
    }
    public static int scanInt() {
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }
    public static float scanFlt() {
        Scanner obj = new Scanner(System.in);
        return obj.nextFloat();
    }
    public static double scanDob() {
        Scanner obj = new Scanner(System.in);
        return obj.nextDouble();
    }
    public static void helloWorld() {
        prts("Hello, world!");
    }
    public static int calculator(String op, int x, int y) {
        int ans = 32767;
        switch (op) {
            case "add":
                ans = x + y;
                break;
            case "subtract":
                ans = x - y;
                break;
            case "multiply":
                ans = x * y;
                break;
            case "divide":
                ans = x / y;
                break;
            case "exponent":
                ans = x ^ y;
                break;
        }
        return ans;
    }
    public static double tempConverter(String in, String out, int input) {
        double output = 69.420;
        switch (in) {
            case "cel":
                switch (out) {
                    case "cel":
                        output = input;
                        break;
                    case "fah":
                        output = CelToFah(input);
                        break;
                    case "kel":
                        output = CelToKel(input);
                        break;
                    case "ran":
                        output = CelToRan(input);
                        break;
                }
                break;
            case "fah":
                switch (out) {
                    case "cel":
                        output = FahToCel(input);
                        break;
                    case "fah":
                        output = input;
                        break;
                    case "kel":
                        output = FahToKel(input);
                        break;
                    case "ran":
                        output = FahToRan(input);
                        break;
                }
                break;
            case "kel":
                switch (out) {
                    case "cel":
                        output = KelToCel(input);
                        break;
                    case "fah":
                        output = KelToFah(input);
                        break;
                    case "kel":
                        output = input;
                        break;
                    case "ran":
                        output = KelToRan(input);
                        break;
                }
                break;
            case "ran":
                switch (out) {
                    case "cel":
                        output = RanToCel(input);
                        break;
                    case "fah":
                        output = RanToFah(input);
                        break;
                    case "kel":
                        output = RanToKel(input);
                        break;
                    case "ran":
                        output = input;
                        break;
                }
                break;
        }
        return output;
    }
}