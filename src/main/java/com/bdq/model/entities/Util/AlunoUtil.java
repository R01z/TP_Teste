package com.bdq.model.entities.Util;

public class AlunoUtil {

    public static boolean matriculaValida(String matricula) throws NullPointerException {
        if (matricula == null)
            throw new NullPointerException("Necessario preencher matricula");

        if (matricula.length() != 10)
            return false;

        for (int i = 0; i < matricula.length(); i++) {
            char num = matricula.charAt(i);
            if (!Character.isDigit(num))
                return false;
        }
        return true;
    }
}
