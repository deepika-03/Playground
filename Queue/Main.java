#include<iostream>
using namespace std;
void queue(int,int,int*); 
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  queue(n,m,a);
}
void queue(int n,int m,int *a)
{
  int s=0,q=0;
  for(int i=0;i<n;i++)
  {
	s=s+a[i];
  }
  while(s>0)
  {
    s=s-m;
    q++;
  }
  if(n==m)
  {
    cout<<q+1;
  }
  else
  {
  cout<<q;
  }
}