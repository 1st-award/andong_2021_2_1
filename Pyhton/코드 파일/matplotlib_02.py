import matplotlib.pyplot as plt

x = [1, 2, 3, 4]
y = [1, 4, 2, 3]
plt.xticks(x)
plt.yticks(x)
plt.plot(x, y, "rp:")
plt.show()
