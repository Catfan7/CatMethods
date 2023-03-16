#include <stdio.h>

// "newline" determines whether a new line is created after the statement is printed
// set newline to 1 to do so
void prts(char toPrint[], int newline) {
    printf("%s", toPrint);
    if (newline == 1) {
        printf("\n");
    }
}
static void prti(int toPrint, int newline) {
    printf("%d", toPrint);
    if (newline == 1) {
        printf("\n");
    }
}
static void prtf(float toPrint, int newline) {
    printf("%f", toPrint);
    if (newline == 1) {
        printf("\n");
    }
}
static void prtc(char toPrint, int newline) { 
    printf("%c", toPrint);
    if (newline == 1) {
        printf("\n");
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
static char * scanStr() {
    char x[2056];
    scanf("%s", x);
    return x;
}
static int scanInt() {
    int x;
    scanf("%d", &x);
    return x;
}
static float scanFlt() {
    float x;
    scanf("%f", x);
    return x;
}
static void helloWorld() {
    prts("Hello, world!", 1);
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
