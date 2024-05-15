#include <iostream>
#include <iomanip> 
using namespace std;
 
int main() {
    
    float m[12][12];
    char o;
    cin>> o;
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
            for (int j = i + 1; j < 12; j++)
            {
                soma += m[i][j];
            }
            
        }

    if(o == 'S' || o == 's'){
        
        cout<< fixed << setprecision(1)<<soma<<endl;
        
    } else if(o == 'M' || o == 'm')
    {
    
        cout<< fixed << setprecision(1)<<soma / 66<<endl;
    }
    
    
    
    return 0;
}