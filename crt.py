m=int(input())
n=int(input())
matrix=[[int(input())for i in range(m)]for j in range(n)]
c=[]
t=0
s1=0
s2=0
max=0
for i in range(m):
    for j in range(n):
        a=matrix[i][j]
        for k in range(m):
            for l in range(n):
                if (matrix[k][l]==a):
                    c.append((k,l))
        for e in range(len(c)-1):
            if (c[e][1]==c[e+1][0]):
                t+=1
        if (t==len(c)-1 and len(c)>max):
                max=len(c)
                s1=a
                s2=c
        c=[]
        t=0
print(s1,end=' ')
s3=""
s3=s3+str(s2[0][0])+"-"
for i in range(len(s2)-1):
    if((i%2)==0):
        s3=s3+str(s2[i][1])+"-"
    else:
        s3=s3+str(s2[i][1])+"-"
s3=s3+str(s2[len(c)-1][1])
print(s3,end=' ')
        
        
