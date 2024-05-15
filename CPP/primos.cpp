/*Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com a especificação fornecida.*/

#include <iostream>
using namespace std;
bool primo(int num);
int main(){
    int n, x = 0, cont = 1;
    cin>>n;
    while (cont <= n)
    {
        cin>>x;
        cont++;
        if(primo(x)){
            cout<<x<<" eh primo\n";
        } else {
            cout<<x<<" nao eh primo\n";
        }
    }
    
    return 0;
}
bool primo(int num){

    if(num <= 1){
        return false;
    } else if (num == 2)
    {
        return true;
    }
    

    for(int i = 2; i < num; i++){
        
        if (num % i == 0)
        {
            return false;
        }
            
    
    }


    return true;
}