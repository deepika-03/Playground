#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,s;
  cin>>n;
  for(int i=1;i<=n-2;i++)
  {
    s=a+b;
    a=b;
    b=s;
  }
  cout<<s;
}