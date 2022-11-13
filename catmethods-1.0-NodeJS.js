function prtcl(x) {
	console.log(x)
}

function prtcw(x) {
    console.warn(x)
}

function prtce(x) {
	console.error(x)
}

function prta(x) {
	alert(x)
}

function CelToFah( x) {
    return (x * 1.8) + 32;
}
function CelToKel( x) {
    return x + 273.15;
}
function CelToRan( x) {
    return (x * 1.8) + 491.67;
}
function FahToCel( x) {
    return (x - 32) / 1.8;
}
function FahToKel( x) {
    return FahToCel(x) + 273.15;
}
function FahToRan( x) {
    return x + 459.67;
}
function KelToCel( x) {
    return x - 273.15;
}
function KelToFah( x) {
    return ((x - 273.15) * 1.8) + 32;
}
function KelToRan( x) {
    return x * 1.8;
}
function RanToCel( x) {
    return (x - 491.67) / 1.8;
}
function RanToFah( x) {
    return x - 459.67;
}
function RanToKel( x) {
    return x / 1.8;
}
function scanPrm(x) {
	return prompt(x)
}
function scanCon(x) {
    console.log("This function is still in development")
}
function helloworld(x) {
	console.log("Hello, world!")
}
function calculator(op, x, y) {
        ans = 69420;
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
function tempConverter(in, out, input) {
        output = 69.420;
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
