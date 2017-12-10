r=int(input())
c=int(input())
matrix=[[int(input())for i in range(r)]for j in range(c)]
c2=0
c1=0
for i in range(0,r-1):
    for j in range(0,c-1):
        if(matrix[i][j]==0):
            c2+=1
        else:
            c1+=1
if c2>=c1:
    print('Sparse')
else:
    print('Not Sparse')
