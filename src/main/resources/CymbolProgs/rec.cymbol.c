#include <stdio.h>

int fact(int n){
   if (n==0) return 1;
   else      return n*fact(n-1);
}

int ggT(int m, int n){
   if (m==n) return m;
   else if (m > n) return ggT(m-n,n);
   else return ggT(m,n-m);
}

int fib(int n) {
  if (n==0) return 0;
  if (n==1) return 1;
  return (fib(n-1) + fib(n-2));
}

int mcCarthy(int n){
   if (n > 100) return n-10;
   else return mcCarthy(mcCarthy(n+11));
}

int ackermann(int n, int m) {
   if (n==0) return m + 1;
   else if (m==0) return ackermann(n-1,1);
   else return ackermann(n-1, ackermann(n,m-1));
}

int main() {
   printf("%d\n",fact(4)); // 24
	printf("%d\n",fib(5)); // 5
	printf("%d\n",ggT(12,24)); //12
	printf("%d\n",ackermann(3,3)); // 61
	printf("%d\n",mcCarthy(4)); // 91
}
