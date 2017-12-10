n=int(input("Enter a number "))
num=n
c=0
while(n!=0 and (n%10)!=0):
    m=n%10
    if((num%m)==0):
        print(m)
        c=c+1
    n=n//10
if(c==0):
    print("No factors")
    
    

    
        
