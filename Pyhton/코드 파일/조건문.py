# if문
x = int(input("x: "))
y = int(input("y: "))
if x < y:
    print("x가 y보다 작습니다")

x = int(input("정수입력: "))
if x < 0:
    x *= -1
    print("절댓값은", x)

# if - else문
age = int(input("나이 입력: "))
if age >= 20:
    print("맥주 한 캔 주세요.")
else:
    print("콜라 한 캔 주세요.")

x = int(input("x: "))
y = int(input("y: "))
if x < y:
    print("x가 y보다 더 작습니다.")
else:
    print("x가 y보다 더 큽니다.")

#if - elif - else
x = int(input("x: "))
y = int(input("y: "))
if x < y:
    print("x가 y보다 더 작습니다.")
elif x > y:
    print("x가 y보다 더 큽니다.")
else:
    print("x가 y는 같습니다.")
    

# 단순 if문 문제
radius = float(input("반지름 입력: "))
print("원의 넓이:", (3.14 * radius ** 2))

# if - else문 문제 01
n = int(input("정수 입력: "))
if n % 2 == 0:
    print("짝수 입니다")
else:
    print("홀수 입니다")

# if - else문 문제 02
age = int(input("나이 입력: " ))
tall = int(input("키 입력: "))
if (age >= 13) and (tall >= 155):
    print("탈 수 있습니다")
else:
    print("탈 수 없습니다")

# if - elif - else
# 학생의 성적을 입력 받아서 성적에 해당하는 등급을 출력하는 프로그램을 작성하시오.
# 90점 이상: A, 80점 이상: B, 70점 이상: C, 60점 이상: D, 60점 미만: F)
score = int(input("점수 입력: "))
if score >= 90:
    print("A")
elif score >= 80:
    print("B")
elif score >= 70:
    print("C")
elif score >= 60:
    print("D")
else:
    print("F")

