#include<iostream>
using namespace std;
int main()
{
    int r,c;
  cin>>r>>c;
  int a[r][c],s[c][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      s[i][j]=a[j][i];
    }
  }
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      cout<<s[i][j]<<" ";
    }
    cout<<"\n";
  }
  
  
}