//Program to check if a triangle is scalene, isosceles or equilateral
#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cout<<"Write the measurement of three sides with using space: ";
    cin>>a>>b>>c;
    if(a==b==c){
        cout<<"This is a equilateral triangle lodu";
    }
    else if(a==b||b==c||c==a){
        cout<<"This is a isosceles  triangele nange";
    }
    else{
        cout<<"This is a scalene triangle lomde";
    }
    return 0;
}