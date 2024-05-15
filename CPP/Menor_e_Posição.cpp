#include <iostream>
 
using namespace std;
 
int main() {
    int p;
    int n, x;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>x;
        arr[i] = x;
    }
    int menor = arr[0];
    for (int i = 1; i < n; i++)
    {
        if(arr[i] < menor ){
            menor = arr[i];
            p = i;
        }
    }
    
    cout<<"Menor valor: "<<menor<<endl;
    cout<<"Posicao: "<<p<<endl;

    
    return 0;
}