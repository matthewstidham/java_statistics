#!/usr/bin/python3

def sieve(n):
    primes = []
    prime = [True for _ in range(n + 1)]
    p = 2
    while p * p <= n:
        if prime[p]:
            for i in range(p * p, n+1, p):
                prime[i] = False
        p += 1

    for p in range(2, n + 1):
        if prime[p]:
            primes.append(p)
    return primes


if __name__ == "__main__":
    limit = 10 ** 9
    print(sieve(limit))
