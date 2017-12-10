n=int(input())
D={}
a=[]
for i in range(n):
    st=input()
    n1=int(input())
    for j in range(n1):
        a.append(input())
    D[st]=a
b=list(D.values())
max=0
for i in range(0,len(b)):
    c1=set(b[i])
    for j in range(0,len(b)):
        if(i==j):
            continue
        else:
            c2=set(b[j])
            c=c1&c2
            if (len(c)>max):
                max=len(c)
                s1=c
print(s1)
