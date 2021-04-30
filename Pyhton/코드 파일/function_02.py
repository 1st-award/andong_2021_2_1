def factorial(n):
    f = 1
    for x in range(2, n+1):
        f = f * x
    return f


def main():
    fac = factorial(5)
    print("5팩토리얼 = {}".format(fac))

main()
