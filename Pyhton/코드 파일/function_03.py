import math

def d2r(d):
    return(d * math.pi / 180)

print("180도에 대한 라디안 값 = {}".format(round(d2r(180), 6)))
print("90도에 대한 라디안 값 = {}".format(round(d2r(90),6)))
print("45도에 대한 라디안 값 = {}".format(round(d2r(45),6)))
