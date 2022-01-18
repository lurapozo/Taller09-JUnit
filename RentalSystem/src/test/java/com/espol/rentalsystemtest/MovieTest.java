/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lurapozo
 */
public class MovieTest {

    public MovieTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }

    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire, porFavorNoMiresAtras, nula;

    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
        porFavorNoMiresAtras = new Movie("Por favor, no mires atrás", -1);
        nula = null;
    }

    @Test
    public void testGetPriceCodeAssert() {
        System.out.println("testGetPriceCodeAssert");
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
        assertEquals(Movie.CHILDRENS, mulan.getPriceCode());
        assertEquals(Movie.NEW_RELEASE, slumdogMillionaire.getPriceCode());
    }

    @Test
    public void testGetPriceCodeNULO() {
        System.out.println("testGetPriceCodeNULO");

        try {
            int result = nula.getPriceCode();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }

    }

    @Test
    public void testGetPriceCodeNEGATIVO() {
        System.out.println("testGetPriceCodeNEGATIVO");
        try {

            int result = porFavorNoMiresAtras.getPriceCode();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }

    }

    @Test
    public void testSetPriceCodeNegativo() {
        System.out.println("setPriceCodeNegativo");
        try {

            mulan.setPriceCode(-1);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }

        //System.out.println(mulan.getPrice());
    }

    @Test
    public void testSetPriceCodeNull() {
        System.out.println("setPriceCodeNull");
        try {
            nula.setPriceCode(0);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @Test
    public void testSetPriceCodeAssert() {
        System.out.println("testSetPriceCodeAssert");
        mulan.setPriceCode(5);
        int respuesta = mulan.getPriceCode();
        assertEquals(respuesta, 5);
    }
}
