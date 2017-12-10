str=input("Enter the string ")
s1=str.lower()
c=s1[0]
s=""
for i in range(1,len(s1)):
    ch=s1[i]
    if(ch==c):
        c="$"
    else:
        c=s1[i]
    s=s+c
print(str[0]+s)
