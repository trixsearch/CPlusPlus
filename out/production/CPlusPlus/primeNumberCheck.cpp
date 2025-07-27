// program to check whether a given no. is a prime no. or not
#include <iostream>
using namespace std;
int main()
{
    int n,i;
    cout << "Type a number to check whether it is a prime or not: ";
    cin >> n;
    for (i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            cout << "It is not a prime no"<<endl;
            break;
        }
    }
    if (i == n)
    {
        cout << "it is a prime no.";
    }

    return 0;
}