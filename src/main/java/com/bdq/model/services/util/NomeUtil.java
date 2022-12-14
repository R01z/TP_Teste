package com.bdq.model.services.util;

public class NomeUtil {

    public static boolean nomeValido(String nome) throws NullPointerException {
        if (nome == null)
            throw new NullPointerException("Necessário preencher o nome");
        if (nome.length() < 3)
            return false;

        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);
            if (Character.isDigit(letra))
                return false;
        }
        return true;
    }
}
