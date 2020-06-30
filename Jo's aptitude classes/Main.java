#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,s;
  cin>>a>>b>>c>>d;
  if(a<b&&a<c)
  {
    s=a;
  }
  else if(b<c&&b<a)
  {
    s=b;
  }
  else
  {
    s=c;
  }
  int r=s,w;
  for(int i=r;i>=1;i--)
  {
  	if(a%i==0&&b%i==0&&c%i==0)
  	{
     	w=i;
      	break;
    }
  }
  if(w==d)
  {
   cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
  return 0;
}