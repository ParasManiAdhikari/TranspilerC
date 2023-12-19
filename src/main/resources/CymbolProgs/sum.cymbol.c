#include <stdio.h>

int identity(int x){
	return x;
}

int add(int x, int y) {
  if (y==0) return identity(x);
  else return add(x+1, y-1);
}

int add2(int x, int y) {
  if (y!=0) return add2(x+1, y-1);
  else  return identity(x);
}

int sum(int n){
   if (n==0) return 0;
   else return add(sum(n-1),n);
}

int sum2(int n){
   if (n==0) return 0;
   else return add2(sum2(n-1),n);
}

int main() {
	printf("%d\n",sum(6)); //21
	printf("%d\n",sum2(6)); //21
}

