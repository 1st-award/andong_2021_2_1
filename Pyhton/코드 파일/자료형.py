print(type("안녕하세요")) # 문자열(str) 자료
print(type(3.2)) # 실수형(float) 자료 (파이썬은 double이 없다...)
print(type(15)) # 정수형(int) 자료

#input() 함수 ()안에 문자를 입력 할 수 있다
name = input("당신의 이름은 ? ")
print(name + "씨, 만나서 반갑습니다.")

kor = input("국어: ")
math = input("수학: ")
eng= input("영어: ")
print("총합: ", (kor+math+eng)) # input함수는 str형으로 저장한다
# 형 변환을 해주면 총합이 나온다
kor = int(input("국어: "))
math = int(input("수학: "))
eng= int(input("영어: "))
print("총합: ", (kor+math+eng))
