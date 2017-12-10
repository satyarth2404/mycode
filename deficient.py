n=int(input())
s=0
for i in range(2,n):
    if ((n%i)==0):
        s=s+i
if s<n:
    print("Deficient number")
else:
    print("Not Deficient")
    
