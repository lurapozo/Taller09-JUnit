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
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
Object littleBigPlanet, halo, smash, lol;
VideoGameRental one, two, three, four, five;
    @Before
    public void setUp() {
    littleBigPlanet = new Ps3Game("Little Big Planet");
    halo = new Xbox360Game("Halo");
    smash= new WiiGame("Smash");
    lol=new Object();
    one=new VideoGameRental(littleBigPlanet, 5, true);
    two=new VideoGameRental(halo, 5, false);
    three=new VideoGameRental(smash, -5, true);
    four=new VideoGameRental(lol, 5, true);
    five=null;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        int expResult = 5;
        int result1 = one.getDaysRented();
        assertEquals(expResult, result1);
        int result2 = two.getDaysRented();
        assertEquals(expResult, result2);
    }

    @Test
    public void testGetDaysRentedNegativo() {
        try {
            System.out.println("testGetDaysRentedNegativo");
            int result = three.getDaysRented();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    @Test
    public void testGetDaysRentedJuegoNull() {
        System.out.println("testGetDaysRentedJuegoNull");
        int expResult = 5;
        int result = four.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDaysRentedNull() {
        try {
            System.out.println("testGetDaysRentedNull");
            int result = five.getDaysRented();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        Object expResult = littleBigPlanet;
        Object result = one.getVideoGame();
        assertEquals(expResult, result);
        Object expResult1 = halo;
        Object result1 = two.getVideoGame();
        assertEquals(expResult1, result1);
        Object expResult2 = smash;
        Object result2 = three.getVideoGame();
        assertEquals(expResult2, result2);
    }

    @Test
    public void testGetVideoGameJuegoEsObjeto() {
        try {
            System.out.println("testGetVideoGameJuegoEsObjeto");
            Object result = four.getVideoGame();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }
    @Test
    public void testGetVideoGameNull() {
        try {
            System.out.println("testGetVideoGameNull");
            Object result = five.getVideoGame();
            fail("No tiro excepcion cuando debia");
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    }
    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        double result = one.getCharge();
        assertTrue(result>4);
        double result2 = two.getCharge();
        assertTrue(result2>3.5);
    }

    @Test
    public void testGetChargeDiasNegativos() {
        try{
            System.out.println("testGetChargeDiasNegativos");
            double result = three.getCharge();
            fail("No tiro excepcion cuando debia");
        }catch(Exception ex){
            System.err.println("Si tiro el error esperado");
        }
    }

    @Test
    public void testGetChargeJuegoNulo() {
        try{
            System.out.println("testGetChargeJuegoNulo");
            double result = four.getCharge();
            fail("No tiro excepcion cuando debia");
        }catch(Exception ex){
            System.err.println("Si tiro el error esperado");
        }
    }

    @Test
    public void testGetChargeNulo() {
        try{
            System.out.println("testGetChargeNulo");
            double result = five.getCharge();
            fail("No tiro excepcion cuando debia");
        }catch(Exception ex){
            System.err.println("Si tiro el error esperado");
        }
    }
    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        int expResult = 2+1;
        int result = one.getFrequentRenterPoints();
        assertEquals(expResult, result);
        int expResult2 = 2;
        int result2 = two.getFrequentRenterPoints();
        assertEquals(expResult2, result2);
    }
    @Test
    public void testGetFrequentRenterPointsDiasNegativos() {
        try {
            System.out.println("testGetFrequentRenterPointsDiasNegativos");
            int result = three.getFrequentRenterPoints();
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    } 

    @Test
    public void testGetFrequentRenterPointsJuegoNull() {
        try {
            System.out.println("testGetFrequentRenterPointsJuegoNull");
            int result = four.getFrequentRenterPoints();
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    } 
    @Test
    public void testGetFrequentRenterPointsNull() {
        try {
            System.out.println("testGetFrequentRenterPointsNull");
            int result = five.getFrequentRenterPoints();
        } catch (Exception ex) {
            System.err.println("Si tiro el error esperado");
        }
    } 
}
