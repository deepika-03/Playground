#include<iostream>
using namespace std;
int main()
{
  int n,a=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
   	for(int j=1;j<=i;j++)
    {
      if(i%2==0)
      {
        if(j==i)
        {
          if(j==1)
          {
          a=a+i;
          }
          cout<<a;
          a--;
        }
        else
        {
          if(j==1)
          {
          a=a+i;
          }
        cout<<a<<"*";
        a--;
        }
        if(j==i)
        {
        a=a+1+i;
        }
      }
      else
      {
        if(j==i)
        {
          cout<<a;
        }
        else
        {
        cout<<a<<"*";
        a++;
        }
      }
    }
    cout<<"\n";
   }
}