#include<iostream>
using namespace std;
int main()
{
  int a,b,c,s=0;
  cin>>a>>b;
  c=a+b;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
    {
      s=s+i;
    }
  }
  if(c==s)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
}