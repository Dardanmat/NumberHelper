/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.numberhelper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author darda
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() {
        int a = 30;
        
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(a);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd() {
        int a = 31;
        
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(a);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        int a = 31;
        
        System.out.println("sum");
        int n = 4;
        NumberHelper instance = new NumberHelper(a);
        int expResult = a+n;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() {
        int a = 31;
        
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(a);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy() {
        int a = 30; 
        
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(a);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
}
