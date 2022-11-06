using System;

public class catmethods
{
    public static void prts(String x)
    {
        Console.WriteLine(x);
    }
    public static void prti(int x) { Console.WriteLine(x); }
    public static void prtf(float x) { Console.WriteLine(x); }
    public static void prtd(double x) { Console.WriteLine(x); }
    public static void prtb(bool x) { Console.WriteLine(x); }
    public static void prtc(char x) { Console.WriteLine(x); }
    public static double CelToFah(double x)
    {
        return (x * 1.8) + 32;
    }
    public static double CelToKel(double x)
    {
        return x + 273.15;
    }
    public static double CelToRan(double x)
    {
        return (x * 1.8) + 491.67;
    }
    public static double FahToCel(double x)
    {
        return (x - 32) / 1.8;
    }
    public static double FahToKel(double x)
    {
        return FahToCel(x) + 273.15;
    }
    public static double FahToRan(double x)
    {
        return x + 459.67;
    }
    public static double KelToCel(double x)
    {
        return x - 273.15;
    }
    public static double KelToFah(double x)
    {
        return ((x - 273.15) * 1.8) + 32;
    }
    public static double KelToRan(double x)
    {
        return x * 1.8;
    }
    public static double RanToCel(double x)
    {
        return (x - 491.67) / 1.8;
    }
    public static double RanToFah(double x)
    {
        return x - 459.67;
    }
    public static double RanToKel(double x)
    {
        return x / 1.8;
    }
    public static string scanStr()
    {
        return Console.ReadLine();
    }
    public static int scanInt()
    {
        return Convert.ToInt32(Console.ReadLine());
    }
    public static double scanDob()
    {
        return Convert.ToDouble(Console.ReadLine());
    }
    public static void helloWorld()
    {
        prts("Hello, world!");
    }
    public static int calculator(String op, int x, int y)
    {
        int ans = 32767;
        switch (op)
        {
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
    public static double tempConverter(String inq, String outq, int input)
    {
        double output = 69.420;
        switch (inq) {
            case "cel":
                switch (outq) {
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
                switch (outq) {
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
                switch (outq) {
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
                switch (outq) {
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
