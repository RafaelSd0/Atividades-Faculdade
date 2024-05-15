#include <iostream>
#include <iomanip>
using namespace std;
int main(){

    double a, b, c;
    cin>>a;
    cin>>b;
    cin>>c;

    double res = (a*2 + b*3 + c*5) / 10;
    cout<< fixed << setprecision(1)<<"MEDIA = "<<res;
    return 0;
}