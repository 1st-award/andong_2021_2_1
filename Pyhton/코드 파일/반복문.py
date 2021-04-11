# while문
x = 0
while x < 4:
    print(x)
    x += 1

# while로 1부터 10까지 합 구하기
x = 1
total = 0
while(x<11):
    total += x
    x += 1
print("1부터 10까지의 합", total)

# for문
for x in range(3, 9): # 3이상 9미만의 수를 x에 저장
    print(x, end = ' ')

Months = ["Jan", "Feb", "Mar", "April", "May", "June"]
for m in Months: # Months의 원소만큼 m에 저장
    print(m, end = ' ')
print()

# for로 1부터 10까지 합 구하기
sum = 0
for i in range(1, 11):
    sum += i
print("1부터 10까지의 합:", sum)
    
# for로 팩토리얼 구하기
factorial = 1
n = int(input("!n: "))
for i in range(2, n+1):
    factorial *= i
print(factorial)
