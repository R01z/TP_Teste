// Teste unitário da classe Professor, usando o framework de testes junit
// Autor: Ruy Braga Filho
package com.bdq.unittests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import com.bdq.model.entities.Professor;


public class AlunoTest {

    Professor professor;

    @Before
    public void init() {
        professor = new Professor("Professor", 555, "47970631061");                
    }


    @Test
    public void testEhProfessor()  {
        assertEquals( "usrAluno", Boolean.FALSE, professor.getUsrAluno() );
    }    

    @Test
    public void testNomePassadoNoConstrutor()  {
        assertEquals( "nomeUsr", "Professor", professor.getNomeUsr() );
    }    

    @Test
    public void testIdPassadoNoConstrutor()  {
        assertEquals( "idUsr", 555, professor.getIdUsr() );
    }    
    
    @Test
    public void testCPFValidoPassadoNoConstrutor()  {
        assertEquals( "cpf", "47970631061", professor.getCpf() );        
    }
    
    @Test(expected = RuntimeException.class)
    public void testAlteracaoCPFInvalido()  {
        professor.setCpf( "11111111111" );        
    }
}
