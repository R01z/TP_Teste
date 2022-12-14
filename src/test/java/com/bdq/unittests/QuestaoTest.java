package com.bdq.unittests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.bdq.model.entities.Questao;
import com.bdq.model.entities.Tema;

public class QuestaoTest {

    @Test
    public void questaoNaoPossuiTema() {
        List<Tema> temas = new ArrayList<>();
        Questao questao = new Questao(1, "enuciado", "resposta", true, temas);
        Tema tema = new Tema("Tema", 1);
        assertFalse(questao.questaoTemTema(tema));
    }

    @Test
    public void questaoPossuiTema() {
        Tema tema = new Tema("Tema", 1);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);
        Questao questao = new Questao();
        questao.setEnunciado("Enunciado");
        questao.setResposta("Resposta");
        questao.setPublica(true);
        questao.setIdQuestao(1);
        questao.addTema(tema);
        assertTrue(questao.questaoTemTema(tema));
    }

    @Test
    public void setQuestaoPublica() {
        Tema tema = new Tema();
        tema.setNome("Tema");
        tema.setIdTema(1);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);
        Questao questao = new Questao(1, "enuciado", "resposta", false, temas);
        questao.setPublica(true);
        assertTrue(questao.questaoPublica());
    }

    @Test
    public void setEnunciadoPublica() {
        Tema tema = new Tema("Tema", 1);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);
        Questao questao = new Questao(1, "", "resposta", false, temas);

        questao.setEnunciado("teste");
        String enunciado = questao.getEnunciado();
        assertTrue(enunciado == "teste");
    }

    @Test
    public void removeTema() {
        Tema tema = new Tema("Tema", 1);
        Tema tema2 = new Tema("Tema2", 2);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);
        temas.add(tema2);
        Questao questao = new Questao(1, "Enunciado", "resposta", false, temas);
        questao.removeTema(tema2);
        assertEquals(1, questao.getTemas().size());
    }

    @Test
    public void excecaoAoRemoverTemasCasoQuestaoTenha1OuMenosTemas() {
        Tema tema = new Tema("Tema", 1);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);
        Questao questao = new Questao(1, "Enunciado", "resposta", false, temas);

        try {
            questao.removeTema(tema);
        } catch (RuntimeException e) {
            assertEquals("Quest??o precisa ter ao menos um tema", e.getMessage());
        }

    }

    @Test
    public void tentarIncluirTemaQueJaExisteRetornaExcecao() {
        Tema tema = new Tema("Tema", 1);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);

        Questao questao = new Questao();
        questao.setTemas(temas);

        try {
            questao.addTema(tema);
        } catch (RuntimeException e) {
            assertEquals("Tema j?? existe nessa quest??o", e.getMessage());
        }
    }

    @Test
    public void adicionaTemaQueNaoExiste() {
        Tema tema = new Tema("Tema", 1);
        Tema tema2 = new Tema("Tema2", 2);
        List<Tema> temas = new ArrayList<>();
        temas.add(tema);

        Questao questao = new Questao();
        questao.setTemas(temas);

        questao.addTema(tema2);
        assertEquals(2, questao.getTemas().size());
    }
}
