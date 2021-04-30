import math

def quadEqSolve(aa, bb, dd):
    xx1 = (-bb - math.sqrt(dd)) / (2 * aa)
    xx2 = (-bb + math.sqrt(dd)) / (2* aa)
    return xx1, xx2


def main():
    print("ax^2 + bx + c = 0")
    '''
    a = float(input("이차항의 계수 a = "))
    b = float(input("일차항의 계수 b = "))
    c = float(input("상수항의 계수 c = "))
    '''
    a, b, c = map(float, input('a, b, c = ').split())
    d = b**2 - 4*a*c

    if d >= 0:
        x1, x2 = quadEqSolve(a, b, d)
        print("근=", x1, x2)
    else:
        print("실근이 없다.")


main()
