#include<iostream>
using namespace std;
int main()
{
  int n,m;
  bool meera=false;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>m;
  for(int i=0;i<n;i++)
  {
    if(m==a[i])
    {
      meera=true;
    }
  }
  if(meera==true)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  } 
}