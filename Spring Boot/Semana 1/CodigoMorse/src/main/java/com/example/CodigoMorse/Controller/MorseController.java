package com.example.CodigoMorse.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {
    /* @GetMapping("/descifrar")
     public String descifrarAMorse(@RequestParam String palabra) {
         palabra = palabra.toUpperCase(); // Convertir a mayúsculas para coincidir con la tabla
         StringBuilder morse = new StringBuilder();
         for (char c : palabra.toCharArray()) {
             String codigo = obtenerCodigoMorse(c);
             if (codigo != null) {
                 morse.append(codigo).append(" ");
             }
         }
         return morse.toString().trim(); // Eliminar el espacio final
     }*/

        @GetMapping("/descifrar")
        public String descifrarAMorse(@RequestParam String frase) {
            frase = frase.toUpperCase(); // Convertir a mayúsculas para coincidir con la tabla
            StringBuilder morse = new StringBuilder();
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (Character.isWhitespace(c)) {
                    // Agregar la separación de palabras con 3 espacios en blanco
                    morse.append("   ");
                } else {
                    String codigo = obtenerCodigoMorse(c);
                    if (codigo != null) {
                        morse.append(codigo).append(" ");
                    }
                }
            }
            return morse.toString().trim(); // Eliminar el espacio final
        }


        private String obtenerCodigoMorse(char c) {
            switch (c) {
                case 'A':
                    return ".-";
                case 'B':
                    return "-...";
                case 'C':
                    return "-.-.";
                case 'D':
                    return "-..";
                case 'E':
                    return ".";
                case 'F':
                    return "..-.";
                case 'G':
                    return "--.";
                case 'H':
                    return "....";
                case 'I':
                    return "..";
                case 'J':
                    return ".---";
                case 'K':
                    return "-.-";
                case 'L':
                    return ".-..";
                case 'M':
                    return "--";
                case 'N':
                    return "-.";
                case 'O':
                    return "---";
                case 'P':
                    return ".--.";
                case 'Q':
                    return "--.-";
                case 'R':
                    return ".-.";
                case 'S':
                    return "...";
                case 'T':
                    return "-";
                case 'U':
                    return "..-";
                case 'V':
                    return "...-";
                case 'W':
                    return ".--";
                case 'X':
                    return "-..-";
                case 'Y':
                    return "-.--";
                case 'Z':
                    return "--..";
                case '0':
                    return "-----";
                case '1':
                    return ".----";
                case '2':
                    return "..---";
                case '3':
                    return "...--";
                case '4':
                    return "....-";
                case '5':
                    return ".....";
                case '6':
                    return "-....";
                case '7':
                    return "--...";
                case '8':
                    return "---..";
                case '9':
                    return "----.";
                default:
                    return null;
            }
        }
    }



