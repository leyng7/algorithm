"""
입력 조건
- 첫째 줄에 여러 개의 숫자로 구성된 하나의 문자열 S가 주어진다. (1 <= S <= 20)

출력 조건
- 첫쨎 줄에 만들어질 수 있는 가장 큰 수를 출력한다.

입력 및 출력 예시
02984 => 576
567 => 210
"""

data = input()
result = int(data[0])

for i in range(1, len(data)):
    num = int(data[i])
    if num <= 1 or result <= 1:
        result += num
    else:
        result *= num

print(result)
