#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y,z;
  double a,b,c;
  cin>>x>>y;
  a=(double)x;
  b=(double)y;
  c=sqrt((pow((a-3),2)+pow((b-4),2)));
  z=(int)c;
  cout<<z;
  return 0;
}