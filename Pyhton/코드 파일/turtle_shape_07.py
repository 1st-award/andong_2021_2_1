import turtle as t

t.color('red', 'yellow')
t.begin_fill()
while True:
    t.forward(200)
    t.left(170)
    if abs(t.pos()) < 1: # turtle의 좌표가 원점으로부터 1픽셀 이하의 거리이면 루프를 벗어난다.
        break

t.end_fill()
t.done()
