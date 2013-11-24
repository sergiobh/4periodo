/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01.questao01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgard.cardoso
 */
public class ConversorTest {

    public ConversorTest() {
    }

    @BeforeClass
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
     * Test of converterPara method, of class Conversor.
     */
    @Test
    public void testConverterPara() {
        Conversor conversor = new Conversor();
        conversor.adicionaProduto(new Produto("CD", 19.80));
        conversor.adicionaProduto(new Produto("DvD", 45.00));
        conversor.adicionaProduto(new Produto("Livro", 38.90));
        conversor.adicionaProduto(new Produto("Revista", 7.50));
        conversor.adicionaProduto(new Produto("Jornal", 3.75));
        
        
        System.out.println("------------CONVERTIDO PARA XML------------");
        String xml = conversor.converterPara(Conversor.xml);
        System.out.println(xml);
        
        System.out.println("\n");
        
        System.out.println("------------CONVERTIDO PARA JSON------------");
        String json = conversor.converterPara(Conversor.json);
        System.out.println(json);
        
        System.out.println("\n");
        
        System.out.println("------------CONVERTIDO PARA CSV------------");
        String csv = conversor.converterPara(Conversor.csv);
        System.out.println(csv);
    }
}
