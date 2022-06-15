#include<iostream>
using namespace std;
int main(){
string name = "Bhiya";
//declaring a pointer
string* myPointer = &name;
cout << name<<"\n";
cout << myPointer<<"\n";
//showing the value of my pointer
cout <<*myPointer<<"\n";

//changing the value in pointer
*myPointer = "Abhineet";
cout <<*myPointer<<"\n";
}