#include <stdio.h>

int f(int x, int y) {
  int z;
  z = x+y;
  return z;
}

int main() {
  printf("%d\n", f(10+10,5+5));
}


