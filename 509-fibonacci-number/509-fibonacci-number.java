class Solution {
    public int fib(int n) {
        if(n <= 2 && n > 0) return 1;
        else if(n == 0) return 0;
        else return fib(n-1) + fib(n-2);
    }
}