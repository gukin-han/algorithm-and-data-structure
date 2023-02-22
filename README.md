# 자료구조 및 알고리즘
- [자료구조 및 알고리즘](#자료구조-및-알고리즘)
  - [전산 수학](#전산-수학)
    - [집합](#집합)
      - [집합(Set)](#집합set)
      - [집합 연산](#집합-연산)
      - [`HashSet`을 이용한 집합 생성 및 연산](#hashset을-이용한-집합-생성-및-연산)
      - [`ArrayList`를 이용한 집합 구현](#arraylist를-이용한-집합-구현)
      - [관련 문제](#관련-문제)
    - [경우의 수](#경우의-수)
    - [순열](#순열)
    - [조합](#조합)
    - [점화식과 재귀함수](#점화식과-재귀함수)
    - [지수와 로그](#지수와-로그)
  - [자료구조 (Data Structure)](#자료구조-data-structure)
    - [배열 (`Array`, `ArrayList`)](#배열-array-arraylist)
    - [연결리스트 (`LinkedList`)](#연결리스트-linkedlist)
    - [스택](#스택)
    - [큐](#큐)
    - [데크](#데크)
    - [해시 테이블](#해시-테이블)
    - [](#)
  - [알고리즘](#알고리즘)
    - [알고리즘 복잡도](#알고리즘-복잡도)
  - [리뷰](#리뷰)
  - [References](#references)
## 전산 수학
### 집합
#### 집합(Set)
* 특정 조건에 맞는 원소들의 모임
* 원소끼리 중복되지 않음
* 집합 표현법
  * 원소나열법
  * 조건제시법
  * 벤 다이어그램
#### 집합 연산
* 교집합 (Intersection)
  * 두 집합이 공통으로 포함하는 원소로 이루어진 집합
  * $A \cap B= \{x\;|\;x \in A\;and\; x \in B\}$
  * `a.retainAll(b)`
* 합집합 (Union)
  * 어느 하나에라도 속하는 원소들을 모두 모은 집합
  * $A \cup B= \{ x\; |\; x \in A\; or\; x \in B\}$
* 차집합 (Subtraction)
  * A(or B)에만 속하는 원소들의 집합
  * $A - B= \{x\;|\;x \in A\;and\; x \notin B\}$
* 여집합 (Complement)
  * 전체집합(U) 중 A의 원소가 아닌 것들의 집합
  * $A^c =\{x\;|\;x \in U\;and\;x\notin A\}$
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
* 백준
  * <a href="https://www.acmicpc.net/problem/25370" target="_blank">25370: 카드 숫자 곱의 경우의 수</a> 
### 경우의 수
### 순열
### 조합
### 점화식과 재귀함수
### 지수와 로그
## 자료구조 (Data Structure)
> 자료를 효율적으로 관리(= 저장, 삭제, 탐색)하기 위한 구조
* 목적에 맞게 사용한 자료구조는 실행 시간 단축 및 메모리 용량 절감 효과
  * 실행 시간과 메모리 용량은 trade off 관계
* 분류
  * 선형 자료구조
    * 배열 / 연결리스트 / 스택 / 큐 / 데큐 / 해시테이블 등
  * 비선형 자료구조
    * 트리 / 그래프 / 힙 / 우선순위 큐 / 트라이
### 배열 (`Array`, `ArrayList`)
### 연결리스트 (`LinkedList`)
### 스택
### 큐
### 데크
### 해시 테이블
### 
## 알고리즘
### 알고리즘 복잡도
## 리뷰
## References
1. 문병로, (2022), 한빛아카데미, "쉽게 배우는 자료구조 with 자바".
2. [Various Authors, (2022), wikepedia, "약수".](https://ko.wikipedia.org/wiki/%EC%95%BD%EC%88%98)