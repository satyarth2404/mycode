import math
x=int(input())
y=int(input())
s=int(input())
e=int(input())
diff=12+(e-s)
d=(diff/y)+1
days=x/d
print(math.ceil(days))
