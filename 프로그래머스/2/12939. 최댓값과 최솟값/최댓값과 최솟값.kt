class Solution {
    fun solution(s: String): String {
        // 공백으로 구분된 숫자들을 리스트로 변환 후 정수로 변환
        val numbers = s.split(" ").map { it.toInt() }
    
        // 최소값과 최대값 찾기
        val min = numbers.minOrNull() ?: 0
        val max = numbers.maxOrNull() ?: 0
    
        // "(최소값) (최대값)" 형식의 문자열 반환
        return "$min $max"
    }
}