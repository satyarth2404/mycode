a=int(input())
sq=(a**2)
s=0
while a/10!=0:
    m=a%10
    s=s+m
    a=a//10
print(s)
