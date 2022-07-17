#include <iostream>
using namespace std;
int main()
{
    int a;
    cout << "type your answer from 1, 2, 3 : ";
    cin >> a;
    switch (a)
    {
    case 1:
        cout << "hello"<<endl;
        break;
    case 2:
        cout << "maa ki chuu"<<endl;
        break;
    case 3:
        cout << "tu hi dev"<<endl;
        break;
    default:
        cout << "Tum sahi sey likho badda"<<endl;
    }
    system("pause");
    return 0;
}