# 자료구조 및 알고리즘
## Part 1. 전산 수학 (Math for CS)
### 집합
#### 집합(Set)
* 특정 조건에 맞는 원소들의 모임
* 특징
  * 원소끼리 중복되지 않음
* 집합 표현법
  * 원소나열법
  * 조건제시법
  * 벤 다이어그램
#### 집합 연산
##### 교집합 (Intersection)
* 두 집합이 공통으로 포함하는 원소로 이루어진 집합
##### 합집합 (Union)
* 어느 하나에라도 속하는 원소들을 모두 모은 집합
##### 차집합 (Subtraction)
* A(or B)에만 속하는 원소들의 집합
##### 여집합 (Complement)
* 전체집합(U) 중 A의 원소가 아닌 것들의 집합
#### `HashSet`을 이용한 집합 생성 및 연산
#### `ArrayList`를 이용한 집합 구현
* 집합 클래스 및 필드 생성
```java
import java.util.Arrays;

class MySet {
    ArrayList<Integer> list;
}

    MySet() {
      this.list = new ArrayList<Integer>();
    }
```
#### 관련 문제
##### 백준
* <a href="https://www.acmicpc.net/problem/25370" target="_blank">25370: 카드 숫자 곱의 경우의 수</a> 
### 경우의 수
### 순열과 조합
#### 팩토리얼 (Factorial)
> 자연수의 팩토리얼은 그 수보다 작거나 같은 모든 양의 정수의 곱
$$n!=n(n-1)(n-2)\cdots3\cdot2\cdot1$$
##### 기본 문법
```java
int factorial(int n) {
    int result = 1;
    
    for (int i = 1; i <= n; i++) {
      result *= 1;
    }
    return result;
}
```
##### 스트림
```java
System.out.println(IntStream.range(2,6).reduce(1, (x, y) -> (x * y)));
```
#### 순열 (Permutation)
> 서로 다른 $n$개의 원소에서 $r$개를 중복없이 순서에 
#### 중복 순열 (Permutation with Repetition)
#### 원 순열 (Circular Permutation)

### 점화식과 재귀함수
### 지수와 로그
## Part 2. 자료구조 (Data Structure)
> 자료를 효율적으로 관리(= 저장, 삭제, 탐색)하기 위한 구조

* 목적에 맞게 사용한 자료구조는 실행 시간 단축 및 메모리 용량 절감 효과
  * 실행 시간과 메모리 용량은 trade off 관계
* 분류
  * 선형 자료구조
    * 1:1 관계
    * 배열 / 연결리스트 / 스택 / 큐 / 데큐 / 해시테이블 등
  * 비선형 자료구조
    * 1:N, N:N 관계
    * 트리 / 그래프 / 힙 / 우선순위 큐 / 트라이
* 자료구조의 구현
  * 추상 자료형 (Abstract Data Type; ADT)
    * 자료 형태와 자료에 대한 연산을 정의
    * 구체적인 구현 방법은 명시하지 않음 (추상클래스, 인터페이스)
  * 대부분의 자료구조는 자바 클래스로 제공
    * 이해를 한 후, 알맞은 클래스를 사용
### 배열 (`Array`, `ArrayList`)
### 연결리스트 (`LinkedList`)
### 스택
#### 스택 응용
* 문자열 뒤집기
* Postfix 계산
### 큐
### 데크
### 해시 테이블
### 트리
### 이진 탐색 트리
### 그래프
### 힙
### 우선순위 큐
### 트라이
## Part 3. 알고리즘 (Algorithm)
### 알고리즘 복잡도
#### 복잡도 (Complexity)
> 알고리즘 성능을 나타내는 척도

* 시간 복잡도 (Time Complexity)
  * 알고리즘의 필요 연산 횟수
* 공간 복잡도 (Space Complexity)
### 정렬
### 이진 탐색
### 투 포인터
### 그리디 알고리즘
### 분할 정복
### 다이나믹 프로그래밍
### 백트래킹
### 최단 경로
### 최소 신장 트리
## 리뷰 문제
* [약수의 개수와 덧셈](https://school.programmers.co.kr/learn/courses/30/lessons/77884) -> 제곱수로 약수의 개수 판별, 약수
* [x만큼 간격이 있는 n개의 숫자
](https://school.programmers.co.kr/learn/courses/30/lessons/12954) -> 타입 이슈 문제
## References
1. 문병로, (2022), 한빛아카데미, "쉽게 배우는 자료구조 with 자바".
2. [Various Authors, (2022), wikepedia, "약수".](https://ko.wikipedia.org/wiki/%EC%95%BD%EC%88%98)