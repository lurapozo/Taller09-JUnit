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
public class CustomerTest {

    public CustomerTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    Movie mulan;
    MovieRental uno, tres;
    Object littleBigPlanet;
    VideoGameRental one, five;
    Customer pa, pe, pi, po, manuel;

    @org.junit.Before
    public void setUp() throws Exception {
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        uno = new MovieRental(mulan, 3);
        tres = null;

        littleBigPlanet = new Ps3Game("Little Big Planet");
        one = new VideoGameRental(littleBigPlanet, 5, true);
        five = null;

        pa = new Customer("Pa");
        pe = new Customer(null);
        pi = null;
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @org.junit.Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        try {
            pa.addMovieRental(uno);
        } catch (Exception ex) {
            fail("Tiro excepcion cuando no debia");
        }
    }

    @org.junit.Test
    public void testAddMovieRentalMovieRentalNulo() {
        System.out.println("testAddMovieRentalMovieRentalNulo");
        try {
            pa.addMovieRental(tres);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testAddMovieRentalCustomerNulo() {
        System.out.println("testAddMovieRentalCustomerNulo");
        try {
            pi.addMovieRental(uno);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testAddMovieRentalCustomerNombreNulo() {
        System.out.println("testAddMovieRentalCustomerNombreNulo");
        try {
            pe.addMovieRental(uno);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testAddMovieRentalCustomerSinInicializar() {
        System.out.println("testAddMovieRentalCustomerSinInicializar");
        try {
            manuel.addMovieRental(uno);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @org.junit.Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        try {
            pa.addVideoGameRental(one);
        } catch (Exception ex) {
            fail("Tiro excepcion cuando no debia");
        }
    }

    @org.junit.Test
    public void testAddVideoGameRentalListaNulo() {
        System.out.println("testAddVideoGameRentalListaNulo");
        try {
            pa.addVideoGameRental(five);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testAddVideoGameRentalNombreNulo() {
        System.out.println("testAddVideoGameRentalNombreNulo");
        try {
            pe.addVideoGameRental(one);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testAddVideoGameRentalCustomerNulo() {
        System.out.println("testAddVideoGameRentalCustomerNulo");
        try {
            pi.addVideoGameRental(one);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    /**
     * Test of statement method, of class Customer.
     */
    @org.junit.Test
    public void testStatementSinPeliculas() {
        System.out.println("testStatementSinPeliculas");
        String expResult = "Rental Record for Pa\n Amount owed is 0.0\n You earned 0 frequent renter points";
        String result = pa.statement();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testStatementNombreNull() {
        System.out.println("testStatementNombreNull");
        try {
            String result = pe.statement();
            System.out.println(result);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testStatementCustomerNulo() {
        System.out.println("testStatementCustomerNulo");
        try {
            String result = pi.statement();
            System.out.println(result);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @org.junit.Test
    public void testStatementCustomerSinInicializar() {
        System.out.println("testStatementCustomerNulo");
        try {
            String result = manuel.statement();
            System.out.println(result);
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }
}
