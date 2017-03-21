package boletin22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Libreria {

    ArrayList<Libros> list = new ArrayList<Libros>();

    public void add(Libros libro) {
        list.add(libro);
    }

    public void consultar() {
        String titulo = JOptionPane.showInputDialog("Titulo: ");
        boolean consulta = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).titulo.equals(titulo)) {
                System.out.println("Libro encontrado");
                consulta = true;
                System.out.println("Titulo: " + list.get(i).titulo + " Precio: " + (list.get(i).precio));
            }
        }
        if (consulta == false) {
            System.out.println("Libro no encontrado");
        }
    }

    public void consultarAutor() {
        String autor = JOptionPane.showInputDialog("Autor: ");
        boolean consulta = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).autor.equals(autor)) {
                System.out.println("Libro encontrado");
                consulta = true;
                System.out.println(list);
            }
        }
        if (consulta == false) {
            System.out.println("Libro no encontrado");
        }
    }

    public void visualizar() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void borrar() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).unidades == 0) {
                list.remove(i);
            }
        }
    }

    public void ordenar() {
        Collections.sort(list, new Comparator<Libros>() {
            @Override
            public int compare(Libros libro1, Libros libro2) {
                return libro1.titulo.compareTo(libro2.titulo);
            }
        });
        for (Libros l : list) {
            System.out.println("Libro: " + l);
        }
    }
}
