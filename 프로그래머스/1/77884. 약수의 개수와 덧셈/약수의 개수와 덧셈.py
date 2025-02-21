def solution(left, right):
    answer = 0
    for num in range(left, right + 1):
        if int(num ** 0.5) ** 2 == num:  # 완전제곱수 판별
            answer -= num  # 약수 개수가 홀수면 빼기
        else:
            answer += num  # 약수 개수가 짝수면 더하기
    return answer
