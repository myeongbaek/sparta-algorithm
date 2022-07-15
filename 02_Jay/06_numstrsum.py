def solution(n):
    answer = 0
    number_list = str(n)
    for number in number_list:
        answer += int(number)
    return answer