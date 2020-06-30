#include <iostream>
#include<math.h>
int main() 
{
	int a,n,b,q=0,s=0;
  	std::cin>>a;
  b=a;
  n=a;
  while(b!=0)
  {
    q++;
    b=b/10;
  } 
  	while(n!=0)
    {
      s=s+((n%10)*pow(10,q-1));
      q--;
      n=n/10;
    }
	std::cout<<s;
	return 0;
}