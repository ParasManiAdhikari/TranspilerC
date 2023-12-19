#include <stdio.h>

int even(int n){
  if (n==0) return 1;
  else return odd(n-1);
}

int odd(int n){
  if (n==0) return 0;
  else return even(n-1);
}

int main() {
  printf("%d\n",even(4)); // 1
  printf("%d\n",even(5)); // 0
  printf("%d\n",odd(4)); // 0
  printf("%d\n",odd(5)); // 1
}
