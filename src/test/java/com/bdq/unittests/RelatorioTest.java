// Teste unitário da classe Relatorio, usando o framework de testes junit
// Autor: Ruy Braga Filho
package com.bdq.unittests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import com.bdq.model.entities.Relatorio;


public class RelatorioTest {

    Relatorio relatorio;

    @Before
    public void init() {
        relatorio = new Relatorio( 555, "2022_02", "TE1", "Teste de Software", 87.5 );                
    }


    @Test
    public void testIdPassadoNoConstrutor()  {
        assertEquals( "idRel", (Integer)555, relatorio.getIdRel() );
    }    

    @Test
    public void testAlteracaoDeId()  {
        relatorio.setIdRel( 444 );
        assertEquals( "idRel", (Integer)444, relatorio.getIdRel() );
    }    

    @Test
    public void testSemestrePassadoNoConstrutor()  {
        assertEquals( "semestre", "2022_02", relatorio.getSemestre() );
    }    

    @Test
    public void testAlteracaoDeSemestre()  {
        relatorio.setSemestre( "2022_01" );
        assertEquals( "semestre", "2022_01", relatorio.getSemestre() );
    }    

    @Test
    public void testTurmaPassadaNoConstrutor()  {
        assertEquals( "turma", "TE1", relatorio.getTurma() );
    }    

    @Test
    public void testAlteracaoDeTurma()  {
        relatorio.setTurma( "TE2" );
        assertEquals( "turma", "TE2", relatorio.getTurma() );
    }    

    @Test
    public void testAtividadePassadaNoConstrutor()  {
        assertEquals( "atividade", "Teste de Software", relatorio.getAtividade() );
    }    

    @Test
    public void testAlteracaoDeAtividade()  {
        relatorio.setAtividade( "Engenharia de Software" );
        assertEquals( "atividade", "Engenharia de Software", relatorio.getAtividade() );
    }    

    @Test
    public void testNotaMediaPassadaNoConstrutor()  {
        assertEquals( "notaMedia", (Double)87.5, (Double)relatorio.getNotaMedia() );
    }    

    @Test
    public void testAlteracaoDeNotaMedia()  {
        relatorio.setNotaMedia( 88.0 );
        assertEquals( "atividade", (Double)88.0, (Double)relatorio.getNotaMedia() );
    }        
}
