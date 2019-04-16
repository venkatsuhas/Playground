#include<stdio.h>
int main() {
   // Type your code here
   int square(int n)
  {
    int s;
    s=n*n;
    return s;
  }
  int n;
  scanf("%d",&n);
  int sq=square(n);
  printf("%d",sq);
   
   return 0;
}