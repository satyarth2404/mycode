a=int(input())
b=int(input())
sa=0
sb=0
for i in range(1,a):
    if(a%i==0):
        sa=sa+i
for i in range(1,b):
    if(b%i==0):
        sb=sb+i
if(sa==b and sb==a):
    print("Amicable")
else:
    print("Not Amicable")
print(sa)
print(sb)

