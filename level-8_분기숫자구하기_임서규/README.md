# 분기 숫자 구하기

## 상식
분기란 1년을 4등분 한 것으로 아래와 같다.
- 1분기 1월~3월
- 2분기 4월~6월
- 3분기 7월~9월
- 4분기 10월~12월

## 풀이 하면서 참고할 점
- 배열로 mapping table 만들어서 출력하도록 하는게 임베디드에서 일반적인 최적화 방법이다.
- swtich table 자동생성해주는 Compiler에서는 그냥 switch쓰는게 빠르다.
