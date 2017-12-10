str=input("Enter a string ")
s=0
for i in range(len(str)):
    c=str[i]
    for j in range(len(str)):
        c1=str[j]
        if(c==c1):
            s+=1
    print("Frequency of",c,"is :",s)
    s=0
    
