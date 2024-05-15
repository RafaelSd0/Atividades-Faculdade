#include <iostream>
#include <cmath> 
#include <iomanip>
using namespace std;
 
int main() {
 
    double A, B, C, raiz, r1, r2;
    cin>>A>>B>>C;
    raiz =(B*B) - (4*A*C);
    if (A == 0){
        cout<<"Impossivel calcular\n";
    } else if(raiz < 0){
        cout<<"Impossivel calcular\n";
    }else{
        r1 = ( (-B) + (sqrt(raiz)) ) / (2*A);
    r2 = ( (-B) - (sqrt(raiz)) ) / (2*A);

    cout << fixed << setprecision(5)<<"R1 = "<<r1<<endl;
    cout << fixed << setprecision(5)<<"R2 = "<<r2<<endl;
    } 
    return 0;
}