package examen.proyecto.ficheros;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

public class PruebaFicheros {

    public static void main(String[] args) {
        PruebaFicheros pf = new PruebaFicheros();
        pf.leerArchivo("./FicheroEjercicio2.txt");
    }

    public void leerArchivo(String nombre) {
        Path path = Paths.get(nombre);
        int contador = 0;
        int contadorJava = 0;
        try {

            List<String> lines = Files.readAllLines(path);
            for (String linea : lines) {
                contador++;
                String[] palabras = linea.split(".");
                for (String palabra : palabras) {
                    if (palabra.toLowerCase().contains("java")) {
                        contadorJava++;
                    }
                }

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Num lineas: " + contador);
        System.out.println("Veces que se repite Java: " + contadorJava);
    }
    
}