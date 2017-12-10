r=int(input())
c=int(input())
matrix1=[[0 for i in range(r)]for j in range(c)]
matrix=[[int(input()) for i in range(r)]for j in range(c)]
for i in range(0,r):
    t=c-1
    for j in range(0,c):
        matrix1[i][t]=matrix[i][j]
        t=t-1
for i in range(0,r):
    for j in range(0,c):
        print(matrix[i][j],end='')
    print()
print("Mirror Matrix")
for i in range(0,r):
    for j in range(0,c):
        print(matrix1[i][j],end='')
    print()
