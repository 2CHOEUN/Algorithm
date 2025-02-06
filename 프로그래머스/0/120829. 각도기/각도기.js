function solution(angle) {
    var answer = 1;
    
    if(angle == 180) answer = 4;
    else if(angle > 90) answer = 3;
    else if(angle == 90) answer = 2;
    return answer;
}