#include <iostream>
using namespace std;
int fatorial(int n);
int main(){

    int n, res;
    cin>>n;
    res = fatorial(n);
    cout<<res;
}

int fatorial(int n){

    int f = 1;
    for(int i = 1; i <= n; i++){
        f *= i;
    }

    return f;
}