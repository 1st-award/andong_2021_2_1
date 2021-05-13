# 문자열
str0 = "ABCD"
print(str0[0])
print(str0[:3]) # str0[0] 부터 str0[2] 까지 출력
print(str0[-2]) # 뒤에서 2번째 출력
print(str0[:-3]) # 뒤에서 3번째 앞까지 출력

# 문자열 바꾸기 : replace()
str1 = 'Good morning!'
print("아침 인사:", str1) # ,를 쓰게되면 띄어쓰기가 된다
print("점심 인사:", str1.replace("morning", "afternoon"))

# 문자열 나누기 : split()
str2 = "Good morning, Mina!"
words = str2.split() # split에 ()으로 두면 공백으로 단어를 나눈다
print(words)
