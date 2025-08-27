#include <bits/stdc++.h>
using namespace std;
void print(int n) {
    if (n == 1) {
        cout << 1 << endl;
        return;
    }
    cout << n << " ";
    print(n - 1);
}
int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
   cout << "Current value of n: " << n << endl;
    print(n);

    return 0;
}

// hii ,hii,hii,hii, 
//happy learning, 
//bye
