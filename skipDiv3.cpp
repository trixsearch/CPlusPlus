//this is a program that shows all no. from 1 to 100 
//but skip those numbers which are divisible by three(3)
#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Where Up to the No. you want to print : ";
    cin>>n;
    for(int i=0;i<=n;i++){
        if(i%3==0){
            continue;
        }
        cout<<i<<endl;
    }
    return 0;
}
/*This code is written by Abhinav Sahu , you can reuse it @trixsearch */