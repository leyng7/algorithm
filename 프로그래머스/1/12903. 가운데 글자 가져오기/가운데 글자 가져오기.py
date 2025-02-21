def solution(s):
    mid_len = len(s) // 2
    if len(s) % 2 == 0:
        return s[mid_len - 1 : mid_len + 1]
    else:
        return s[mid_len]
