def solution(d, budget):
    d.sort()
    answer = 0
    for number in d:
        budget -= number
        if budget < 0:
            break
        answer += 1
    return answer
