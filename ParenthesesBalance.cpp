//https://vjudge.net/problem/UVA-673

#include <bits/stdc++.h>

using namespace std;

int main(){
    int c;
    cin >> c;
    cin.ignore();
    for (int l = 0; l < c; l++){
        bool correct = true;
        stack<char> s;
        string line;
        getline(cin,line);
        for (int i = 0; i < line.length(); i++){
            if (line[i] == ' '){
                continue;
            }else if (line[i] == '(' || line[i] == '[') {
                s.push(line[i]);
            }else if(s.empty() || (line[i] == ')' && s.top() != '(') || (line[i] == ']' && s.top() != '[')){
                correct = false;
                break;
            }else{
                s.pop();
            }
        }
        if (s.empty() && correct) {
            cout << "Yes" << endl;
        }else {
            cout << "No" << endl;
        }
    }
    return 0;
}
