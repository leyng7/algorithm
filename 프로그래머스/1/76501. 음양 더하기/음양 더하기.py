def solution(absolutes, signs):
    digit_sum = 0
    for absolute, sign in zip(absolutes, signs):
        digit_sum += (absolute if sign else -absolute)
    return digit_sum