## [11장] 주석 : 유지보수롸 변경의 정확성을 높이는 주석 작성 방법

### 11.1 내용이 낡은 주석
### 11.2 주석 때문에 이름을 대충 짓는 예
### 11.3 의도와 사양 변경 시 주의 사항을 읽는 이에게 전달하기
### 11.4 주석 규칙 정리
| 규칙 | 이유 |
| --- | --- |
| 로직을 변경할 때는 반드시 주석도 함께 변경해야 함 | 주석을 제대로 변경하지 않으면 실제 로직과 달라져 주석을 읽는 사람에게 혼란을 줌 |
| 로직의 내용을 단순하게 설명하기만 하는 주석은 달지 않음 | 실질적으로 가독성을 높이지 않고, 주석 유지 보수가 힘듦. 결과적으로 내용이 낡은 주석이 될 가능성이 높음. |
| 가독성이 나쁜 설명을 추가하는 주석은 달지 않음. | 주석 유지 보수가 힘들고, 갱신되지 않아 낡은 주석이 될 가능성이 높음 |
| 로직의 의도와 사양을 변경할 때 주의할 점을 주석으로 달아야 함 | 유지 보수와 사양 변경에 도움이 됨. |
### 11.5 문서 주석
자바독 `/** */`
