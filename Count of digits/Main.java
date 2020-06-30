#include<iostream>
int main()
{
  int n,a;
  std::cin>>n;
  do
  {
    a++;
    n=n/10;
  }while(n>0);
  std::cout<<a;
  return 0;
}