#include<iostream>
using namespace std;
int main()
{
  int n,l,e;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
    if(l>=n)
  {
    cout<<"Invalid Input";
  }
  else
  {
  cout<<"Enter the value to insert\n";
  cin>>e;
  int b[n+1];
  for(int i=0;i<l-1;i++)
  {
    b[i]=a[i];
  }
  b[l-1]=e;
  for(int i=l-1;i<n;i++)
  {
    b[i+1]=a[i];
  }
  cout<<"Array after insertion is\n";
  for(int i=0;i<n+1;i++)
  {
    cout<<b[i]<<"\n";
  }
}
}