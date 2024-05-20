////////////////////////////////////////////////////////////////////
// Paula Frutos Romo 2099339
// German Gil Planes 2099465
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IntegerToRomanTest {
    private static String[] cad;

    @BeforeClass
    public static void setUp() {
        // Ruta del archivo que contiene los valores
        String filePath = "src/main/resources/1000numerosRomanos.txt";
        BufferedReader br = null;
        
        // Inicializa el array cad desde el archivo
        try {
        br = new BufferedReader(new FileReader(filePath));
            long count = br.lines().count();
            cad = new String[(int) count];
            br = new BufferedReader(new FileReader(filePath));
            int index = 0;
            String line;
            while ((line = br.readLine()) != null) {
            cad[index++] = line;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @Test
    public void test() {
        for(int n = 0; n < cad.length; n++) {
            System.out.println(n + " ==> " + IntegerToRoman.convert(n));
            assertEquals(IntegerToRoman.convert(n), cad[n]);
        }
    }
}