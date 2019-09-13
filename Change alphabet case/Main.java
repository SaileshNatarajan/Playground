#include <stdio.h>
int main()
{
  char m;
  scanf("%c",&m);
  if(m>='A' && m<='Z')
  {
    printf("%c",m+32);
  }
  else if(m>='a' && m<='z')
  {
    printf("%c",m-32);
  }
	return 0;
}