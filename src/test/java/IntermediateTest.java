import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntermediateTest {
    @Test
    void zahlenwortTestforNull(){

        // GIVEN
        int n = 0;

        // WHEN
        String actual = Intermediate.zahlenwort(n);

        // THEN
        assertEquals("Es gibt kein Zahlenwort im Array für das Null!", actual);

    }
    @Test
    void zahlenwortTestforEins(){

        // GIVEN
        int n = 1;

        // WHEN
        String actual = Intermediate.zahlenwort(n);

        // THEN
        assertEquals("Eins", actual);

    }
    @Test
    void zahlenwortTestforZwei(){

        // GIVEN
        int n = 2;

        // WHEN
        String actual = Intermediate.zahlenwort(n);

        // THEN
        assertEquals("Zwei", actual);

    }

    @Test
    void zahlenwortTestforZehn(){

        // GIVEN
        int n = 10;

        // WHEN
        String actual = Intermediate.zahlenwort(n);

        // THEN
        assertEquals("Nur zu einer einstelligen Zahl wird ein entsprechendes Zahlenwort ausgegeben!", actual);

    }

    @Test
    void zahlenTestforNull(){

        // GIVEN
        int n = 0;

        // WHEN
        String actual = Intermediate.zahlen(n);

        // THEN
        assertEquals("Falsche Eingabeparameter!", actual);

    }

    @Test
    void zahlenTestforEins(){

        // GIVEN
        int n = 1;

        // WHEN
        String actual = Intermediate.zahlen(n);

        // THEN
        assertEquals("1", actual);

    }

    @Test
    void zahlenTestforDrei(){

        // GIVEN
        int n = 3;

        // WHEN
        String actual = Intermediate.zahlen(n);

        // THEN
        assertEquals("#3", actual);

    }

    @Test
    void zahlenTestforFünf(){

        // GIVEN
        int n = 5;

        // WHEN
        String actual = Intermediate.zahlen(n);

        // THEN
        assertEquals("$5", actual);

    }

    @Test
    void zahlenTestforDreiUndFünf(){

        // GIVEN
        int n = 15;

        // WHEN
        String actual = Intermediate.zahlen(n);

        // THEN
        assertEquals("15", actual);

    }
}
