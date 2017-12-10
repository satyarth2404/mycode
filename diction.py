n=int(input())
D={}
for i in range(0,n):
    st=input()
    D[st]=int(input())
print(D)
a=list(D.keys())
r=input()
for i in range(0,len(a)):
    st1=a[i]
    b=st1.split()
    if (b[0]==r or b[1]==r):
        print(st1,D.get(st1))
