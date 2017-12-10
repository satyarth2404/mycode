a=int(input("Enter "))
b=int(input("Enter "))
while b:
    t=b
    b=a%t
    a=t
if(a==1):
    print("Coprime numbers")
else:
    print("Not coprime")
