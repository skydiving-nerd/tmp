#!/usr/bin/python
from numpy import *
import matplotlib.pyplot as plt

t = arange(0.0, 2.0, 0.01)
s = sin(2*pi*t)
plt.plot(t, s, linewidth=1.0)

plt.xlabel('time (s)')
plt.ylabel('voltage (mV)')
plt.title('Example of a python plot')
plt.grid(True)
plt.show()
