#include <iostream>

using std::endl;
// "bool newline" determines whether a new line is printed after the text
void prts(std::string x, bool newline) {
    std::cout << x;
    if (newline) {
        std::cout << endl;
    }
}
static void prti(int x, bool newline) { std::cout << x; if (newline) {
    std::cout << endl;
}
}
static void prtf(float x, bool newline) { std::cout << x; if (newline) {
    std::cout << endl;
}
}
static void prtd(double x, bool newline) { std::cout << x; if (newline) {
    std::cout << endl;
}
}
static void prtb(bool x, bool newline) { std::cout << x; if (newline) {
    std::cout << endl;
}
}
static void prtc(char x, bool newline) { std::cout << x; if (newline) {
    std::cout << endl;
}
}

static double CelToFah(double x) {
    return (x * 1.8) + 32;
}
static double CelToKel(double x) {
    return x + 273.15;
}
static double CelToRan(double x) {
    return (x * 1.8) + 491.67;
}
static double FahToCel(double x) {
    return (x - 32) / 1.8;
}
static double FahToKel(double x) {
    return FahToCel(x) + 273.15;
}
static double FahToRan(double x) {
    return x + 459.67;
}
static double KelToCel(double x) {
    return x - 273.15;
}
static double KelToFah(double x) {
    return ((x - 273.15) * 1.8) + 32;
}
static double KelToRan(double x) {
    return x * 1.8;
}
static double RanToCel(double x) {
    return (x - 491.67) / 1.8;
}
static double RanToFah(double x) {
    return x - 459.67;
}
static double RanToKel(double x) {
    return x / 1.8;
}
static std::string scanStr() {
    std::string x;
    std::cin >> x;
    return x;
}
static int scanInt() {
    int x;
    std::cin >> x;
    return x;
}
static float scanFlt() {
    float x;
    std::cin >> x;
    return x;
}
static double scanDob() {
    double x;
    std::cin >> x;
    return x;
}
static void helloWorld() {
    prts("Hello, world!", true);
}
static int calculator(int op, int x, int y) {
    int ans = 69420;
    switch (op) {
    case 0:
        ans = x + y;
        break;
    case 1:
        ans = x - y;
        break;
    case 2:
        ans = x * y;
        break;
    case 3:
        ans = x / y;
        break;
    case 4:
        ans = x ^ y;
        break;
    }
    return ans;
}
