#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int cg,d;
  double s,k,m;
  cin>>cg;
  s=sqrt(cg);
  k=1/s;
for(int i=1;i<=cg;i++)
{
  m=m+k;
}
  d=m+cg+1;
  cout<<d;
}