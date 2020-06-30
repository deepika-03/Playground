#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,a=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    a=i*i;
    if(a%2==0)
    {
      cout<<a-2<<" ";
    }
    else
    {
      cout<<a-1<<" ";
    }
  }
}