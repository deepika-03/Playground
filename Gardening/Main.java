#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=(2*a)&&c>=(a+1))
  {
    cout<<"It is a mango tree";
  }
  else if(c<=((b-1)*a)&&c>=(((b-2)*a)+1))
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
  return 0;
}