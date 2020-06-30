#include<iostream>
using namespace std;
#include<math.h>
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int m=pow(a,b);
  if(m>=c)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}
  