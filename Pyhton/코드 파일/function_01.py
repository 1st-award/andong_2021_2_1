def user_max(data):
    temp = data[0]
    for x in data:
        if x > temp:
            temp = x
    return temp


def user_min(data):
    temp = data[0]
    for x in data:
        if x < temp:
            temp = x
    return temp


def user_sum(data):
    sum = 0
    for x in data:
        sum+=x
    return sum


a = [5, 6, 8, 9, 1]
print(user_max(a))
print(user_min(a))
print(user_sum(a))
