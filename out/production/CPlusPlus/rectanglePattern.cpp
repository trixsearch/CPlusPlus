#include<iostream>
using namespace std;
int main(){
    int rows,cols;
    cout<<"Write rows and columns of star in the rectangle with space  : ";
    cin>>rows>>cols;
    for(int i=1;i<=rows;i++){
        for (int j = 1; j <= cols; j++)
        {
            cout<<"*";

        }
        cout<<endl;
    }
    return 0;
}