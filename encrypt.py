st=input()
p=int(input())
s=""
for i in range(0,len(st)):
    ch=ord(st[i])
    if(st[i].islower()):
        if((ch+p)>122):
            ch2=((ch+p)-122)+96
            s2=chr(ch2)
            s=s+s2
    else:
        if((ch+p)>90):
            ch1=((ch1+p)-90)+64
            s1=chr(ch1)
            s=s+s1
        else:
            ch3=ch+p
            s3=chr(ch3)
            s=s+s3
print(s)
