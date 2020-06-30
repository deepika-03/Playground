#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a=1,b=(n*n)+1;
  for(int i=n;i>0;i--)
  {
    for(int k=n;k>i;k--)
    {
      cout<<"--";
    }
    for(int j=1;j<=i;j++)
    {
      cout<<a<<"*";
      a++;
    }
    for(int j=1;j<=i;j++)
    {
      cout<<b;
      if(j<i)
      {
        cout<<"*";
      }
      b++;
    }
    b=b-(i-1)*2-1;
    cout<<"\n";
  }
}