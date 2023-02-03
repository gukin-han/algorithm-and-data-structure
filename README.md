# 자료구조 및 알고리즘
- [자료구조 및 알고리즘](#자료구조-및-알고리즘)
  - [자료구조](#자료구조)
    - [재귀 함수](#재귀-함수)
    - [리스트 (`List`)](#리스트-list)
      - [배열 리스트 (ArrayList) 구현](#배열-리스트-arraylist-구현)
  - [알고리즘](#알고리즘)
  - [리뷰](#리뷰)
  - [기초 개념](#기초-개념)
    - [약수 (divisor)](#약수-divisor)
  - [References](#references)
## 자료구조
자바에서 범용적인 자료구조는 컬렉션 프레임워크를 통해 제공된다. 따라서, 기능적으로 불필요하거나 부족한 경우가 있을 수 있기 때문에 효율적이며 효과적으로 (efficiently and effectively) 자원들을 관리하기 위해서는 스스로 자료구조를 구현하여 상황에 맞게 개선할 수 있는 능력을 배양해야한다.
### 재귀 함수
자기 자신을 호출하는 개념을 recursive라고 하며, 일반적으로 재귀라고 불린다. 재귀 보다는 자기 호출이라는 단어가 더 자연스럽게 해석될 수 있다 [[1](#references)].  
재귀 함수에서 다뤄지는 유명한 예제들은 피보나치 수열과 하노이 탑 문제 이다.
### 리스트 (`List`)
#### 배열 리스트 (ArrayList) 구현
```java
package list;

public interface IntegerListInterface {
    public void add(int index, Integer element);

    public void append(Integer element);

    public Integer remove(int index);

    public boolean removeItem(Integer element);

    public Integer get(int index);

    public void set(int index, Integer element);

    public int indexOf(Integer element);

    public int len();

    public boolean isEmpty();

    public void clear();
}
``` 
## 알고리즘
## 리뷰
1. [120836. 순서쌍의 개수](./프로그래머스/lv0/120836. 순서쌍의 개수)
2. [120834. 외계행성의 나이](./프로그래머스/lv0/120834. 외계행성의 나이)
## 기초 개념
### 약수 (divisor)
약수(divisor) 또는 인수(factor)는 어떤 수를 나누어 떨어지게 하는 수를 말한다 [[2](#references)].

## References
1. 문병로, (2022), 한빛아카데미, "쉽게 배우는 자료구조 with 자바".
2. [Various Authors, (2022), wikepedia, "약수".](https://ko.wikipedia.org/wiki/%EC%95%BD%EC%88%98)