#include<iostream>
using namespace std;
int sumofdigit(int n)
{
  int s=0,d,m=0;
  while(n!=0)
  {
    s=s+n%10;
    d++;
    n=n/10;
  }
  if(s<10)
  {
    return(s);
  }
    return(sumofdigit(s));
}
int main()
{
  int n;
  cin>>n;
  cout<<sumofdigit(n);
}