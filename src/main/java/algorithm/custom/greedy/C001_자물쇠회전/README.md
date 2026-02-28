## 문제 정보

- **플랫폼**: Custom
- **문제 번호**: C001
- **유형**: Greedy
- **제목**: 자물쇠 회전

## 문제 설명

번호를 돌려서 여는 자물쇠가 있다. i번 자리를 회전하면 i+1번 자리도 함께 +1된다
(9 다음은 0). 마지막 번호는 혼자 돌릴 수 없다.

현재 상태 S를 목표 상태 T로 만드는 최소 회전 횟수를 반환한다.
T를 만들 수 없으면 -1 반환.

## 예시

| S | T | 결과 |
|---|---|------|
| `"11111"` | `"22111"` | 1 |
| `"90909"` | `"01909"` | 1 |
| `"115"` | `"116"` | -1 |
| `"12345"` | `"12345"` | 0 |

## 정답
```
function solveLock(S, T):
    n = length(S)
    // 문자열을 정수 배열로 변환
    current_S = convert_to_int_array(S)
    target_T = convert_to_int_array(T)
    
    total_rotations = 0
    
    // 마지막 전(n-2)까지 순차적으로 회전 결정
    for i from 0 to n - 2:
        // i번 자리를 target_T[i]로 만들기 위해 필요한 회전 횟수 계산
        // (목표 - 현재 + 10) % 10 구문을 통해 양수 값 유지
        rotations_needed = (target_T[i] - current_S[i] + 10) % 10
        
        // 결과 누적
        total_rotations += rotations_needed
        
        // i번 자리를 회전하면 i+1번 자리도 함께 회전됨
        current_S[i+1] = (current_S[i+1] + rotations_needed) % 10
        
        // (참고) current_S[i]는 이제 target_T[i]와 같아짐
    
    // 마지막 자리 검증: 조작이 불가능한 마지막 자리가 목표와 일치하는지 확인
    if current_S[n-1] == target_T[n-1]:
        return total_rotations
    else:
        return -1
```
