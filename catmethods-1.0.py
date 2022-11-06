import tkinter as tk


def prt(x):
    print(x)


def CelToFah(x):
    return (x * 1.8) + 32


def CelToKel(x):
    return x + 273.15


def CelToRan(x):
    return (x * 1.8) + 491.67


def FahToCel(x):
    return (x - 32) / 1.8


def FahToKel(x):
    return FahToCel(x) + 273.15


def FahToRan(x):
    return x + 459.67


def KelToCel(x):
    return x - 273.15


def KelToFah(x):
    return ((x - 273.15) * 1.8) + 32


def KelToRan(x):
    return x * 1.8


def RanToCel(x):
    return (x - 491.67) / 1.8


def RanToFah(x):
    return x - 459.67


def RanToKel(x):
    return x / 1.8


def dialog(title, inp):
    d = tk.Tk()
    d.geometry("300x200")
    d.title(title)
    l = tk.Label(d, text=inp).pack()
    d.mainloop()


def scanStr():
    return input()


def scanInt():
    return int(input())


def scanFloat():
    return float(input())


def scanBool():
    return bool(input())


def helloWorld():
    prt("Hello, world!")
