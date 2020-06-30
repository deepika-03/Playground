#include<iostream>
using namespace std;
int main()
{
  int a,b,s;
  cin>>a;
  b=a;
  while(b>0)
  {
    s=s+(b%10);
    b=b/10;
  }
  if(a%s==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
  return 0;
}