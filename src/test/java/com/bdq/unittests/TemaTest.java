// Teste unitário da classe Tema, usando o framework de testes junit
// Autor: Ruy Braga Filho
package com.bdq.unittests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import com.bdq.model.entities.Tema;


public class TemaTest {

    Tema tema;

    @Before
    public void init() {
        tema = new Tema("Tema", 555);                
    }


    @Test
    public void testNomePassadoNoConstrutor()  {
        assertEquals( "nome", "Tema", tema.getNome() );
    }    

    @Test
    public void testAlteracaoDeNome()  {
        tema.setNome( "nome novo" );
        assertEquals( "nome", "nome novo", tema.getNome() );
    }    

    @Test
    public void testIdPassadoNoConstrutor()  {
        assertEquals( "idTema", 555, tema.getIdTema() );
    }    

    @Test
    public void testAlteracaoDeID()  {
        tema.setIdTema( 444 );
        assertEquals( "idTema", 444, tema.getIdTema() );
    }   
}
