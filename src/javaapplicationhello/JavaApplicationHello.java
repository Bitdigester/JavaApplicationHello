/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationhello;
import java.io.*;
/**
 *
 * @author Lenovo
 */
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author Lenovo
 */
public class JavaApplicationHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    FileInputStream fis = null;  
    System.out.println("Hello World!");
                
    String fileName = "xxxx";
    try
    {
      fis = new FileInputStream(fileName);
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("" +ex);
    }
    finally
    {
      System.out.println("f2: finally block");
    }
    System.out.println("f2: Returning from f2");
    return;
                
	}
}
        // TODO code application logic here
    
    

