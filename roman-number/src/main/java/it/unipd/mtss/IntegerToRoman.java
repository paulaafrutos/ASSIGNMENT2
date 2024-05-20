////////////////////////////////////////////////////////////////////
// Paula Frutos Romo 2099339
// German Gil Planes 2099465
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

public static String convert(int number) {
String romano;
if (number > 1000) {
romano = "";
} else if (number == 1000) {
romano = "M";
} else if (number < 500) {
romano = convert500(number);
} else if (number >= 900) {
romano = "CM" + convert100(number - 900);
} else {
romano = "D" + convert500(number - 500);
}
return romano;
}

private static String convert5(int number) {
String romano = "";
if (number == 4) {
romano = "IV";
} else {
for (int i = 0; i < number; i++) {
romano += "I";
}
}
return romano;
}

private static String convert10(int number) {
String romano;
if (number < 5) {
romano = convert5(number);
} else if (number == 9) {
romano = "IX";
} else {
romano = "V" + convert5(number - 5);
}
return romano;
}

private static String convert50(int number) {
String romano = "";
if (number < 10) {
romano = convert10(number);
} else if (number >= 40) {
romano = "XL" + convert10(number - 40);
} else {
int n = number / 10;
int resto = number - 10 * n;
for (int i = 0; i < n; i++) {
romano += "X";
}
romano += convert10(resto);
}
return romano;
}

private static String convert100(int number) {
String romano;
if (number < 50) {
romano = convert50(number);
} else if (number >= 90) {
romano = "XC" + convert10(number - 90);
} else {
romano = "L" + convert50(number - 50);
}
return romano;
}

private static String convert500(int number) {
String romano = "";
if (number < 100) {
romano = convert100(number);
} else if (number >= 400) {
romano = "CD" + convert100(number - 400);
} else {
int n = number / 100;
int resto = number - 100 * n;
for (int i = 0; i < n; i++) {
romano += "C";
}
romano += convert100(resto);
}
return romano;
}
}
