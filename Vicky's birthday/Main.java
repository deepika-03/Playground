#include<iostream>
using namespace std;
int main()
{
  int y,n;
  cin>>y;
  n=y%100;
  if(n==0)
  {
    if(y%100==0&&y%400==0)
    {
    	cout<<"Vicky can celebrate his birthday.";
    }
    else
    {
      cout<<"Vicky can't celebrate.";
    } 
  }
  else if(n%4==0)
  {
    cout<<"Vicky can celebrate his birthday.";
  }
  else
  {
    cout<<"Vicky can't celebrate.";
  }
  return 0;
}