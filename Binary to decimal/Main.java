#include<stdio.h>
int main()
{
  int a,sum=0,rem,i=0;
  scanf("%d",&a);
  while(a!=0)
  {
    rem=a%10;
  sum=sum+rem*pow(2,i);
  a=a/10;
  i++;
}
printf("%d",sum);
  return 0;
}