def solution(arr, divisor):
    answer = []
    for number in arr:
        if number % divisor == 0:
            answer.append(number)
    if len(answer) == 0:
        answer.append(-1)
    answer = sorted(answer)
    return answer