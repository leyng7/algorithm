def solution(arr1, arr2):
    answer = []
    for a1, a2 in zip(arr1, arr2):
        inner = []
        for b1, b2 in zip(a1, a2):
            inner.append(b1 + b2)
        answer.append(inner)
    return answer
