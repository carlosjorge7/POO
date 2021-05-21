package libro;

public class Libro{

    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(int isbn, String titulo, String autor, int numPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getIsbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumpaginas(){
        return numPaginas;
    }

    public void setNumpaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    public String toString(){

        return "El libro de titulo " + titulo +
         "con ISBN " + isbn + "creado por el autor " + autor + "tiene un total de paginas " +
         numPaginas;
    }


}