#include <stdio.h>

int main() {
  int n;
  int i;
  n = 1;
  for (i=0; i<3; i=i+1) {
    n=2*n;
  }
  printf("%d\n",n);
}
