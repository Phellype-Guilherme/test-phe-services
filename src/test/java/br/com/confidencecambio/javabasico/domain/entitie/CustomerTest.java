package br.com.confidencecambio.javabasico.domain.entitie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {

    String MOCKED = "              Phellype Guilherme Pereira da Silva             ";

    @Test
    public void testSetName() {
        Customer target = new Customer();
        target.setName(MOCKED);
        assertNotNull("notNull",target);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameNull() {
        Customer target = new Customer();
        target.setName(null);
        assertNotNull("notNull",target);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameEmpty() {
        Customer target = new Customer();
        target.setName("");
        assertNotNull("notNull",target);
    }


    @Test
    public void testFirstName() {
        Customer target = new Customer(MOCKED);
        target.firstName();
        assertNotNull("notNull",target);
    }

    @Test
    public void testLastName() {
        Customer target = new Customer(MOCKED);
        target.lastName();
        assertNotNull("notNull",target);
    }

    @Test
    public void testNameToUpperCase() {
        Customer target = new Customer(MOCKED);
        target.nameToUpperCase();
        assertNotNull("notNull",target);
    }

    @Test
    public void testAbreviatte() {
        Customer target = new Customer(MOCKED);
        target.Abreviatte();
        assertNotNull("notNull",target);
    }

}