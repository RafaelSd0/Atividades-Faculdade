public class Main {
  public static void main(String[] args) {
    // Atividade 1

    PilhaEncadeada<Character> at1 = new PilhaEncadeada<>();

    String texto = "ana"; // Palindromo
    System.out.println("_______");
    System.out.println("Atividade 1");
    System.out.println("_______");
    for (int i = 0; i < texto.length(); i++) {
        char letra = texto.charAt(i);
        at1.push(letra);
        System.out.print(letra);
    }
    String result = "é palindromo";
    System.out.println("");
    System.out.println("_______");

    for (int i = 0; i < texto.length(); i++) {
      char letra = texto.charAt(i);
      try{
        char verificaPalindromo = at1.pop(); 
        if (letra == verificaPalindromo ){
          System.out.print(verificaPalindromo);
        } else {
          result = "não é palindromo";
          break;
        }
      } catch (PilhaVaziaException e){
        System.err.println(e);
      }
    }
    System.out.println("");
    System.out.println("_______");
    System.out.println(result);

    // Atividade 2
    System.out.println("_______");
    System.out.println("Atividade 2");
    System.out.println("_______");

    String expressao = "(a + b, ((a * b) + c))";
    PilhaEncadeada<Character> at2 = new PilhaEncadeada<>();
    boolean balanceado = true;

    try {
    for (int i = 0; i < expressao.length(); i++) {
        char c = expressao.charAt(i);
        
        if (c == '(') {
          at2.push(c);
        } 
        else if (c == ')') {
          if (at2.estaVazia()){
            balanceado = false;
            break;
          } else {
            at2.pop();
            balanceado = at2.estaVazia();
          }
        }
    }

    
    
    } catch (PilhaVaziaException e) {
      System.out.println(e);
    }

    System.out.println(balanceado ? "Sucesso, a expressão é valida." : "Fracasso, a expressão é invalida.");

    // Atividade 3
    System.out.println("_______");
    System.out.println("Atividade 3");
    System.out.println("_______");
    PilhaEncadeada<Integer> at3 = new PilhaEncadeada<>();

    int num = 13;
    int cont2 = 0;

    while (num != 0) {
    int resto = num % 2;
    at3.push(resto);
    cont2 ++;
    num = num / 2;
    }

    for (int i = 0; i < cont2; i++){
    try{
      System.out.print(at3.pop());
    } catch (PilhaVaziaException e){
      System.err.print(e);
    }
    }

    // Atividade 4
    /*
     a,b,c = -1
     * +, - = 0
     * *, / = 1
     * $ = 2
     * (,) = 3
    */
    System.out.println("");
    System.out.println("_______");
    System.out.println("Atividade 4");
    System.out.println("_______");
    PilhaEncadeada<Character> at4 = new PilhaEncadeada<>();
    String infixa = "4$2*3-3+8/4/(1+1)";
    System.out.println("infixa: " + infixa);
    String posfixa = "";
    for(int i = 0; i < infixa.length(); i++){
      char c = infixa.charAt(i);

      if (c == ' ') continue;

      if (getPrioridade(c) == -1) {
        posfixa += c;
      } else if (c == '(') {
        at4.push(c);
      } else if (c == ')') {
        try {
          while (at4.getTop() != '(') {
            posfixa += at4.pop();
          }
          at4.pop();
        } catch (PilhaVaziaException e) {}
      } else {
        try {
          while (!at4.estaVazia() && getPrioridade(at4.getTop()) > getPrioridade(c) && at4.getTop() != '(') {
            if (at4.getTop() == ')' || at4.getTop() == '(') {
              at4.pop();
            } else {
              posfixa += at4.pop();
            }
          }
        } catch (PilhaVaziaException e) {}
        at4.push(c);
      }
    }

    while (!at4.estaVazia()) {
      try {
        if (at4.getTop() == ')' || at4.getTop() == '(') {
          at4.pop();
        } else {
          posfixa += at4.pop();
        }
      } catch (PilhaVaziaException e) {}
    }

    System.out.println("pós-fixa: " + posfixa);

    at4.fazVazia();
    infixa = "4$2*3-3+8/4/(1+1)";
    String prefixa = "";
    infixa = inverter(infixa);


    for(int i = 0; i < infixa.length(); i++){
      char c = infixa.charAt(i);

      if (c == ' ') continue;

      if(getPrioridade(c) == -1){
        prefixa += c;
      } else if( c == '('){
        at4.push(c);
      } else if(c == ')'){
        try {
          while (at4.getTop() != '(') {
            prefixa += at4.pop();
          }
          at4.pop();
        } catch (PilhaVaziaException e) {}
      } else{
        try {

          while (!at4.estaVazia() && getPrioridade(at4.getTop()) > getPrioridade(c) && at4.getTop() != ')') {
            if (at4.getTop() == ')' || at4.getTop() == '(') {
              at4.pop();
            } else {
              prefixa += at4.pop();
            }
          }           

        } catch (PilhaVaziaException e) {}
        at4.push(c);
      }
    }
    while (!at4.estaVazia() ) {
      try {
        if (at4.getTop() == ')' || at4.getTop() == '(') {
          at4.pop();
        } else {
          prefixa += at4.pop();
        }
      } catch (PilhaVaziaException e) {}
    }

    System.out.println("pré-fixa: " + inverter(prefixa));
    }

  public static int getPrioridade(char c) {
    switch (c) {
      case '+':
      case '-':
        return 0;
      case '*':
      case '/':
        return 1;
      case '$':
        return 2;
      case '(':
      case ')':
        return 3;
      default:
        return -1; 
    }
  }

  public static String inverter(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      if (c == '(') sb.append(')');
      else if (c == ')') sb.append('(');
      else sb.append(c);
    }
    return sb.toString();
  }
  

}
