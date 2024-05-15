#include <iostream>
#include <iomanip> 
using namespace std;
 
int main() {
    
    float m[12][12];
    int c;
    char s;
    cin>> c;
    cin>> s;
    float soma = 0;

    for (int i = 0; i < 12; i++)
    {
        for (int j = 0; j < 12; j++)
        {
                cin>>m[i][j];
        }
            
    }
    for (int i = 0; i < 12; i++)
    {
        for (int j = c; j == c; j++)
        {
                soma += m[i][j];
        }
            
    }

    if(s == 'S' || s == 's'){
        cout<< fixed << setprecision(1)<<soma<<endl;
        
    } else if(s == 'M' || s == 'm')
    {
        cout<< fixed << setprecision(1)<<soma / 12<<endl;
    }
    return 0;
}