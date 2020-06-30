#include<iostream>
using namespace std;
int main()
{
  int a,b,c,h=0,t;
  cin>>a>>b>>c;
  if(a>=b&&a>=c)
  {
    if(b>=c)
    {
      cout<<"The treasure is in box which has number "<<b<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<c<<"\n";
    }
    h=a;
  }
    else if(b>=a&&b>=c)
  {
    if(a>=c)
    {
      cout<<"The treasure is in box which has number "<<a<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<c<<"\n";
    }
      h=b;
    } 
  else if(c>=a&&c>=b)
  {
    if(a>=b)
    {
      cout<<"The treasure is in box which has number "<<a<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<b<<"\n";
    }
    h=c;
    } 
  for(int i=1;i<=h;i++)
  {
    if(a%i==0 &&b%i==0&&c%i==0)
    {
      t=i;
    }
  }
  cout<<"The code to open the box is "<<t;
  
  return 0;
}