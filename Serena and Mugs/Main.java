#include<iostream>
using namespace std;
void printresult(int*,int,int);
int main()
{
  int n,s;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  printresult(a,n,s);
  return 0;
}
void printresult(int *a,int n,int s)
{
  int w=0,f=n-1,j=0;
  for(int i=0;i<n;i++)
  {
    w=w+a[i];
  }
  if(s>=(w))
  {
    j=1;
  }
  if(j==1)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}