// C program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <math.h>

void SieveOfEratosthenes(unsigned long long n[])
{

    // Create a boolean array "prime[0..n]" and initialize
    // all entries it as true. A value in prime[i] will
    // finally be false if i is Not a prime, else true.
    bool prime[n + 1];
    memset(prime, true, sizeof(prime));

    for (long long p = 2; p * p <= n; p++) {
        // If prime[p] is not changed, then it is a prime
        if (prime[p] == true) {
            // Update all multiples of p greater than or
            // equal to the square of it numbers which are
            // multiple of p and are less than p^2 are
            // already been marked.
            for (long long i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }

    // Print all prime numbers
    for (long long p = 2; p <= n; p++)
        if (prime[p])
            printf("%d ",p);
    printf("\n");
}

// Driver Code
int main()
{
    unsigned long long  n[] = {1000000, 000};
    printf("Following are the prime numbers smaller than or equal to %d \n", n);
    SieveOfEratosthenes(n);
    return 0;
}