public class Main {
  public static void main(String[] args) {
    ListaEncadeada lista = new ListaEncadeada();

    System.out.println("_Teste Inserir no Início_");
    System.out.println("_________________________");

    // Inserindo elementos no início
    lista.inserirInicio(10);
    lista.inserirInicio(20);
    lista.inserirInicio(30);
    //Saida esperada 30, 20, 10
    lista.exibirLista();

    System.out.println("_Teste Inserir no Final__");
    System.out.println("_________________________");

    // Inserindo elementos no fim
    lista.inserirFim("Dio");
    lista.inserirFim("Jotaro");
    lista.inserirFim("Ash");
    //Saida esperada 30, 20, 10, Dio, Jotaro, Ash
    lista.exibirLista();

    /* 
    * Para testar as exeções apague os testes acima
    */
    System.out.println("___Teste Get Primeiro____");
    System.out.println("_________________________");

    try{
      //Saida esperada 30
      System.out.println(lista.getPrimeiro());
    } catch (ListaVaziaException e){
      System.err.println(e);
    }

    System.out.println("____Teste Get Ultimo_____");
    System.out.println("_________________________");

    try{
      //Saida esperada Ash
      System.out.println(lista.getUltimo());
    } catch (ListaVaziaException e){
      System.err.println(e);
    }

    System.out.println("______Teste Remover______");
    System.out.println("_________________________");

    try{
      lista.remover("Dio");
    } catch (ObjetoNaoEncontradoException e){
      System.err.println(e);
    }
    //Saida esperada 30, 20, 10, Jotaro, Ash
    lista.exibirLista();

  }
}