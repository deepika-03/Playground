#include<iostream>
#include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int s=0,v,m=0,a;
  a=n;
  v=n;
  while(n!=0)
  {
    m++;
    n=n/10;
  }
	while(v!=0)
    {
      int r=v%10;
      s=s+power(r,m);
      v=v/10;
    }
  if(s==a)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}