#include<bits/stdc++.h>
using namespace std;

bool isValid(string s) {
    stack<char> st;
    for(char i : s){
        if(i=='/') break;
        if(i==' ') continue;
        if(i=='(' || i=='{' || i=='[') st.push(i);
        else if(i==')'){
            if(!st.empty() && st.top()=='(') st.pop();
            else return false;
        }else if(i=='}'){
            if(!st.empty() && st.top()=='{') st.pop();
            else return false;
        }else if(i==']'){
            if(!st.empty() && st.top()=='[') st.pop();
            else return false;
        }
    }
    return st.empty();
}

int main(){
    cout<<(isValid("((()){)") ? "Valid" : "Invalid");
    return 0;
}