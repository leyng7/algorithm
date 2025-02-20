def solution(n):
    if (n ** 0.5).is_integer():
        return (int(n ** 0.5) + 1) ** 2
    else:
        return -1
