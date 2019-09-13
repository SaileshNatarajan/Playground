#include<stdio.h>
int main()
{
  int n,i,b;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&b);
  for(i=0;i<n;i++)
  {
    if(arr[i]==b)
    {
      printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.",b);
  return 0;
}
  
  