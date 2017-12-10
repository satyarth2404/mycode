s=[]
while True:
    n=input()
    n=n.strip()
    if (n=='Stop'):
        break
    else:
        s.append(n)
l=len(s)
print(l)
max=0
for i in range(l):
    c=s[i]
    l1=len(c)
    if (l1>max):
        max=l1
        t=i 
print(s[t])
print(max)
