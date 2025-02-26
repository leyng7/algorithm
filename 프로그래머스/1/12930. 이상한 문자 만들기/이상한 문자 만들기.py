def solution(s):
    words = s.split(" ")
    result = []
    
    for word in words:
        new_word = "".join(
            char.upper() if i % 2 == 0 else char.lower()
            for i, char in enumerate(word)
        )
        result.append(new_word)
    
    return " ".join(result)