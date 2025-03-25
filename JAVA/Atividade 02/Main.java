/*
Relatório

Os métodos obrigatórios foram implementados seguindo os conteúdos do slide e com o auxílio de vídeos no YouTube, que me ajudaram a compreender melhor o funcionamento da lista encadeada. Além disso, tentei desenvolver os métodos extras por conta própria. Aqueles que não consegui implementar sozinho, acabei deixando de lado. Também criei alguns métodos auxiliares para evitar a repetição de código.

O desenvolvimento foi relativamente tranquilo, mas eu tive dificuldades na compreensão de como a memória é gerenciada, sem o uso de bibliotecas auxiliares. A maneira como o Java aloca memória para uma lista encadeada é baseada na criação dinâmica de nós, onde cada elemento armazena uma referência para o próximo. Isso significa que, diferentemente de arrays, os elementos não ocupam posições contínuas na memória.

Os resultados foram bem interessantes. Inicialmente, ao tentar utilizar métodos como exibirLista(), os valores exibidos eram null ou códigos estranhos. Isso aconteceu porque tinha um erro na maneira que eu retornava. Errado: atual -> Certo: atual.val .

Em resumo, a implementação da lista encadeada foi um ótimo aprendizado, pois me permitiu entender melhor como a memória é manipulada e me motivou a ir atrás de aprender sobre como funciona o garbage collector, alocação de memória, etc.

*/

public class Main {
  public static void main(String[] args) {
    ListaEncadeada lista = new ListaEncadeada();

    System.out.println("_Teste Inserir no Início_");

    // Inserindo elementos no início
    lista.inserirInicio(10);
    lista.inserirInicio(20);
    lista.inserirInicio(30);
    //Saida esperada 30, 20, 10
    lista.exibirLista();

    System.out.println("_Teste Inserir no Final__");

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

    /* 
    * Para a exeçãos mude o valor para um que não esteja na lista
    */
    System.out.println("______Teste Remover______");

    try{
      lista.remover("Dio");
    } catch (ObjetoNaoEncontradoException e){
      System.err.println(e);
    }
    //Saida esperada 30, 20, 10, Jotaro, Ash
    lista.exibirLista();

    System.out.println("______Teste Tamanho______");

    //Saida esperada 5
    System.out.println(lista.tamanho());

    System.out.println("______Teste Buscar_______");

    //Saida esperada False
    System.out.println(lista.buscar("o"));

    System.out.println("______Teste Buscar______");

    //Saida esperada True
    System.out.println(lista.buscar("Jotaro"));

    System.out.println("______Teste Limpar_______");

    lista.limpar();
    //Saida esperada 0
    System.err.println(lista.tamanho());

  }
}