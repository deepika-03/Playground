#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end,i=0;    
 std::cin.getline(str,100);
while(str[i]!='\0')
{
  count++;
  i++;
}
  int e=0;
for(int j=count-1;j>=0;j--)
{
  rev[e]=str[j];
  e++;
}
std::cout<<rev;
}