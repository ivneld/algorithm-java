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

## 정답
```
function solveLongestPrefixSuffix(s):
    n = length(s)
    if n == 0: return 0
    
    // pi[i]는 0부터 i까지의 부분 문자열에서 일치하는 최장 prefix-suffix 길이
    pi = array of size n, initialized to 0
    
    j = 0 // prefix의 끝을 가리키는 포인터이자 현재까지 일치한 길이
    
    // suffix의 끝을 가리키는 포인터 i는 1부터 시작 (자기 자신 제외 조건)
    for i from 1 to n - 1:
        // 문자가 일치하지 않으면, 이전 단계에서 일치했던 부분으로 되돌아감
        while j > 0 AND s[i] != s[j]:
            j = pi[j - 1]
            
        // 문자가 일치하면 길이를 1 증가시키고 pi 배열에 기록
        if s[i] == s[j]:
            j = j + 1
            pi[i] = j
            
    // 전체 문자열에 대한 최장 공통 prefix-suffix 길이 반환
    return pi[n - 1]
```
