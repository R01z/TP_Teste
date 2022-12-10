package com.bdq.model.services.util;

public class NomeUtil {

    public static boolean nomeValido(String nome) {
        for (int i = 0; i < nome.length(); i++) {
            letra = nome.charAt(i);
            if (Character.isDigit(letra))
                return false;
        }
        return true;
    }
}
