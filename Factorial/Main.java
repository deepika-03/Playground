#include<iostream>
using namespace std;
int fact(int a)
{
  int d=1;
  for(int i=1;i<=a;i++)
  {
    d=d*i;
  }
  return(d);
}
int main()
{
  int b,n;
  cin>>n;
  b=fact(n);
  cout<<"The factorial of "<<n<<" is "<<b;
}