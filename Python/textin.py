#!/usr/bin/python
#this program shows how to read from a file to display data from a text file. This program reads from file "data.txt" in this directory.

from pylab import *

Fx, Fy = genfromtxt("data.txt", comments="#", usecols=(0,1), unpack=True, invalid_raise=False)

plot(Fx, Fy, marker='+', linestyle='-', linewidth=1.0)

xlabel('x')
ylabel('x^2')
grid(True)
show()
