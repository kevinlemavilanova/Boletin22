package boletin22;

public class Libros {
    
    String titulo,autor;
    float precio;
    int unidades;

    public Libros(String titulo, String autor, float precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return   titulo + "," + autor + "," + precio + "," + unidades;
    }

    public int compareTo(Object o) {
      Libros li=(Libros)o;
        
        if(this.titulo.compareToIgnoreCase(li.titulo)==0)
        return 0;
       
        else if (this.titulo.compareToIgnoreCase(li.titulo)>0)
            return 1;
        else
            return -1;
        
    }

   
}