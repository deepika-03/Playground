#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  for(int i=1;i<a;i++)
  {
    for(int j=i+1;j<=a;j++)
    {
      b++;
    }
  }
  cout<<b;
}