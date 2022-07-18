def solution(n):
    divisor = []
    if n==0:
        return 0
        
    original = n
    for i in range(1,3001):
        
        if original%i == 0:
            divisor.append(original // i)
            divisor.append(i)
            
    return sum(divisor)//2