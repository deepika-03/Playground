#include<iostream>
using namespace std;
int main()
{
  float m,b;
  int p,d;
  cin>>m>>p>>d;
  b=(m*(float)p);
  if(b<d)
  {
    cout<<"Cannot reach";
  }
  else
  {
    cout<<"Can reach";
  }
}