#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int b,r,rs,bb,o;
  float ofa,fo,rr,tru;
  cin>>b>>r>>rs>>bb;
  o=b/6;
  ofa=bb%6;
  fo=(bb/6)+(ofa*0.1);
  rr=rs/fo;
  tru=r/(float)o;
  cout<<o<<"\n";
  cout<<fo<<"\n";
  cout<<fixed<<setprecision(1)<<rr<<"\n";
  cout<<tru<<"\n";
  if(rr>=tru)
  {
    cout<<"Eligible to Win";
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
  return 0;
}