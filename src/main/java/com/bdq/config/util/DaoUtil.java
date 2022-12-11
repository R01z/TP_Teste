package com.bdq.config.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.lang.Character;

public class DaoUtil {

  public static String encryptPass(String password) {
    try {
      MessageDigest digestor = MessageDigest.getInstance("SHA-256");
      byte[] encodedhash = digestor.digest(password.getBytes(StandardCharsets.UTF_8));
      StringBuilder encryptionValue = new StringBuilder(2 * encodedhash.length);
      for (int i = 0; i < encodedhash.length; i++) {
        String hexVal = Integer.toHexString(0xff & encodedhash[i]);
        if (hexVal.length() == 1) {
          encryptionValue.append('0');
        }
        encryptionValue.append(hexVal);
      }
      return encryptionValue.toString();
    } catch (Exception ex) {
      return ex.getMessage();
    }
  }

  public static boolean validaSenha(String senha) {
    if (senha == null)
      return false;

    if (senha.length() < 8)
      return false;

    int numeros = 0;
    int letraMinuscula = 0;
    int letraMaiuscula = 0;
    int especial = 0;

    for (int i = 0; i < senha.length(); i++) {
      char pos = senha.charAt(i);
      if (Character.isDigit(pos))
        numeros++;
      else if (Character.isUpperCase(pos))
        letraMaiuscula++;
      else if (Character.isLowerCase(pos))
        letraMinuscula++;
      else if (!Character.isLetterOrDigit(pos))
        especial++;
    }

    if (numeros == 0 || letraMaiuscula == 0 || letraMinuscula == 0 || especial == 0)
      return false;
    else
      return true;
  }
}
