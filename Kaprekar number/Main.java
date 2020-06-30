#include <iostream>
#include<math.h>
using namespace std;
int main()
{
 int s=0,z,a,n=0,n1=0,a1,a2,k,b;
  cin>>k;
  b=k;
  a=k*k;
  z=a;
  while(b>0)
  {
    n++;
    b=b/10;
  }
  while(a>0)
  {
    n1++;
    a/=10;
  }
      a1=z%((int)pow(10,n));
      z=z/(int)pow(10,n);
      a2=z;
  s=a1+a2;

  if(s==k)
  {
    cout<<("Kaprekar Number");
  }
  else
  {
    cout<<("Not a Kaprekar Number");
  }
  return 0;
}