#include<stdio.h>
int main()
{
float a,b,c;
scanf("%f",&a);
scanf("%f",&b);
c=(float)((b/360)*2*3.14*a);
printf("%.2f",c);
return 0;
}