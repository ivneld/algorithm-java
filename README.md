# Algorithm Java

Java 24 기반 알고리즘 문제 풀이 저장소

## 구조

```
src/
├── main/java/algorithm/
│   ├── programmers/
│   │   ├── level1/
│   │   ├── level2/
│   │   └── level3/
│   └── baekjoon/
│       ├── bronze/
│       ├── silver/
│       └── gold/
└── test/java/algorithm/
    ├── programmers/
    └── baekjoon/
```

## 네이밍 규칙

| 플랫폼 | prefix | 예시 디렉토리 |
|--------|--------|--------------|
| 프로그래머스 | `P{문제번호}` | `P42576_완주하지못한선수` |
| 백준 | `B{문제번호}` | `B1000_A더하기B` |

## 실행

```bash
# 전체 테스트
./gradlew test

# 특정 테스트
./gradlew test --tests "algorithm.programmers.level1.*"
```
