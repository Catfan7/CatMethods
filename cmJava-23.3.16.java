import javax.swing.*;
import java.util.Scanner;

public class cmJava {
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
    public static void prts(String x, boolean newline) {
        System.out.print(x);
        if (newline) {
            System.out.print("\n");
        }
    }
    public static void prti(int x, boolean newline) {
        System.out.print(x);
        if (newline) {
            System.out.print("\n");
        }
    }
    public static void prtf(float x, boolean newline) {
        System.out.print(x);
        if (newline) {
            System.out.print("\n");
        }
    }
    public static void prtd(double x, boolean newline) {
        System.out.print(x);
        if (newline) {
            System.out.print("\n");
        }
    }
    public static void prtb(boolean x, boolean newline) {
        System.out.print(x);
        if (newline) {
            System.out.print("\n");
        }
    }
    public static void prtc(char x, boolean newline) {
        System.out.print(x);
        if (newline) {
            System.out.print("\n");
        }
    }
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
        prts("Hello, world!", true);
    }
    public static int calculator(String op, int x, int y) {
        return switch (op) {
            case "add" -> x + y;
            case "subtract" -> x - y;
            case "multiply" -> x * y;
            case "divide" -> x / y;
            case "exponent" -> x ^ y;
            default -> 32767;
        };
    }
    public static double tempConverter(String in, String out, int input) {
        double output = 69.420;
        switch (in) {
            case "cel" -> {
                switch (out) {
                    case "cel" -> output = input;
                    case "fah" -> output = CelToFah(input);
                    case "kel" -> output = CelToKel(input);
                    case "ran" -> output = CelToRan(input);
                }
            }
            case "fah" -> output = switch (out) {
                case "cel" -> FahToCel(input);
                case "fah" -> input;
                case "kel" -> FahToKel(input);
                case "ran" -> FahToRan(input);
                default -> output;
            };
            case "kel" -> output = switch (out) {
                case "cel" -> KelToCel(input);
                case "fah" -> KelToFah(input);
                case "kel" -> input;
                case "ran" -> KelToRan(input);
                default -> output;
            };
            case "ran" -> output = switch (out) {
                case "cel" -> RanToCel(input);
                case "fah" -> RanToFah(input);
                case "kel" -> RanToKel(input);
                case "ran" -> input;
                default -> output;
            };
        }
        return output;
    }
}
