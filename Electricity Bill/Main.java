#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  if(a<=200)
  {
    b=a*0.5;
  }
  else if(a<=400)
  {
    b=(a*0.65)+100;
  }
  else if(a<=600)
  {
    b=(a+0.80)+200;
  }
  else
  {
    b=(a*1.25)+425;
  }
  cout<<"Rs."<<b;
  return 0;
}