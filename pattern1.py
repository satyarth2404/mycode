n=int(input("length of series "))
i=1
j=1
while i<=n:
    while j<=i:
        print("*",end='')
        j=j+1
    i=i+1
    j=1
    print()
    
