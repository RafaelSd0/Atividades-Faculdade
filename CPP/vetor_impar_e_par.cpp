#include <iostream>
 
using namespace std;
 
int main() {
 
    int arr1[5], arr2[5],cont_par=0,cont_impar=0,va;

    for (int i = 1; i < 16; i++)
    {
        cin>>va;
        
           
        if(va%2 == 0){
            
            arr2[cont_par] = va;
            cont_par++;
            if (cont_par == 5)
            {
                for (int i = 0; i < 5; i++)
                {
                    cout<<"par["<<i<<"] = "<<arr2[i]<<endl;
                    cont_par = 0;
                }
                
                
            }
              
        
            
        }else {

            arr1[cont_impar] = va;
            cont_impar++;
            if (cont_impar == 5)
            {
                for (int i = 0; i < 5; i++)
                {
                    cout<<"impar["<<i<<"] = "<<arr1[i]<<endl;
                    cont_impar = 0;
                }

                
            }

        }

    }

    for (int i = 0; i < cont_impar; i++)
    {
        cout<<"impar["<<i<<"] = "<<arr1[i]<<endl;
    }
    for (int i = 0; i < cont_par; i++)
    {
        cout<<"par["<<i<<"] = "<<arr2[i]<<endl;
    }

    return 0;
}