/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.fatorial.FactoriaClase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dany
 */
public class TestFactorial {
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestFact() {
         int[] listaNumeros={-2};
         FactoriaClase fac = new FactoriaClase();
         Object[] Resultado = (Object[]) fac.Factorial(listaNumeros);
        
         for(int a=0;a<=listaNumeros.length;a++) 
            {
             assertEquals("Esta función solo acepta números positivos o cero!!!", Resultado[a]);
            }
       }
}
