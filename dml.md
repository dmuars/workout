# DML(Data Manipulation Lanuage) 기초

## 데이터베이스의 데이터를 CRUD(Create:생성, Read:조회, Update:수정, Delete:삭제) 할 수 있는 언어이다.

### 1. INSERT : 생성

INSERT는 어려운 게 없다. 컬럼명, 타입 맞춰서 잘 넣어주면 끝

```sql
INSERT INTO 스키마.테이블 (컬럼1, 컬럼2, ...) -- 컬럼을 명시하지 않으면 기본적으로 모든 컬럼 필요
VALUES  (컬럼1, 컬럼2, ...) -- 위 괄호 안에 명시한 컬럼과 개수, 타입이 일치해야 한다.
```

---

### 2. SELECT : 조회

테이블(데이터들의 집합)에서 데이터를 '선택(SELECT)'하여 가져온다.
SELECT절의 실행 순서는 `FROM → WHERE → GROUP BY → SELECT → ORDER BY` 이다.

먼저 선택한 '집합'으로부터(`FROM`), 그 집합의 데이터를 필터링(`WHERE`)한 후,

그룹화(`GROUP BY`)를 하고 그 안에서 가져올 컬럼을 찾는다.

그룹화 되었을 경우 그룹의 어느 한 컬럼을 특정할 수는 없다. `컬럼 ~는 반드시 GROUP BY 절 내에서 사용되어야 한다.` 같은 에러 발생.

왜냐하면 특정 그룹에 속하는 n개의 row 중 하나만을 특정할 수 없기 때문이다.

> 그래서 min(), max(), avg() 등의 집계함수를 사용해야 '그 그룹 내의' 최솟값 등을 구할 수 있다.

항상 정렬(`ORDER BY`)은 맨 마지막에 수행된다.

```sql
SELECT 컬럼1
     , 컬럼2
FROM 스키마.테이블
[WHERE 조건]
[AND [OR 조건]]
[GROUP BY 컬럼]
[HAVING 컬럼] -- 그룹바이 후 필터링
[ORDER BY 컬럼]
```

---

### 3. UPDATE : 수정

UPDATE도 WHERE절을 만족할 때 SET 할 컬럼을 설정해주는 게 전부이다.

```sql
UPDATE 스키마.테이블
SET 컬럼1 = 값
  , 컬럼2 = 값
  , ...
[WHERE 조건]
```

---

### 4. DELETE : 삭제

테이블에서 데이터를 삭제한다. 근데 거의 쓸 일 없으니 형태와 주의사항만 알면 된다.

WHERE절 없이 사용하면 DDL(Data Definition Language)에 해당하는 `TRUNCATE`와 비슷하다(세부적으로는 다름).

```sql
DELETE FROM 스키마.테이블
[WHERE 조건] -- WHERE절이 없으면 테이블의 모든 데이터를 삭제하기 때문에 주의한다.
```
