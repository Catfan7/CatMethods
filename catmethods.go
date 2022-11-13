package main

import (
	"fmt"
)

func prts(x string) {
	fmt.Println(x)
}

func prti(x int) {
	fmt.Println(x)
}

func prtf32(x float32) {
	fmt.Println(x)
}

func prtf64(x float64) {
	fmt.Println(x)
}

func CelToFah(x float32) (result float32) {
	return ((x * 1.8) + 32)
}

func CelToKel(x float32) (result float32) {
	return (x + 273.15)
}

func CelToRan(x float32) (result float32) {
	return ((x * 1.8) + 491.67)
}

func FahToCel(x float32) (result float32) {
	return ((x - 32) / 1.8)
}

func FahToKel(x float32) (result float32) {
	return (FahToCel(x) + 273.15)
}

func FahToRan(x float32) (result float32) {
	return (x + 459.67)
}

func KelToCel(x float32) (result float32) {
	return (x - 273.15)
}

func KelToFah(x float32) (result float32) {
	return (((x - 273.15) * 1.8) + 32)
}

func KelToRan(x float32) (result float32) {
	return (x * 1.8)
}

func RanToCel(x float32) (result float32) {
	return ((x - 491.67) / 1.8)
}

func RanToFah(x float32) (result float32) {
	return (x - 459.67)
}

func RanToKel(x float32) (result float32) {
	return (x / 1.8)
}

func scanStr(x string) (result string) {
	fmt.Scanln(&x)
	return x
}

func scanInt(x int) (result int) {
	fmt.Scanln(&x)
	return int(x)
}

func scanFloat32(x float32) (result float32) {
	fmt.Scanln(&x)
	return x
}

func scanFloat64(x float64) (result float64) {
	fmt.Scanln(&x)
	return x
}

func scanBool(x bool) (result bool) {
	fmt.Scanln(&x)
	return bool(x)
}

func helloWorld() {
	prts("Hello, world!")
}
