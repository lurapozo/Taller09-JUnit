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
public class MovieRentalTest {

    public MovieRentalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    MovieRental uno, dos, tres, cuatro;
    Movie mulan;

    @Before
    public void setUp() {
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        uno = new MovieRental(mulan, 3);
        dos = new MovieRental(mulan, -5);
        tres = null;
        cuatro = new MovieRental(null, 4);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("testGetDaysRented");

        int expResult = 3;
        int result = uno.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDaysRentedDiasNegativos() {
        System.out.println("testGetDaysRentedDiasNegativos");
        try {
            int result = dos.getDaysRented();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @Test
    public void testGetDaysRentedNull() {
        System.out.println("testGetDaysRentedNull");
        try {

            int result = tres.getDaysRented();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @Test
    public void testGetDaysRentedPeliNull() {
        System.out.println("testGetDaysRentedPeliNull");
        int expResult = 4;
        int result = cuatro.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Movie expResult = mulan;
        Movie result = uno.getMovie();
        assertEquals(expResult, result);
    }

    public void testGetMovieNula() {
        System.out.println("getMovie");
        try {
            Movie result = tres.getMovie();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    public void testGetMoviePeliNula() {
        System.out.println("testGetMoviePeliNula");
        try {
            Movie result = cuatro.getMovie();
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }
}
