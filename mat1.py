m=int(input())
n=int(input())
matrix=[[int(input())for i in range(m)]for j in range(n)]
for i in range(0,m):
    for j in range(0,n):
        print(matrix[i][j],end='\t')
    print()
s=0
s1=0
matrix1=[]
for i in range(0,m):
    for j in range(0,n):
        s=s+matrix[i][j]
        s1=s1+matrix[j][i]
        if j==n-1:
            a=[s,s1]
            matrix1.append(a)
    a=[]
    s=0
    s1=0
for i in range(0,m):
    for j in range(0,2):
        print(matrix1[i][j])
print(matrix1)

            

