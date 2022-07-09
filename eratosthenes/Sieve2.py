#!/usr/bin/env python3
import gc

def sieve(n):
    primes = list(range(2, n))
    for x in range(2, int(n ** .5 + 1)):
        if x in primes:
            print(x)
            gc.disable()
            primes = [i for i in primes if i not in range(x * x, n+1, x)]
    return primes


if __name__ == "__main__":
    limit = 10000000
    print(sieve(limit))
