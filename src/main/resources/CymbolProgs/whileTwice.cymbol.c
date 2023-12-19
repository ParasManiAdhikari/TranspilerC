#include <stdio.h>

int n;
int i;
int main() {
  n = 1;
  i = 0;
  while (i<3) {
    n=2*n;
    i=i+1;
  }
  i = 0;
  while (i<3) {
    n=2*n;
    i=i+1;
  }
  printf("%d\n",n);
}
