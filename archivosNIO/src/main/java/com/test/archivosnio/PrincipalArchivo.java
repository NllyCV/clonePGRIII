/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.archivosnio;

import java.util.Scanner;

/**
 *
 * @author Nelly Cuenca
 */
public class PrincipalArchivo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        OperacionesArchivo obj = new OperacionesArchivo();
        boolean continuar = true;
        int opc = 0;
        do {
            System.out.println("::: MENU DE OPCIONES :::");
            System.out.println("1. Crear Directorio");
            System.out.println("2. Crear Archivo");
            System.out.println("3. Agregar Contenido");
            System.out.println("4. Mostrar Contenido");
            System.out.println("5. Eliminar Archivo");
            System.out.println("6. Salir");
            System.out.println("Digite una opción");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    obj.crearDirectorio();
                    break;
                case 2:
                    obj.crearArchivo();
                    break;
                case 3:
                    obj.agregarContenido();
                    break;
                case 4:
                    obj.mostrarContenido();
                    break;
                case 5:
                    obj.eliminarArchivo();
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
