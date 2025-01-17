# masters_pre

1. 문자 배열을 만들어 A-Z 까지 배열에 저장하고 다시 출력하기

~~~
[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
~~~

2. 객체 배열을 사용하여 문제를 구현하기  
   온마을(A) 도서관에 책이 5권 있다.

|   `제목`   | `저자`     |    
|:--------:|:---------|  
|   태백산맥   | 조정래      |
| 이기적인 유전자 | 리차드 도킨스  |
|  자전거 도둑  | 박완서      |
|    토지    | 박경리      |
|   대변동    | 제레드 다이아몬 |  

책에 대한 관리를 목적으로 하고 있어 복사본 (A-1)을 하나 두었다.  
그리고 같은 책 목록으로 두마을(B)도서관을 개관함.  
이때 책 목록 A,A-1,B를 출력하기.  
두 도서관의 목록이 다음과 같이 변경되었다.  
- 온마을(A)도서관에 다음과 같이 책 목록이 변경됨  
(`수정`)3번째 목록  
[자전거 도둑| 박완서] => [그 많던 싱아는 누가 다 먹었을까| 박완서]
- 두마을(B) 도서관에 책이 추가되었다.  
(추가)마지막 목록  
[사피엔스|유발 하라리]  

A,A-1,B 목록을 출력하세요.  
위 문제에서 A와 A-1은 항상 같은 인스턴스를 가리키고,B는 다른 인스턴스를 가리킨다. 

~~~
libraryA = [Book name: 태백산맥, author: 조정래, Book name: 이기적 유전자, author: 리처드 도킨스, Book name: 자전거 도둑, author: 박완서, Book name: 토지, author: 박경리, Book name: 대변동, author: 제레드 다이아몬드]
libraryA1 = [Book name: 태백산맥, author: 조정래, Book name: 이기적 유전자, author: 리처드 도킨스, Book name: 자전거 도둑, author: 박완서, Book name: 토지, author: 박경리, Book name: 대변동, author: 제레드 다이아몬드]
libraryB = [Book name: 태백산맥, author: 조정래, Book name: 이기적 유전자, author: 리처드 도킨스, Book name: 자전거 도둑, author: 박완서, Book name: 토지, author: 박경리, Book name: 대변동, author: 제레드 다이아몬드]

libraryA = [Book name: 태백산맥, author: 조정래, Book name: 이기적 유전자, author: 리처드 도킨스, Book name: 자전거 도둑, author: 박완서, Book name: 그 많던 싱아는 누가 다 먹었을까, author: 박완서, Book name: 대변동, author: 제레드 다이아몬드]
libraryA1 = [Book name: 태백산맥, author: 조정래, Book name: 이기적 유전자, author: 리처드 도킨스, Book name: 자전거 도둑, author: 박완서, Book name: 그 많던 싱아는 누가 다 먹었을까, author: 박완서, Book name: 대변동, author: 제레드 다이아몬드]
libraryB = [Book name: 태백산맥, author: 조정래, Book name: 이기적 유전자, author: 리처드 도킨스, Book name: 자전거 도둑, author: 박완서, Book name: 토지, author: 박경리, Book name: 대변동, author: 제레드 다이아몬드, Book name: 사피엔스, author: 유발 하라리]
~~~





