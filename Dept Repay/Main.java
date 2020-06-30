#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  float d,e,f,g;
  cin>>a>>b>>c;
  d=(a*b*c)/100;
  e=a+d;
  f=d*2/100;
  g=a+d-f;
  cout<<d<<"\n";
  cout<<e<<"\n";
  cout<<f<<"\n";
  cout<<g<<"\n";
  return 0;
}