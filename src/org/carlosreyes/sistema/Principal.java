/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosreyes.sistema;

import java.util.Date;
import org.carlosreyes.bean.Book;
import org.carlosreyes.exception.ValidarException;
import org.carlosreyes.util.ManejadorDeArchivos;

/**
 *
 * @author carlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int n = 100;
        int m = 100 / 2;

        assert n==m : "los valores son iguales";
        try {
            /*String authors[] = {"Juan Perez", "julio Martinez"};
            Book lista[] = new Book[5];
            lista[0] = new Book("Book 1:", new Date(), "Editorial 1", authors);
            lista[1] = new Book("Book 2:", new Date(), "Editorial 2", authors);
            lista[2] = new Book("Book 3:", new Date(), "Editorial 3", authors);
            lista[3] = new Book("Book 4:", new Date(), "Editorial 4", authors);
            lista[4] = new Book("Book 5:", new Date(), "Editorial 5", authors);

            lista[0].setIsbn("1111");
            lista[1].setIsbn("1111");
            lista[2].setIsbn("1111");
            lista[3].setIsbn("1111");
            lista[4].setIsbn("1111");
            imprimirLibros(lista);
            guardarInformacion(lista);*/
            // mostrarInformacion("book.txt");

        } catch (Exception e) { //agregar Validar excepcion cuando voy a escribir

            System.out.println("Error" + e.getMessage());
        } finally {
            System.out.println("esto se ejecuta si o no,existe un exception");

        }
    }

    public static void imprimirLibros(Book[] libros) throws ValidarException {
        try {
            for (int i = 0; i < libros.length; i++) {
                System.out.println(libros[i]);
            }
        } catch (Exception e) {
            throw new ValidarException();
        }
    }

    public static void guardarInformacion(Book[] libros) {
        ManejadorDeArchivos manejador = new ManejadorDeArchivos("book.txt");
        for (int i = 0; i < libros.length; i++) {
            manejador.escribir(libros[i].toString());
        }

    }

    public static void mostrarInformacion(String archivo) {
        ManejadorDeArchivos manejador = new ManejadorDeArchivos(archivo);
        System.out.println("se leo el archivo" + "\n" + manejador.leer(archivo));
    }
}
