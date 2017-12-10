n=int(input())
x=[]
if n>=0:
    for i in range(n):
        z=input()
        z = z.strip()
        if z not in x:
            x.append(z)
    r=input()
    r = r.strip()
    c=0
    for i in range(len(x)):
        if (r==x[i]):
            c+=1
    if c!=0:
        print(x)
        print('Found')
    else:
        print(x)
        print('Not found')
else:
    print('Invalid Input')
