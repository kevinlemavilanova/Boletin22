/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

/**
 *
 * @author kevin
 */
import java.io.IOException;
import javax.swing.JOptionPane;

public class Boletin22 {

    public static void main(String[] args) throws IOException {

        Libreria libreria = new Libreria();
        Libros prueba = new Libros("Titulo1", "autor...", 12.5f, 0);

        boolean seguir = true;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("1>Añade / 2> Consulta / 3>Visualizar / 4>Borrar"));
            switch (opcion) {
                case 1:
                    libreria.add(prueba);
                    break;
                case 2:
                    libreria.consultar();
                    break;
                case 3:
                    libreria.visualizar();
                    break;
                case 4:
                    libreria.borrar();
                    break;
                case 5:
                    libreria.ordenar();
                    break;
                case 0:
                    seguir = false;
                    break;
            }
        } while (seguir == true);

    }
}
