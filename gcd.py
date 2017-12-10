def gcd(x, y):
    if x > y:
        s = y
    else:
        s = x
    for i in range(1, s+1):
        if x % i == 0 and y % i == 0:
            z = i
    return z
n = int(input())
q = []
for i in range(n):
    q.append(int(input()))
l = q[0]
u = q[1:]
m = []
u.sort() 
f = []
for i in u:
    m.append(gcd(l, i))
o = []
for i in range(len(m)):
    p = min(m)
    f.append(m.index(p))
    m[m.index(p)] = 100000
for i in f:
    o.append(u[i])
o = tuple(o)
print(l)
for c in o:
    print(c)
    
