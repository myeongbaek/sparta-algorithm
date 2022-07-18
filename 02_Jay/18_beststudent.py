def solution(answers):
    question_length = len(answers)
    
    answer_len = [len(answers) // x + 1 for x in [5,8,10]]
    a_answer = [1,2,3,4,5] 
    b_answer = [2,1,2,3,2,4,2,5]
    c_answer = [3,3,1,1,2,2,4,4,5,5]
    each_answer = [a_answer, b_answer, c_answer]
    
    total_answer, result, best_student = [0,0,0], [0,0,0], []
    for i in range(3):
        total_answer[i] = each_answer[i] * answer_len[i]
    
    for i in range(len(answers)):
        for student in range(3):
            if answers[i] == total_answer[student][i]:
                result[student] += 1
    print(result)
    print(max(result))
    for i in range(len(result)):
        if result[i] == max(result):
            best_student.append(i+1)
    return best_student