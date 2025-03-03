def solution(s, n):
    result = ""
    for char in s:
        if char.isalpha():  # 알파벳인 경우 65
            base = ord('A') if char.isupper() else ord('a')
            result += chr((ord(char) - base + n) % 26 + base)
        else:  # 공백인 경우
            result += char
    return result