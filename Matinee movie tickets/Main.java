#include<iostream>
using namespace std;
int main()
{
  int a;
  double st;
  cin>>a>>st;
  if(st==10.15||st==18.00||st==22.00)
  {
    if(a>13)
    {
    cout<<"$8.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
    else if(st==13.30)
    {
     if(a>13)
    {
    cout<<"$5.00";
    }
    else
    {
      cout<<"$2.00";
    }
    }
}