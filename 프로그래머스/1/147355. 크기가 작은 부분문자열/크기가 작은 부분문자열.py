def solution(t, p):
    
    answer = 0
    
    for i in range(len(t) - len(p) + 1):
        numbers = t[i:i + len(p)]
        if numbers <= p:
            answer += 1
    
    return answer