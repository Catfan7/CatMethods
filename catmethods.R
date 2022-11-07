prt <- function(x) {
  print(x);
}

CelToFah <- function(x) {
  return ((x * 1.8) + 32)
}

CelToKel <- function(x) {
  return (x + 273.15)
}

CelToRan <- function(x){
return ((x * 1.8) + 491.67)
}

FahToCel <- function(x){
return ((x - 32) / 1.8)
}

FahToKel <- function(x){
return (FahToCel(x) + 273.15)
}

FahToRan <- function(x){
return (x + 459.67)
}

KelToCel <- function(x){
return (x - 273.15)
}

KelToFah <- function(x){
return (((x - 273.15) * 1.8) + 32)
}

KelToRan <- function(x){
return (x * 1.8)
}

RanToCel <- function(x){
return ((x - 491.67) / 1.8)
}

RanToFah <- function(x){
return (x - 459.67)
}

RanToKel <- function(x) {
  return (x / 1.8)
}

scanStr <- function(x){
  return (readline())
}

scanInt <- function(x){
  q = readline()
  return (as.integer(q))
}

helloworld <- function(x){
  prt("Hello, world!")
}