## int형 숫자 자릿수 구하기
int Num = (int)(Math.log10(N)+1); //숫자 자릿수 구하는 법

## List에 저장되어있는 원소 다 대문자로 바꾸기
List<Character> UppercaseList = arrList.stream()
                .map(c -> (c >= 'a' && c <= 'z') ? (char) (c - 32) : c)
                .collect(Collectors.toList());

arrList.stream():

arrList 리스트를 Stream으로 변환합니다. 이 Stream은 리스트의 모든 요소를 순회할 수 있게 해줍니다.
.map(c -> (c >= 'a' && c <= 'z') ? (char) (c - 32) : c):

map 함수는 각 요소를 변환하는 작업을 수행합니다.
이 부분에서 각 문자가 소문자인지 확인합니다 (c >= 'a' && c <= 'z').
만약 소문자라면, ASCII 코드에서 32를 빼서 대문자로 변환합니다 ((char) (c - 32)).
소문자가 아닌 경우에는 원래 문자를 그대로 반환합니다.
.collect(Collectors.toList()):

map 함수로 변환된 Stream의 요소들을 다시 List로 수집합니다. 이로 인해 모든 문자가 대문자로 변환된 리스트가 만들어집니다.
