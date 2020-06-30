#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *a;
  int n,o=0,e=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(int i=0;i<n;i++)
  {
    if((*(a+i))%2==0)
    {
      e++;
    }
    else
    {
      o++;
    }
  }
  cout<<o<<"\n";
  cout<<e;
  free(a);
  return 0;
}