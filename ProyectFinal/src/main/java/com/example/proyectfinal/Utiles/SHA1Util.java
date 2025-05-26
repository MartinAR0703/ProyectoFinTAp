package com.example.proyectfinal.Utiles;

import java.security.MessageDigest;

/**
 * Utilidad para encriptar textos usando el algoritmo SHA1.
 */
public class SHA1Util {

    /**
     * Genera el hash SHA1 de un texto.
     *
     * @param input Texto a encriptar.
     * @return Hash en formato hexadecimal.
     */
    public static String sha1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            byte[] result = md.digest(input.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();

            for (byte b : result) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error al generar hash SHA1", e);
        }
    }
}

