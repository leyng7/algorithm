def solution(s):
    # 공백으로 구분된 문자열을 정수 리스트로 변환
    numbers = list(map(int, s.split()))
    
    # 최소값과 최대값 찾기
    min_val = min(numbers)
    max_val = max(numbers)
    
    # "(최소값) (최대값)" 형식의 문자열 반환
    return f"{min_val} {max_val}"