import math
a=(int(input()),int(input()))
b=(int(input()),int(input()))
a1=list(a)
b1=list(b)
if (a1[0]==b1[0]):
    a2=[(abs(b[1]-a[1])+a1[0]),a1[1]]
    b2=[(abs(b[1]-a[1])+b1[0]),b1[1]]
else:
    a2=[a1[0],(abs(b[0]-a[0])+a1[1])]
    b2=[b1[0],(abs(b[0]-a[0])+b1[1])]
x=tuple(a2)
y=tuple(b2)
print(x)
print(y)
l=math.sqrt(((a1[0]-b2[0])**2)+(a1[1]-b2[1])**2)
print(round(l,2))
