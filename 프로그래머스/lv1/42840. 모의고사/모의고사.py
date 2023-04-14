def solution(answers):
    man = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]]
    result = [0,0,0]
    for i,a in enumerate(answers):
        for z in range(3):
            if z == 0:
                num = int(i%5)
                if man[z][num]==a:
                    result[z]+=1
            elif z ==1:
                num = int(i%8)
                if man[z][num]==a:
                    result[z]+=1
            elif z == 2:
                num = int(i%10)
                if man[z][num]==a:
                    result[z]+=1
    answer=[i+1 for i,x in enumerate(result) if x==max(result)]
    return answer