#include<stdio.h>
int main()
{
  int n,i,arr[128],rem_count=0;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[rem_count++]=n%8;
    n=n/8;
  }
  for(i=rem_count-1;i>=0;i--)
  {
printf("%d",arr[i]);
  }
  return 0;
}