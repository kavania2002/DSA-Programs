#include <bits/stdc++.h>

using namespace std;

class Node{
public:
    int data;
    int j;
    Node *next;
    Node(){
        data = 0;
        next = NULL;
    }
    Node(int data){
        this->data = data;
    }

    Node(int data,Node *next){
        this->data=data;
        this->next=next;
    }

    Node(int data,int j){
        this->data=data;
        this->j=j;
    }
};

class Array2D{
public:
    int nrows, ncols;
    vector<Node *> matrix;
    Array2D(int nrows, int ncols){
        this->nrows = nrows;
        this->ncols = ncols;
        
        matrix.resize(nrows);
        for (int i=0;i<nrows;i++){
            Node *head = new Node();
            head->j=0;
            matrix[i]=head;
            for (int j=1;j<ncols;j++){
                Node *temp = new Node();
                temp->j=j;
                head->next=temp;
                head=temp;
            }
        }
    }

    int numRows() { return nrows; }
    int numCols() { return ncols; }

    void clear(int val){
        for (int i = 0; i < nrows; i++){
            Node *head = matrix[i];
            while (head != NULL){
                head->data = val;
                head = head->next;
            }
        }
    }

    int getItem(int i, int j) {
        Node *cur = matrix[i];
        while (cur->j!=j){
            cur = cur->next;
        }
        return cur->data;
    }

    void setItem(int i,int j,int value){
        Node* cur=matrix[i];
        while(cur->j!=j){
            cur=cur->next;
        }
        cur->data=value;
    }
};

int main(){

    int k[100][50] = {0};
    Array2D* arr = new Array2D(4,6);
    arr->setItem(2,3, 11);
    cout<<arr->getItem(2,3)<<endl;
    return 0;
}