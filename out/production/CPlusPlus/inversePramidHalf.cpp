//developing inverse pyramid
#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"write number of stars for half pyramid inverse ";
    cin>>n;
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            cout<<"*";
        }
        cout<<endl;
    }
}