#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3,s1,s2,s3,a1,a2,a3,f,s,a;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  f=(f1-(f1*f2)/100)+f3;
  s=(s1-(s1*s2)/100)+s3;
  a=(a1-(a1*a2)/100)+a3;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if(f<=s)
  {
    if(f<a)
    {
      cout<<"He will prefer Flipkart";
    }
    else
    {
      cout<<"He will prefer Amazon";
    }
  }
  else
  {
    if(s<a)
    {
      cout<<"He will prefer Snapdeal";
    }
    else
    {
      cout<<"He will prefer Amazon";
    }
  }
  return 0;
}