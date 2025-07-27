#include<iostream>
using namespace std;
int main()
{
    int a,b;
    char x;
    cout<<"type two numbers with space : "<<endl;
    cin>>a>>b;
    cout<<"type +,-,* : ";
    cin>>x;
    switch (x)
    {
    case '+':
        cout<<a+b<<endl;
        break;
    case '*':
        cout<<a*b<<endl;
        break;
    case '-':
        cout<<a-b<<endl;
        break;
    
    default:
    cout<<"type only between x,y and z";
        break;
    }
    return 0;

}