#!/usr/bin/python3

def sieve(n):
    primes = set(range(2, n))
    for x in range(2, int(n ** .5)):
        if x in primes:
            primes -= set(range(x * x, n+1, x))
    return primes


if __name__ == "__main__":
    limit = 10000000
    print(sieve(limit))
