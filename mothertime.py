x=int(input())
y=int(input())
z=int(input())
a=int(input())
b=int(input())
c=int(input())
h=int(input())
m=int(input())
sum=x+y+z+a+b+c
m1=h*60
s1=m+m1
t=s1-sum
hour=t//60
min=t%60
print(hour,":",min)
