#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  b=a%100;
  if(a%4==0)
  {
    cout<<a<<" is a leap year";
  }
  else if(b==0 && a%100==0&&a%400==0)
  {
    cout<<a<<" is a leap year";
  }
  else
  {
    cout<<a<<" is not a leap year";
  }
  return 0;
}