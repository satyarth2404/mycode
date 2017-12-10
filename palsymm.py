n=int(input())
pal=0
sym=0
def symm(s):
    sym=0
    if ((len(s)%2)!=0):
        n=(len(s)//2)+1
        fh=s[:n]
        lh=s[n:]
    else:
        n=(len(s)//2)
        fh=s[:n]
        lh=s[n:]
    if fh.lower()==lh.lower():
        sym=1
    return sym
def palin(s):
    p=0
    if((len(s)%2)!=0):
        n=(len(s)//2)+1
        fh=s[:n-1]
        lh1=s[n:]
        lh=lh1[::-1]
    else:
        n=(len(s)//2)
        fh=s[:n]
        lh1=s[n:]
        lh=lh1[::-1]
    if fh.lower()==lh.lower():
        p=1
    return p
arr=[]

for i in range(n):
    ar=input()
    sym=symm(ar)
    pal=palin(ar)
    if (pal==1 and sym==1):
        arr.append("Both property")
    elif (pal==1 and sym==0):
        arr.append("Palindrome")
    elif (sym==1 and pal==0):
        arr.append("Symmetric")
    else:
        arr.append("No property")
for i in arr:
    print(i)

    
