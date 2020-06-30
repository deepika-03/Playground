#include <iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(a%i==0)
    {
      c++;
    }
  }
  if(c==2)
  {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
  return 0;
}