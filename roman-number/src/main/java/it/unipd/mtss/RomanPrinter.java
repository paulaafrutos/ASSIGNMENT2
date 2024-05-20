////////////////////////////////////////////////////////////////////
// Paula Frutos Romo 2099339
// German Gil Planes 2099465
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
public static String print(int num) {
return printAsciiArt(IntegerToRoman.convert(num));
}

private static String printAsciiArt(String romanNumber) {
String[][] drawing = new String[6][7];

// Drawing of I
drawing[0][0] = " _____ ";
drawing[1][0] = "|_   _|";
drawing[2][0] = "  | |  ";
drawing[3][0] = "  | |  ";
drawing[4][0] = " _| |_ ";
drawing[5][0] = "|_____|";

// Drawing of V
drawing[0][1] = "__      __";
drawing[1][1] = "\\ \\    / /";
drawing[2][1] = " \\ \\  / / ";
drawing[3][1] = "  \\ \\/ /  ";
drawing[4][1] = "   \\  /   ";
drawing[5][1] = "    \\/    ";

// Drawing of X
drawing[0][2] = "__   __";
drawing[1][2] = "\\ \\ / /";
drawing[2][2] = " \\ V / ";
drawing[3][2] = "  > <  ";
drawing[4][2] = " / . \\ ";
drawing[5][2] = "/_/ \\_\\";

// Drawing of L
drawing[0][3] = " _     ";
drawing[1][3] = "| |    ";
drawing[2][3] = "| |    ";
drawing[3][3] = "| |    ";
drawing[4][3] = "| |___ ";
drawing[5][3] = "|_____|";

// Drawing of C
drawing[0][4] = "  ____ ";
drawing[1][4] = " / ___|";
drawing[2][4] = "| |    ";
drawing[3][4] = "| |    ";
drawing[4][4] = "| |___ ";
drawing[5][4] = " \\____|";

// Drawing of D
drawing[0][5] = " _____  ";
drawing[1][5] = "|  __ \\ ";
drawing[2][5] = "| |  | |";
drawing[3][5] = "| |  | |";
drawing[4][5] = "| |__| |";
drawing[5][5] = "|_____/ ";

// Drawing of M
drawing[0][6] = " __  __ ";
drawing[1][6] = "|  \\/  |";
drawing[2][6] = "| \\  / |";
drawing[3][6] = "| |\\/| |";
drawing[4][6] = "| |  | |";
drawing[5][6] = "|_|  |_|";

for (int i = 0; i < 6; i++) {
String line = "";
for(int j = 0; j<romanNumber.length(); j++) {
line = line + drawing[i][letterToNumber(romanNumber.charAt(j))] + " ";
}
System.out.println(line);
}

return null;
}

public static int letterToNumber (char c) {
switch(c) {
case 'I':
return 0;
case 'V':
 return 1;
case 'X':
 return 2;
case 'L':
 return 3;
case 'C':
 return 4;
case 'D':
 return 5;
case 'M':
return 6;
default:
return -1;
}
}
}