public class TestListaClassificada {
  /**
    1. Crie uma lista ordenada de strings. Insira os nomes: Carlos, Amanda, Beatriz, Eduardo.
    2. Verifique se Amanda é membro da lista.
    3. Utilize procurarPosicao para localizar Beatriz e insira Bruno antes dela.
    4. Remova Carlos da lista.
    5. Liste todos os elementos com get(i).
  */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {
    ListaClassificada<String> lista = new ListaClassificada<String>();

    // 1. Inserção 
    lista.inserir("Carlos");
    lista.inserir("Amanda");
    lista.inserir("Beatriz");
    lista.inserir("Eduardo");

    System.out.println("Amanda está na lista? " + lista.eMembro("Amanda"));

    // 3. Localiza "Beatriz" e insere "Bruno" antes
    ListaClassificada.MeuCursor cursor = lista.procurarPosicao("Beatriz");
    if (cursor != null) {
      cursor.inserirAntes("Bruno");
    }

    // 4. Remove "Carlos"
    lista.remover("Carlos");

    // 5. Lista todos os elementos com get(i)
    System.out.println("Elementos na lista:");
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println("- " + lista.get(i));
      } catch (IndexOutOfBoundsException e) {
        break; 
      }
    }
  }
}
