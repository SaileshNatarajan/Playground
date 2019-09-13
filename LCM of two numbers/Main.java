#include<stdio.h>
int main()
{
  int a,b,c,i,hcf,lcm;
  scanf("%d%d",&a,&b);
  c=a>b?b:a;
  for(i=c;i>-1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      hcf=i;
      break;
    }
  }
  lcm=((a*b)/hcf);
  printf("%d",lcm);
  return 0;
}