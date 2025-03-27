public class Main {
  public static void main(String[] args) {
    ListaEncadeadaDupla<Integer> lista = new ListaEncadeadaDupla<>();


    System.out.println("_Teste Inserir no Início_");

    // Inserindo elementos no início
    lista.inserirInicio(10);
    lista.inserirInicio(20);
    lista.inserirInicio(30);
    //Saida esperada 30, 20, 10
    lista.exibirLista();

    System.out.println("_Teste Inserir no Final__");

    // Inserindo elementos no fim
    lista.inserirFim(40);
    lista.inserirFim(60);
    lista.inserirFim(80);
    //Saida esperada 30, 20, 10, 40, 60, 80
    lista.exibirLista();

    System.out.println("___Teste Get Primeiro____");

    try{
      //Saida esperada 30
      System.out.println(lista.getPrimeiro());
    } catch (ListaVaziaException e){
      System.err.println(e);
    }

    System.out.println("____Teste Get Ultimo_____");

    try{
      //Saida esperada Ash
      System.out.println(lista.getUltimo());
    } catch (ListaVaziaException e){
      System.err.println(e);
    }

    System.out.println("______Teste Remover______");

    try{
      lista.remover(60);
    } catch (ObjetoNaoEncontradoException e){
      System.err.println(e);
    }
    //Saida esperada 30, 20, 10, 40, 80
    lista.exibirLista();

  }
}