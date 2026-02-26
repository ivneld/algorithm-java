## 문제 정보

- **플랫폼**: Custom
- **문제 번호**: C003
- **유형**: KMP (실패 함수)
- **제목**: prefix이면서 suffix

## 문제 설명

문자열이 주어졌을 때, 전체 문자열이 아니면서 prefix이자 suffix인 부분 문자열 중
가장 긴 것의 길이를 반환한다.

## 예시

```
s = "ababab"

prefix: a, ab, aba, abab, ababa
suffix: b, ab, bab, abab, babab

공통: ab, abab  →  가장 긴 것은 "abab" → 4 반환
```

## 접근 방식

KMP 알고리즘의 실패 함수(pi 배열)를 그대로 활용한다.

`pi[i]` = `s[0..i]` 에서 prefix이자 suffix인 가장 긴 문자열의 길이

따라서 `pi[n-1]` 이 답이다.

## 실패 함수 동작 원리

```
s = "ababab"
i=1: 'b' != 'a'          pi[1] = 0
i=2: 'a' == 'a'          pi[2] = 1,  j=1
i=3: 'b' == 'b'          pi[3] = 2,  j=2
i=4: 'a' == 'a'          pi[4] = 3,  j=3
i=5: 'b' == 'b'          pi[5] = 4,  j=4  ← 반환
```

## 시간복잡도

O(n)

## 핵심 포인트

- j가 불일치할 때 `pi[j-1]`로 후퇴하는 것이 핵심 (불필요한 비교 스킵)
- `pi[n-1]`이 곧 전체 문자열에 대한 답
