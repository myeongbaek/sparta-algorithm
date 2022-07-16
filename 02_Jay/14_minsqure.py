def solution(sizes):
    # 가로 x 세로 를 적합하게 만들기 위해 만약 가로<세로 라면 스위치
    # 가장 큰 가로길이와 가장 큰 세로길이를 계산
    # 곱하기 하여 리턴
    max_w = 0
    max_h = 0
    
    for wallet in sizes:
        # wallet[0] = width, wallet[1] = height
        if wallet[0] < wallet[1]:
            temp_size = wallet[0]
            wallet[0] = wallet[1]
            wallet[1] = temp_size
        if wallet[0] > max_w:
            max_w = wallet[0]
        if wallet[1] > max_h:
            max_h = wallet[1]
    
    answer = max_w * max_h
    return answer