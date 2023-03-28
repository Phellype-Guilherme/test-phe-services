package br.com.confidencecambio.javabasico.domain.entitie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ManagerTest {

    String MOCKED = "              Phellype Guilherme Pereira da Silva             ";

    @Test
    public void testSetName() {
        Manager target = new Manager();
        target.setName(MOCKED);
        assertNotNull("notNull",target);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameNull() {
        Manager target = new Manager();
        target.setName(null);
        assertNotNull("notNull",target);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameEmpty() {
        Manager target = new Manager();
        target.setName("");
        assertNotNull("notNull",target);
    }


    @Test
    public void testFirstName() {
        Manager target = new Manager(MOCKED);
        target.firstName();
        assertNotNull("notNull",target);
    }

    @Test
    public void testLastName() {
        Manager target = new Manager(MOCKED);
        target.lastName();
        assertNotNull("notNull",target);
    }

    @Test
    public void testNameToUpperCase() {
        Manager target = new Manager(MOCKED);
        target.nameToUpperCase();
        assertNotNull("notNull",target);
    }

    @Test
    public void testAbreviatte() {
        Manager target = new Manager(MOCKED);
        target.Abreviatte();
        assertNotNull("notNull",target);
    }

}