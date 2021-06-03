class Ractangle:
    x1, y1, x2, y2 = 0, 0, 0, 0
    def __init__(self, x1, y1, x2, y2):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2

    def calPerimeter(self):
        return 2*(abs(self.x2 - self.x1) + abs(self.y2 - self.y1))

    def calArea(self):
         return abs(self.x2 - self.x1) * abs(self.y2 - self.y1)

r1 = Ractangle(150, 180, 100, 100)
print("사각형 1 의 둘레 = ", r1.calPerimeter())
print("사각형 2 의 넓이 = ", r1.calArea())
r2 = Ractangle(0, 0, 280, 240)
print("사각형 1 의 둘레 = ", r2.calPerimeter())
print("사각형 2 의 넓이 = ", r2.calArea())
