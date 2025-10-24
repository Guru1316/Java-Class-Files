#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int tw;
    cin >> tw;

    char alp[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    long long int val[26];
    val[0] = 1;
    for (int i = 1; i < 26; i++) {
        val[i] = (i+1) * val[i - 1] + val[i - 1];
    }

    int k = 0;
    while (k < 26 && val[k] <= tw) {
        k++;
    }
    k--; 

    vector<char> result;

    while (tw > 0 && k >= 0) {
        while (val[k] <= tw) {
            tw -= val[k];
            result.push_back(alp[k]);
        }
        k--;
    }

    sort(result.begin(), result.end());

    for (char c : result) {
        cout << c;
    }
    cout << "\n";

    return 0;
}
