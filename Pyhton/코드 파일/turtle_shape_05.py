import turtle as t

poly = [3, 4, 5, 6, 8]
color = ["red", "green", "blue", "yellow", "orange"]
t.pensize(3)

for i in range(len(poly)):
    x_pos = 120*i-240
    t.penup()
    t.goto(x_pos, -50)
    t.pendown()
    t.fillcolor(color[i])
    t.begin_fill()
    t.circle(50, steps = poly[i])
    t.end_fill()
