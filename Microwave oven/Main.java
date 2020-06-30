#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  switch(a)
  {
    case 2:
      cout<<b+(b/2.00);
        break;
    case 3:
      cout<<(b*2.00);
       break;
    default:
      cout<<"Number of items is more";
  }
  return 0;
}