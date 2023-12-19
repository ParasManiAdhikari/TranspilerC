#include <stdio.h>

int fact(int n) {
  if (n < 2) return 1;
  return n * fact(n-1);
}

int main() {
  printf("%d\n",fact(3)); // kommentar
  //return 0;
}