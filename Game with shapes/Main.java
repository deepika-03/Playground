#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(a>b)
  {
    cout<<"circle cannot be inside a square";
  }
  else
  {
    if((2*a)==b)
    {
    	cout<<"circle can be inside a square";
    }
    else
    {
      cout<<"circle cannot be inside a square";
    }
  }
}