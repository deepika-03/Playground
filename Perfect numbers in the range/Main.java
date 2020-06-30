#include<iostream>
using namespace std;
int main()
{
  int a,b,c,q=0;
  cin>>a>>b;
  for(int j=a;j<=b;j++)
  {
    int s=0;
  for(int i=1;i<j;i++)
  {
    if(j%i==0)
    {
      s=s+i;
    }
  }
  if(s==j)
  {
    cout<<s<<" ";
  }
  }
}