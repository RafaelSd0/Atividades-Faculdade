package Livro;
/*2. Crie uma classe chamada Livro com os atributos título, autor e número de páginas. Adicione um construtor e métodos getters e setters para todos os atributos. Crie 5 objetos do tipo Livro e teste os métodos criados.
 */
public class Livro {
    public String genero = "";
    private String titulo = "";
    private String autor = "";
    public int numeroDePaginas;
    
    public Livro(){
        
    }
    public Livro(String titulo, String autor, String genero, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}