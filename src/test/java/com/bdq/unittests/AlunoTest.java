// Teste unitário da classe Aluno, usando o framework de testes junit
// Autor: Ruy Braga Filho
package com.bdq.unittests;


import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

import com.bdq.model.entities.Aluno;
import com.bdq.model.entities.Professor;
import com.bdq.model.entities.Usuario;

public class AlunoTest {

    Aluno aluno;

    @Before
    public void init() {
        aluno = new Aluno("Aluno", 555, "2018046", "47970631061");                
    }


    @Test
    public void testEhAluno()  {
        assertEquals( "usrAluno", Boolean.TRUE, aluno.getUsrAluno() );
    }    

    @Test
    public void testNomePassadoNoConstrutor()  {
        assertEquals( "nomeUsr", "Aluno", aluno.getNomeUsr() );
    }    

    @Test
    public void testIdPassadoNoConstrutor()  {
        assertEquals( "idUsr", 555, aluno.getIdUsr() );
    }    

    @Test
    public void testMatriculaPassadaNoConstrutor()  {
        assertEquals( "matricula", "2018046", aluno.getMatricula() );
    }

    @Test
    public void testAlteracaoDeMatricula()  {
        aluno.setMatricula( "2022123" );
        assertEquals( "matricula", "2022123", aluno.getMatricula() );
    }    
    
    @Test
    public void testCPFValidoPassadoNoConstrutor()  {
        assertEquals( "cpf", "47970631061", aluno.getCpf() );        
    }
    
    @Test(expected = RuntimeException.class)
    public void testAlteracaoCPFInvalido()  {
        aluno.setCpf( "11111111111" );        
    }
}
