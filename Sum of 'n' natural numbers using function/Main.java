#include<stdio.h>
int main() {
    // Type your code here
   int square(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
     sum=sum+i;
    }
     return sum;
   }
  int n;
  scanf("%d",&n);
  int sq=square(n);
  printf("%d",sq);
   return 0;
  	
   }