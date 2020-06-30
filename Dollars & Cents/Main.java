#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,dol,ce;
  cin>>a>>b>>c>>d;
  dol=a+c;
  ce=b+d;
  while(ce>100)
  {
    ce=ce-100;
    dol=dol+1;
  }
  cout<<dol<<"\n"<<ce;
}