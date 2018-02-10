package ch.wesr.prepareforjava.listen;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class LeereListeTest {

    @Test
    public void testLeereListe() {
        LeereListe leereListe = new LeereListe();

        // ja korrekt die Objekt-Referenz Variable ist nicht null,
        // sondern einer Objekt Instanz (new LeereListe() zugewiesen.
        assertNotNull(leereListe);
        // dann muss aber die effektive Liste fehlschlagen
        assertFalse(leereListe.getListe().isEmpty());
        assertNotNull(leereListe.getListe());

    }
}