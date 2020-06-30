#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  double s=0.5;
  cin>>n;
  for(int i=0;i<n;i++)
  {
	cout<<fixed<<setprecision(1)<<s<<" ";	
    s+=pow(3,i);
  }
}