/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.archivosnio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * TAREAS: Crear un directorio - Añadir un archivo al directorio - Añadir contenido al archivo
 *
 * @author Nelly Cuenca
 */
public class OperacionesArchivo {

    public void crearDirectorio() {
        Path path = Paths.get("E:\\Aline\\Documents\\INCOS\\TERCER AÑO\\Programación III\\NIO");
        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("Directorio creado");
            } else {
                System.out.println("No se puede crear - Ya existe el directorio");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo() {
        Path path = Paths.get("E:\\Aline\\Documents\\INCOS\\TERCER AÑO\\Programación III\\NIO\\miArchivo.txt");
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Archivo creado");
            } else {
                System.out.println("No se puede crear - El archivo ya existe");
                // agregando contenido al archivo creado anteriormente
                    // Files.write(path, "Creando un archivo con Java8".getBytes(), StandardOpenOption.APPEND); (se omite ya esta linea por el metodo agregarContenido)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarContenido() {
        Path path = Paths.get("E:\\Aline\\Documents\\INCOS\\TERCER AÑO\\Programación III\\NIO\\miArchivo.txt");
        String texto, res;
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Agregar contenido al archivo s/n?");
            res = leer.nextLine();
            while (res.equalsIgnoreCase("s")) {
                texto = leer.nextLine();
                texto = texto + "\n";
                Files.write(path, texto.getBytes(), StandardOpenOption.APPEND);
                System.out.println("Desea seguir agregando contenido s/n?");
                res = leer.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarContenido() {
        Path path = Paths.get("E:\\Aline\\Documents\\INCOS\\TERCER AÑO\\Programación III\\NIO\\miArchivo.txt");
        try {
            List<String> lineasArchivo = Files.readAllLines(path);
            System.out.println("- CONTENIDO ARCHIVO -");
            for (String linea : lineasArchivo) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarArchivo() {
        Path path = Paths.get("E:\\Aline\\Documents\\INCOS\\TERCER AÑO\\Programación III\\NIO\\miArchivo.txt");
        try {
            if(Files.exists(path)){
                Files.delete(path);
                System.out.println("Se eliminó el archivo");
            }else{
                System.out.println("El archivo no existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        OperacionesArchivo obj = new OperacionesArchivo();
//        obj.crearDirectorio();
//        obj.crearArchivo();
//    }
    
}
