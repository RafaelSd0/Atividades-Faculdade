package Livro;

public class App2 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();
        Livro l4 = new Livro("A Volta Dos Que Não Forão", "Jalin Rabei", "Romance", 100);
        Livro l5 = new  Livro("A Lenda", "Mijaro Nakama", "Ficção cientifica", 200);
        System.out.println("O livro "+ l5.getTitulo() +" sera lançado no dia 30 de fevereiro, o autor "+ l5.getAutor() +" esta confiante de que vai vender pra um monte de gente, ele disse: esse e um livro de "+ l5.getGenero() +" que tem "+ l5.getNumeroDePaginas() +" paginas de puro suco da literatura japonesa." );
        System.out.println("O livro "+ l4.getTitulo() +" sera lançado no dia 30 de fevereiro, o autor "+ l4.getAutor() +" esta confiante de que vai vender pra um monte de gente, ele disse: esse e um livro de "+ l4.getGenero() +" que tem "+ l4.getNumeroDePaginas() +" paginas de puro suco da literatura das Arabia." );

        l3.setAutor("Rafael Ratao");
        l3.setGenero("Romance");
        l3.setTitulo("A Dama de Nortridame");
        l3.setNumeroDePaginas(1000);

        System.out.println("O livro "+ l3.getTitulo() +" sera lançado no dia 30 de fevereiro, o autor "+ l3.getAutor() +" esta confiante de que vai vender pra um monte de gente, ele disse: esse e um livro de "+ l3.getGenero() +" que tem "+ l3.getNumeroDePaginas() +" paginas de uma fanfic de, oque aconteceria se o corcunda de nortridame fosse mulher." );

        l3.setAutor("Rafael Ratao");
        l3.setGenero("Romance");
        l3.setTitulo("A Dama de Nortridame");
        l3.setNumeroDePaginas(1000);

        System.out.println("O livro "+ l3.getTitulo() +" sera lançado no dia 30 de fevereiro, o autor "+ l3.getAutor() +" esta confiante de que vai vender pra um monte de gente, ele disse: esse e um livro de "+ l3.getGenero() +" que tem "+ l3.getNumeroDePaginas() +" paginas de uma fanfic de, oque aconteceria se o corcunda de nortridame fosse mulher." );

        l2.setAutor("Marina Silva");
        l2.setGenero("Comunismo");
        l2.setTitulo("Marx estava certo");
        l2.setNumeroDePaginas(100);

        System.out.println("O livro "+ l2.getTitulo() +" sera lançado no dia 30 de fevereiro, a autora "+ l2.getAutor() +" esta confiante de que vai vender pra um monte de gente, ela disse: esse e um livro de "+ l2.getGenero() +" que tem "+ l2.getNumeroDePaginas() +" paginas das provas que o comunismo e o caminho para eu ficar rica e os uotros se fude" );

        l1.setAutor("Xureque das Montanhas");
        l1.setGenero("Romance, Ação, Dragão, Nave Espacial");
        l1.setTitulo("Shurequiverso");
        l1.setNumeroDePaginas(100000000);

        System.out.println("O livro "+ l1.getTitulo() +" sera lançado no dia 30 de fevereiro, o autor "+ l1.getAutor() +" esta confiante de que vai vender pra um monte de gente, ele disse: esse e um livro de "+ l1.getGenero() +" que tem "+ l1.getNumeroDePaginas() +" paginas de um universo compartilhado do mundo dos shureqius, esse sera o maior best seler do mundo." );
    }
}
