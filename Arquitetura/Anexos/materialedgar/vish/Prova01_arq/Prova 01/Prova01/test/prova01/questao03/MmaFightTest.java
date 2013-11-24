/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01.questao03;

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
public class MmaFightTest {
    
    public MmaFightTest() {
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
     * Test of executarGolpe method, of class MmaFight.
     */
    @Test
    public void testExecutarGolpe() {
        MmaFight mmaFight = new MmaFight();
        
        mmaFight.executarGolpe(MmaFight.Lutador.AndersonSilva, MmaFight.KRAV_MAGA, MmaFight.Golpe.soco);
        mmaFight.executarGolpe(MmaFight.Lutador.VitorBelfort, MmaFight.KICK_BOXING, MmaFight.Golpe.chute);
        mmaFight.executarGolpe(MmaFight.Lutador.AndersonSilva, MmaFight.JIU_JITSU, MmaFight.Golpe.finalizacao);
        mmaFight.executarGolpe(MmaFight.Lutador.AndersonSilva, MmaFight.KRAV_MAGA, MmaFight.Golpe.soco);
        mmaFight.executarGolpe(MmaFight.Lutador.VitorBelfort, MmaFight.KICK_BOXING, MmaFight.Golpe.chute);
        mmaFight.executarGolpe(MmaFight.Lutador.AndersonSilva, MmaFight.JIU_JITSU, MmaFight.Golpe.soco);
        mmaFight.executarGolpe(MmaFight.Lutador.VitorBelfort, MmaFight.KRAV_MAGA, MmaFight.Golpe.chute);
        mmaFight.executarGolpe(MmaFight.Lutador.VitorBelfort, MmaFight.JIU_JITSU, MmaFight.Golpe.finalizacao);
        mmaFight.executarGolpe(MmaFight.Lutador.AndersonSilva, MmaFight.KRAV_MAGA, MmaFight.Golpe.soco);
        mmaFight.executarGolpe(MmaFight.Lutador.AndersonSilva, MmaFight.KICK_BOXING, MmaFight.Golpe.chute);
        
    }
}
