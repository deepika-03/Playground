#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,s=0,n;
  cin>>n;
  for(int i=1;i<=(n-2);i++)
  {
    s=a+b;
    a=b;
    b=s;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<s;
}