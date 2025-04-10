import java.util.*;

class MeuArray {
  private int[] array;
  private int size;

  public MeuArray() {
    array = new int[5]; 
    size = 0;
  }

  public void adicionar(int val) {
    if (size == array.length) {
      int[] novoArray = new int[array.length * 2];
      System.arraycopy(array, 0, novoArray, 0, array.length);
      array = novoArray;
    }
    array[size] = val;
    size++;
  }

  public String presente(int val) {
    for (int i = 0; i < size; i++) {
      if (array[i] == val) {
        return "O valor: " + val + " esta na lista";
      }
    }
    return "O valor: " + val + " nao está na lista";
  }

  public void ordenar() {
    Arrays.sort(array, 0, size);
  }

  public String exibir() {
    StringBuilder buffer = new StringBuilder();
    for (int i = 0; i < size; i++) {
    	buffer.append(array[i]).append(" ");
    }
    return buffer.toString().trim();
  }
  
  public int getArraySize(){
  	return array.length;
  }

  public static void main(String[] args) {
    MeuArray meuArray = new MeuArray();
		
		System.out.println("Array antes de redimencionar: " + meuArray.getArraySize());
    meuArray.adicionar(5);
    meuArray.adicionar(2);
    meuArray.adicionar(9);
    meuArray.adicionar(1);
    meuArray.adicionar(3);
    meuArray.adicionar(7);
    System.out.println("Array depois de redimencionar: " + meuArray.getArraySize());

    System.out.println("Array antes de ordenar: " + meuArray.exibir());
    meuArray.ordenar();
    System.out.println("Array depois de ordenar: " + meuArray.exibir());

    System.out.println(meuArray.presente(3));
    System.out.println(meuArray.presente(10)); 
  }
}


