#include<stdio.h>
int main()
{
  int n,i,ele_1,ele_2,ele1_ind=-1,ele2_ind=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
   scanf("%d",&a[i]);
  }
  scanf("%d%d",&ele_1,&ele_2);
  for(i=0;i<n;i++)
  {
    if(ele_1==a[i] && ele1_ind==-1)
    {
      ele1_ind=i;
    }
  }
    for(i=0;i<n;i++)
  {
    if(ele_2==a[i] && ele2_ind==-1)
    {
      ele2_ind=i;
    }
    }
    printf("Element 1 index = %d\nElement 2 index = %d",ele1_ind,ele2_ind);
    return 0;
  }
    
    