package com.mla;

public class verificarDNI {

    public static String getDNI (String dni){
        return addLetra(fixDniLength(dni));
    }

    private static String fixDniLength(String dni){
        int length = dni.length(); // length should be 8
        int cerosNecesarios = 8 - length;
        StringBuilder string = new StringBuilder();

        if (length > 8){
            for(int i = 0; i < 8; i++) {
                string.append(dni.charAt(i));
            }
            return string.toString();

        }
        if (cerosNecesarios == 0){
            return dni;
        }else {
            for(int i = 0; i < cerosNecesarios; i++){
                string.append("0");
            }
            string.append (dni);
            return string.toString();
        }
    }

    private static String addLetra (String dni){
        String [] letras = {"T", "R", "W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return dni + letras[Integer.parseInt(dni)%23];
    }
}
