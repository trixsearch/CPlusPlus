#include <iostream>
using namespace std;
int main()
{
    char n;
    cout << "enter a letter: ";
    cin >> n;
    int lower, upper;
    lower = (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u');
    upper = (n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U');
    if (lower || upper)
    {
        cout << "this is a vowel";
    }
    else
    {
        cout << "not a vowel chutiye";
    }
    return 0;
}