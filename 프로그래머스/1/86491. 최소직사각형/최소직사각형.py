def solution(sizes):
    max_size_1 = 0
    max_size_2 = 0
    for size in sizes:
        size.sort()
        max_size_1 = max(size[0], max_size_1)
        max_size_2 = max(size[1], max_size_2)
    
    return max_size_1 * max_size_2