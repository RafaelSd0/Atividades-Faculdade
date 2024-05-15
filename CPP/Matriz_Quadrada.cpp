#include<iostream>
#include<iomanip>
using namespace std;
int main(){
    int n, coluna, linha, iniMatriz, fimMatriz, elemento;
    //tamanho = n
    while (true)
    {
        cin>>n;
        int m[n][n];
        if (n == 0)
        {
           
            return 0;
        }
        iniMatriz = 0;
		fimMatriz = n;
		elemento = 1;

        while(1)
		{
			
			for (linha = iniMatriz; linha < fimMatriz; linha++)
				for (coluna = iniMatriz; coluna < fimMatriz; coluna++)
					m[linha][coluna] = elemento;

			if (fimMatriz == 0){
                break;
            }
				

			fimMatriz--;
			iniMatriz++;
			elemento++;

		}
        //Imprime a matriz;
		for (linha = 0; linha < n; linha++)
		{
			for (coluna = 0; coluna < n; coluna++)
			{
            if (coluna == 0) {
                cout << setw(3) << m[linha][coluna];
            } else {
                cout << setw(4) << m[linha][coluna];
            }
            }
			cout<<endl;
		}
		cout<<endl;

    }   
}