#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b;
  if(b<a)
  {
    b+=100;
  }
  c=b-a;
  cout<<c;
  return 0;
}