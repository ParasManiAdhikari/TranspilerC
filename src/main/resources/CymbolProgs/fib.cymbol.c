#include <stdio.h>

int fib(int n) {
  if (n==0) return 0;
  if (n==1) return 1;
  return n;
}

int main() {
  printf("%d\n",fib(5));
//  return 0;
}




