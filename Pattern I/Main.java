#include<iostream>
using namespace std;
int main()
{
  int n,a;
  cin>>n;
  a=n;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<a;
    }
    a++;
    cout<<"\n";
  }
  a=a-1;
  for(int i=4;i>=1;i--)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<a;
    }
    a--;
    cout<<"\n";
  }
}