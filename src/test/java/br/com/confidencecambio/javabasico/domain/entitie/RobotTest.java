package br.com.confidencecambio.javabasico.domain.entitie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RobotTest {

    String MOCKED = "              Phellype Guilherme Pereira da Silva             ";

    @Test
    public void testSetName() {
        Robot target = new Robot();
        target.setName(MOCKED);
        assertNotNull("notNull",target);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameNull() {
        Robot target = new Robot();
        target.setName(null);
        assertNotNull("notNull",target);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameEmpty() {
        Robot target = new Robot();
        target.setName("");
        assertNotNull("notNull",target);
    }


    @Test
    public void testFirstName() {
        Robot target = new Robot(MOCKED);
        target.firstName();
        assertNotNull("notNull",target);
    }

    @Test
    public void testLastName() {
        Robot target = new Robot(MOCKED);
        target.lastName();
        assertNotNull("notNull",target);
    }

    @Test
    public void testNameToUpperCase() {
        Robot target = new Robot(MOCKED);
        target.nameToUpperCase();
        assertNotNull("notNull",target);
    }

    @Test
    public void testAbreviatte() {
        Robot target = new Robot(MOCKED);
        target.Abreviatte();
        assertNotNull("notNull",target);
    }

}