## 문제 정보

- **플랫폼**: Custom
- **문제 번호**: C002
- **유형**: Prefix Sum
- **제목**: 공평한 분할

## 문제 설명

같은 길이의 두 배열 A, B를 위치 K에서 분할하면 4개의 구간이 생긴다.
네 구간의 합이 모두 같을 때 '공평'하다고 한다.
공평한 분할 방법의 수를 반환한다.

## 예시

```
A = [1, 2, 3, 4, 10]
B = [3, 0, 7, 0, 10]

K=4: [1,2,3,4] | [10]  → 합 10
     [3,0,7,0] | [10]  → 합 10  →  공평 ✓

반환값: 1
```

## 정답
```
function solveFairSplit(A, B):
    n = length(A)
    
    // 1. 각 배열의 전체 합(Total Sum)을 구함
    sumA = sum of all elements in A
    sumB = sum of all elements in B
    
    // 2. 두 배열의 전체 합이 다르거나, 합이 홀수면 공평한 분할이 불가능함
    // (절반으로 나누었을 때 정수가 나와야 함)
    if sumA != sumB OR sumA % 2 != 0:
        return 0
        
    target = sumA / 2
    count = 0
    leftSumA = 0
    leftSumB = 0
    
    // 3. 분할점 K를 0부터 n-2까지 이동하며 확인 (최소 한 원소는 오른쪽에 남겨야 함)
    for i from 0 to n - 2:
        leftSumA = leftSumA + A[i]
        leftSumB = leftSumB + B[i]
        
        // A와 B의 왼쪽 구간 합이 모두 목표치(전체 합의 절반)와 같다면
        // 자동으로 오른쪽 구간의 합도 target과 같아짐
        if leftSumA == target AND leftSumB == target:
            count = count + 1
            
    return count
```
