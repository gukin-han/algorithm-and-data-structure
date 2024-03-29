# Data Structures and Algorithms
## Understading Computation requirement in Coding Test
You might have experienced runtime failure because of computation speed limitation in Coding test problem, as just like me. This can certainly be attributed to the lack of your knowledge of the relationship between "given computation cacpability" and "time limitation".

<br>

## Types of DSA to learn
You must learn the concenpts below before you actully start solving problems [<a href="https://seongmok.com/m/85" target="_blank">1</a>]:
1. basics (brute-force, sorting, data structures)
2. Dynamic programming
3. Greedy Algorithm
4. Math (Prime Number, GCD, Log)
5. Backtracking
6. BFS, DFS
7. Simulation
8. Binary Search
9. Two Pointers
10. Single Source Shortest Path Problem
11. Union Find
12. Minimum Spanning Tree
<br>

## Refereces
1. <a href="https://seongmok.com/m/85" target="_blank">성목, (2022), Tistory, "코딩테스트를 준비하는 효율적인 방법".</a>
<br>

## Appendix A. Greatest Common Division
### Recurive version
```java
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
```
<br>

### Using While loop
```java
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```
