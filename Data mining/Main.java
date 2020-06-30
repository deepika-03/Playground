#include<iostream>
using namespace std;
int main()
{
  int a,i=0,s1=0,s2=0;
  cin>>a;
  while(a>0)
  {
    i++;
    if(i%2==0)
    {
      s1=s1+(a%10);
    }
    else
    {
      s2=s2+(a%10);
    }
    a/=10;
  } 
  if(s1==s2)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}