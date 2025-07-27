//a c++ program to print all the prime numbers between a and b
#include<iostream>
using namespace std;
int main(){
    int a,b,i,m;
    cout<<"type the value of number in between by giving a space: "<<endl;
    cin>>a>>b; 
    for(i=a;i<b;i++){
       for(m=2;m<i;m++){
        if(i%m==0){
           break;
        }
       }
       if(i==m){
        cout<<i<<endl;
       }
        
    }
}