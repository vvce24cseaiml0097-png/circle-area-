
package com.example.circle_area;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCircleArea() {

        ByteArrayOutputStream output =
            new ByteArrayOutputStream();

        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            App.main(new String[]{});
        } finally {
            System.setOut(original);
        }

        String result = output.toString();

        assertTrue(result.contains("Radius = 5.0"));

        assertTrue(
            result.contains("Area of Circle = 78.54")
        );
    }
}
