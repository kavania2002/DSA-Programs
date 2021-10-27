#include<bits/stdc++.h>
using namespace std;

class Array2D{
    public:
    int nrow=0;
    int ncol=0;

    Array2D(int row, int col){
        nrow=row;
        ncol=col;
    }   

    int arr[50][50]={0};
    
    int numRows(){
        return nrow;
    }

    int numCols(){
        return ncol;
    }

    void clear(int val){
        for(int i=0;i<nrow;i++){
            for(int j=0;j<ncol;j++){
                arr[i][j]=val;
            }
        }
    }

    void print(){
        for(int i=0;i<nrow;i++){
            for(int j=0;j<ncol;j++){
                cout<<arr[i][j]<<" ";
            }
            cout<<endl;
        }
    }

    int getitem(int i1,int i2){
        if(i1>nrow || i2>ncol){
            cout<<"Your matrix is not big enough"<<endl;
            return -1;
        }
        return arr[i1][i2];
    }

    void setitem(int i1,int i2,int value){
        if(i1>nrow || i2>ncol){
            cout<<"Your matrix is not big enough"<<endl;
        }
        arr[i1][i2]=value;
    }
};

int main(){
    
    Array2D* arr = new Array2D(4,5);
    // arr->setitem(2,2,4);
    // arr->clear(8);
    // cout<<arr->getitem(2,2)<<endl;
    arr->print();

    return 0;
}