#include<iostream>
using namespace std;
int main()
{
  int a,b,c,j=0;
  cin>>a>>b>>c;
  if(c<=(b)&&c>=(1))
  {
    cout<<"Yes";
  }
  else if(c==1+b)
  {
    cout<<"Yes";
  }
  else
  {
    for(int i=1;i<a;i++)
    {
      if(c==(i*(2*b))||c==(1+(i*2*b)))
      {
        j=j+1;
      }
    }
    if(j==1)
    {
      cout<<"Yes";
    }
    else
    {
      cout<<"No";
    }
  }
  return 0;
}