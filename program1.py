n=int(input())
id=[]
ht=[]
for i in range(0,n):
    id.append(int(input()))
    ht.append(int(input()))
for i in range(0,n):
    for j in range(0,n-i-1):
        if ht[j]>ht[j+1]:
            t=ht[j]
            ht[j]=ht[j+1]
            ht[j+1]=t
            t1=id[j]
            id[j]=id[j+1]
            id[j+1]=t1
for i in range(0,n):
    print(id[i])

    
            
