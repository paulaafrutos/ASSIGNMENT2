////////////////////////////////////////////////////////////////////
// Paula Frutos Romo 2099339
// German Gil Planes 2099465
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

// Imprimimos todas las letras
@Test
public void test1() {
RomanPrinter.print(1);
}

@Test
public void test5() {
RomanPrinter.print(5);
}

@Test
public void test10() {
RomanPrinter.print(10);
}

@Test
public void test50() {
RomanPrinter.print(50);
}

@Test
public void test100() {
RomanPrinter.print(100);
}

@Test
public void test500() {
RomanPrinter.print(500);
}

@Test
public void test1000() {
RomanPrinter.print(1000);
}

// Imprimimos numeros mas complejos
@Test
public void test666() {
RomanPrinter.print(666);
}

@Test
public void test888() {
RomanPrinter.print(888);
}

@Test
public void test968() {
RomanPrinter.print(968);
}

@Test
public void testLetterToNumber() {
assertEquals(RomanPrinter.letterToNumber('I'), 0);
assertEquals(RomanPrinter.letterToNumber('V'), 1);
assertEquals(RomanPrinter.letterToNumber('X'), 2);
assertEquals(RomanPrinter.letterToNumber('L'), 3);
assertEquals(RomanPrinter.letterToNumber('C'), 4);
assertEquals(RomanPrinter.letterToNumber('D'), 5);
assertEquals(RomanPrinter.letterToNumber('M'), 6);
}

}
