num=int(input("Enter the number "))
sum=0
num1=num
nums=str(num)
i=len(nums)
c=1
while (c<=i):
        m=num%10
        sum=sum+(m*m*m)
        num=num//10
        c+=1

if num1==sum :
    print("Armstrong number")
else :
    print("Not an Armstrong number")
    
