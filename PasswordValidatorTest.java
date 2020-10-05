/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aneen
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass//annotations
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PasswordValidator.
     */
    
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        PasswordValidator.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of checklength method, of class PasswordValidator.
     */
    @Test
    public void testChecklengthGood() {
        System.out.println("checklength Good test code");
        String password = "adadadad";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);//assertion method
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
        @Test
    public void testChecklengthBad() {
        System.out.println("checklength Bad test code");
        String password = "adad";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testChecklengthBoundary() {
        System.out.println("checklength Boundary test code");
        String password = "adadada";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testCheckspecialGood() {
        System.out.println("checkspecial Good test code");
        String password = "adadada@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecial(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testCheckspecialBad() {
        System.out.println("checkspecial Bad test code");
        String password = "adadad";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecial(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testCheckspecialBoundary() {
        System.out.println("checkspecial Boundary test code");
        String password = "";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecial(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testCheckupperGood() {
        System.out.println("checkupper Good test code");
        String password = "adaDadad";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpper(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testCheckupperBoundary() {
        System.out.println("checkupper Boundary test code");
        String password = "";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpper(password);
        assertEquals(expResult, result);//assertion method
    }
    @Test
    public void testCheckupperBad() {
        System.out.println("checkupper Bad test code");
        String password = "adadadad";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpper(password);
        assertEquals(expResult, result);//assertion method
    }
    
}
