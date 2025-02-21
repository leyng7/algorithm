def solution(n):
    words = "수박" * (n // 2)
    
    if n % 2 == 0:
        return words
    else:
        return words + "수"
    