#include <iostream>
#include <bits/stdc++.h>
#include <cmath>
using namespace std;

// Função para trocar dois elementos em um array no Bubble Sort
void troca(float &a, float &b) {
    float temp = a;
    a = b;
    b = temp;
}

// Função para ordenar o array usando Bubble Sort
void bubbleSort(float arr[], int n) {
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                troca(arr[j], arr[j + 1]);
            }
        }
    }
}


void printMenu(){
    cout<<" Digite (1) para Soma e Subtracao\n";
    cout<<" Digite (2) para Multiplicar \n";
    cout<<" Digite (3) para Dividir \n";
    cout<<" Digite (4) para Raiz Quadrada \n";
    cout<<" Digite (5) para Area quadrado \n";
    cout<<" Digite (6) para Area circulo \n";
    cout<<" Digite (7) para Media \n";
    cout<<" Digite(8) para Mediana \n";
    cout<<" Digite (9) para Converter quilogramas em Gramas \n";
    cout<<" Digite (10) para Converter graus celsius em graus fahrenheit \n";
    cout<<" Digite (11) para Cosseno Hiperbolico\n";
    cout<<" Digite (12) para Fatorial\n";
    cout<<" Digite (13) para Potenciacao\n";
    cout<<" Digite (14) para Seno\n";
    cout<<" Digite (15) para Logaritmo Neperiano\n";

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;
}


//Operações Básicas 
int soma_E_subtracao();
int multiplicar();
int dividir();
//Raiz Quadrada
float raiz_quadrada();
//Cálculo de Áreas e Volume
int quadrado();
int circulo();
//Funções Estatísticas 
int media();
int mediana();
//Conversões de Unidades
int quilograma_em_grama();
int grausC_em_GrausF();
//Funções Hiperbólicas
int cosseno_Hiperbolico();
//Fatorial
int fatorial();
// Potenciação
int potenciacao();
//Funções Trigonométricas
int seno();
//Funções Exponenciais e Logarítmicas
int logaritmo_Neperiano();


int main(){

    int z;
    char escolha;
    cout<<"---------------------------------------------------------------------------\n";
    cout<<"---------------------------------------------------------------------------\n ";
    cout<<" ____   __   _     ____  _  _   _    __    _     __     __    __    __  \n ";
    cout<<"|      |  |  |    |      |  |   |   |  |   |    |  |   |  |  |__|  |  | \n ";
    cout<<"|      |--|  |    |      |  |   |   |--|   |    |   |  |--|  | |   |--|  \n";
    cout<<" |____  |  |  |__  |____  |__|   |__ |  |   |__  |__|   |__|  |  |  |  |  \n \n";

    cout<<" ____   .   ____   _   _   ___   .    ____   .    ____    __   \n";
    cout<<"|       |  |       ||  |    |    |   |       |   |       |  |  \n";
    cout<<"|       |  |----   | | |    |    |   |----   |   |       |--|  \n";
    cout<<"|____   |  |____   |  ||    |    |   |       |   |____   |  |  \n";
    cout<<"--------------------------------------------------------------------------- \n";
    cout<<"---------------------------------------------------------------------------  \n";

    cout<<endl<<endl;

    printMenu();
    

    cin>>z;

    //loop para selecionat tpo de calculo

    while (true)
    {
        switch (z)
        {
        case 1:
            cout<<"Escolheu Soma e Subtracao \n ";
            cout<<endl;
            //chamada da função 

            soma_E_subtracao();        

            break;

        case 2:
            cout<<"Escolheu Multiplicar \n ";
            cout<<endl;

            //chamada da função 

            multiplicar();
        
            break;

        case 3:
            cout<<"Escolheu Dividir \n ";
            cout<<endl;

            //chamada da função 

            dividir();
        
            break;

        case 4:
            cout<<"Escolheu Raiz quadrada \n ";
            cout<<endl;

            //chamada da função 

            raiz_quadrada();
      
            break;

        case 5:
            cout<<"Escolheu Area quadrado \n ";
            cout<<endl;

            //chamada da função 

            quadrado();
       
            break;

        case 6:
            cout<<"Escolheu Area circulo \n ";
            cout<<endl;

            //chamada da função 

            circulo();

            break;

        case 7:
            cout<<"Escolheu Media \n ";
            cout<<endl;

            //chamada da função 

            media();

            break;                        
        
        case 8:
            cout<<"Escolheu Mediana \n ";
            cout<<endl;

            //chamada da função 

            mediana();

            break;
        
        case 9:
            cout<<"Escolheu Conversor quilograma em grama \n ";
            cout<<endl;

            //chamada da função 

            quilograma_em_grama();           

            break;




        case 10:
            cout<<"Escolheu Conversor graus celsius em graus fahrenheit \n ";
            cout<<endl;

            //chamada da função 

            grausC_em_GrausF();
           
            break;    

            case 11:
            cout<<"Escolheu Cosseno Hiperbolico \n ";
            cout<<endl;

            //chamada da função 

            cosseno_Hiperbolico();

            break;

            case 12:
            cout<<"Escolheu Fatorial \n ";
            cout<<endl;

            //chamada da função 

            fatorial();

            break;

            case 13:
            cout<<"Escolheu Potenciacao \n ";
            cout<<endl;

            //chamada da função 

            potenciacao();          

            break;

            case 14:
            cout<<"Escolheu Seno \n ";
            //chamada da função 
            cout<<endl;

            seno();

            break;

            case 15:
            cout<<"Escolheu Logaritmo Neperiano \n ";
            cout<<endl;

            //chamada da função 

            logaritmo_Neperiano();
            break;

        default:

            cout <<"erro item nao listado\n";
            return 1;

            break;
        }

        cout<<"deseja realizar mais uma operacao? [S] ou [N] \n";
        cin >> escolha;
        cout << endl;

        //condicional para verificar se o usuario deseja realizar outro operação novamente

        if (escolha == 's' || escolha == 'S'){
            printMenu();
            cin>>z;
        }else if(escolha == 'n' || escolha == 'N'){
            return 0;
        }else{
            cout<<"erro digite [S] para sim ou [N] para nao \n";
            return 1;
        }

    }
    


    return 0;
}

int soma_E_subtracao(){

    int quant_num, num, res = 0;

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;

    cout << "Quantos numeros voce quer somar ou subtrair? ";
    cin >> quant_num;

    //condicional numero indesejado

    if (quant_num < 0)
    {
        cout << "erro voce digitou valor negativo";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }

    cout<<"\n \n OBS: nao escreva caracteres, para SOMAR escreva '+' antes de cada numero e para SUBTRAIR escreva '-'"<<"\n antes de cada numero, para escrever o proximo numero aperte a tecla 'enter' \n \n";

    //loop for para calcular os numeros digitados

    for (int i = 1; i <= quant_num; i++) {
        cout << "Digite o " << i << " numero : ";
        cin >> num;
        res += num ;
    }

    cout << "Resultado: " << res;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


   return 0;
}

int multiplicar(){

    int quant_num, num, res = 1;

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;

    cout << "Quantos numeros voce quer multiplicar? ";

    cin >> quant_num;
    //condicional numero indesejado
    if (quant_num < 2)
    {
        cout << "erro voce precisa de pelo menos 2 numeros para multiplicar ";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }

    cout<<"\n \n OBS: nao escreva caracteres, para escrever o proximo numero aperte a tecla 'enter' \n \n";

    //loop for para calcular os numeros digitados

    for (int i = 1; i <= quant_num; i++) {
        cout << "Digite o " << i << " numero : ";
        cin >> num;
        res *= num ;
    }

    cout << "Resultado: " << res;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;

}

int dividir(){

    int quant_num;
    double num, res;

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;

    cout << "Quantos numeros voce quer dividir? ";
    cin >> quant_num;

    //condicional numero indesejado

    if (quant_num < 2)
    {
        cout << "erro voce precisa de pelo menos 2 numeros para dividir ";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }
    
    cout<<"\n \n OBS: nao escreva caracteres, para escrever o proximo numero aperte a tecla 'enter' \n \n";

    cout<<"Digite o 1 numero: "; //numero para ser dividido

    cin>>res;

    //condicional numero indesejado

    if(res == 0){
        cout<<"erro divisao por 0 nao e permitida";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }  

    //loop for para calcular os numeros digitados

    for (int i = 2; i <= quant_num; i++)
    {
        cout<<"Digite o "<<i<<" numero: ";
        cin>>num;

        //condicional numero indesejado

        if (num == 0)
        {
            cout<<"erro divisao por 0 nao e permitida";
            cout<<"\n \n---------------------------------------------------------------------------\n \n";
            return 1;
        }
        res /= num;
    }

    cout << "Resultado: " << res;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;
}

float raiz_quadrada(){

    float num, raiz;

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    cout<<"Digite um numero positivo: ";
    cin>> num;

    //condicional numero indesejado

    if (num < 0)
    {
        cout << "erro voce digitou valor negativo";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }

    raiz = num;
    //loop calcular a raiz
    for (int i = 0; i<10; i++){
        raiz = raiz/2 + num/(2*raiz);
    }

    cout<<"raiz = "<<raiz;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;

}

int quadrado(){

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;

    
    float quad;
    cout<<"Informe o lado do quadrado: ";
    cin>>quad;

    //condicional numero indesejado

    if (quad <= 0)
    {
        cout << "erro voce digitou valor negativo";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }

    quad = quad * quad;

    cout<<"Area = "<<quad;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;
}

int circulo() {
    double raio;
    double pi = 3.14159;
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    cout << "Digite o raio do circulo: ";
    cin >> raio;
    //condicional numero indesejado

    if (raio < 0)
    {
        cout << "erro voce digitou valor negativo";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }
    // Calcula a área do círculo
    double area = pi * raio * raio;

    cout << "A area do circulo = " << area;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;
}

int media(){
    
    int quant_num;
    double  num, res = 0;

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    cout << "Quantos numeros voce quer para sua media? ";
    cin >> quant_num;

    //condicional numero indesejado

    if (quant_num <= 0)
    {
        cout << "erro voce digitou valor negativo";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }

    cout<<"\n \n OBS: nao escreva caracteres, para escrever o proximo numero aperte a tecla 'enter' \n \n";

    //loop for para calcular os numeros digitados

    for (int i = 1; i <= quant_num; i++) {
        cout << "Digite o " << i << " numero : ";
        cin >> num;
        res += num ;
    }

    cout << "Resultado: " << res / quant_num ;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;
}

int mediana(){
    int quant_num;

    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    cout << "Digite o numero de elementos: ";
    cin >> quant_num;

    //condicional valor indesejado
    if (quant_num <= 0)
    {
        cout << "erro voce digitou valor negativo";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";
        return 1;
    }
    // Array para armazenar os dados
    float dados[quant_num];
    cout<<"\n \n OBS: nao escreva caracteres, para escrever o proximo numero aperte a tecla 'enter' \n \n";
    for (int i = 0; i < quant_num; ++i) {
        cin >> dados[i];
    }

    // Ordena o array
    bubbleSort(dados, quant_num);

    float mediana;
    // Verifica se o número de elementos é ímpar ou par
    if (quant_num % 2 == 0) {
        // Se for par, retorna a média dos dois valores do meio
        mediana = (dados[quant_num / 2 - 1] + dados[quant_num / 2]) / 2.0;
        
    } else if( quant_num% 2 == 1) {
        // Se for ímpar, retorna o valor do meio
      
        mediana = dados[quant_num / 2];
    }

    cout << "A mediana dos dados e: " << mediana ;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;
}



int quilograma_em_grama(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    float quilograma, grama;
    cout<<"Digite Kg: ";
    cin>>quilograma;

    //conversor quilogramas em gramas
    grama = quilograma * 1000;

    cout<<"Gramas: "<<grama;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";


    return 0;
}

int grausC_em_GrausF(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    int cel, fah;
    
    cout<<"Digite temperatura em graus celsios: ";
    cin>>cel;

    //conversor graus celsios em fahrenheit
    fah = (cel * 9/5)+32;

    cout<<"temperatura em graus fahrenheit: "<<fah;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";

    return 0;
}

int cosseno_Hiperbolico(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    double num, res;
    cout<<"Insira o valor: ";
    cin>>num;
    //função para calcular cosseno hiperbolico
    res = cosh(num);
    cout << "Cosseno Hiperbolico = " << res ;
    cout<<"\n \n---------------------------------------------------------------------------\n \n";
    return 0;
}

int fatorial(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    int num, cont, res=1;

    cout << "Insira o valor: ";
    cin >> num;
    //condicional numero indesejado
    if (num <= 0)
    {
        cout << "erro voce precisa digitar um numero maior que 0 \n ";
        cout<<"\n \n---------------------------------------------------------------------------\n \n";

        return 1;
    }
    // loop para calculo do fatorial
    for(cont=1 ; cont<=num ; cont++){
        res *= cont;
    }
        

    cout << "Fatorial: " << res ;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";

    return 0;
}

int potenciacao(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    float base, ex;
    cout<<"Digite base: ";
    cin>>base;
    cout<<"Digite expoente: ";
    cin>>ex;
    //chama função pow que retorna potenciacao
    cout<<"Resultado = "<<pow(base, ex);

    cout<<"\n \n---------------------------------------------------------------------------\n \n";
    return 0;
}
int seno(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;


    float num, rad;
    cout<<"Digite o numero: ";
    cin>>num;
    

    // Converter para radianos
    rad = num * M_PI / 180.0;

    //chama a função que retorna seno
    cout<<"Resultado = "<<sin(rad);

    cout<<"\n \n---------------------------------------------------------------------------\n \n";

    return 0;
}

int logaritmo_Neperiano(){
    cout<<" \n OBS: nao escreva caracteres \n ";
    cout<<endl;

    double num, loga;
    cout<<"Digite o numero: ";
    cin>>num;
    //chama a função que retorna Logaritimo
    loga = log(num);

    cout<<"Resultado = "<<loga;

    cout<<"\n \n---------------------------------------------------------------------------\n \n";

    return 0;
}