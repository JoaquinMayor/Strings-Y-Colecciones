package com.app.back;

public class StringUtilidades {

    public void mostrarFuncionalidades(String texto) {
        System.out.println("Longitud: " + texto.length());
        System.out.println("Está vacío: " + texto.isEmpty());
        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());
        System.out.println("Subcadena (0-3): " + texto.substring(0, Math.min(3, texto.length())));
        System.out.println("Contiene 'a': " + texto.contains("a"));
        System.out.println("Reemplazar 'a' por 'o': " + texto.replace("a", "o"));
        System.out.println("Empieza con 'H': " + texto.startsWith("H"));
        System.out.println("Termina con '!': " + texto.endsWith("!"));
        System.out.println("Índice de 'e': " + texto.indexOf("e"));
        System.out.println("Último índice de 'e': " + texto.lastIndexOf("e"));
        System.out.println("Comparar con 'Hola': " + texto.compareTo("Hola"));
        System.out.println("Eliminar espacios: " + texto.trim());
        System.out.println("Dividir por espacios: " + String.join(", ", texto.split(" ")));
    }
}
