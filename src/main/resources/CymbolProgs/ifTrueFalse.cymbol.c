#include <stdio.h>
#include <stdbool.h>

int main() {
  int n;
  int i;
  n = 1;
  if (true)
    {i=n;}
  if (false)
    printf("%d\n",n);
  else 
    printf("%d\n",i);
}
