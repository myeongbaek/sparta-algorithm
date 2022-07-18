def solution(s):
    answer_string = ""
    number_list_3 = {"one":"1", "two":"2", "six":"6"}
    number_list_4 = {"zero":"0", "four":"4", "five":"5", "nine":"9"}
    number_list_5 = {"three":"3", "seven":"7", "eight":"8"}
    
    
    for i in range(len(s)):
        if s[i].isdigit():
            answer_string += s[i]
            
        else:
            if i >=2:
                if (s[i-2] + s[i-1] + s[i]) in number_list_3.keys():
                    answer_string += number_list_3[s[i-2] + s[i-1] + s[i]] 
            if i >=3:
                if (s[i-3] + s[i-2] + s[i-1] + s[i]) in number_list_4.keys():
                    answer_string += number_list_4[s[i-3] + s[i-2] + s[i-1] + s[i]]
            if i >=4:
                if (s[i-4] + s[i-3] + s[i-2] + s[i-1] + s[i]) in number_list_5.keys():
                    answer_string += number_list_5[s[i-4] +s[i-3] + s[i-2] + s[i-1] + s[i]]

    return int(answer_string)