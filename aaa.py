a = int(input("YEAR: ")
if 1900<=a<=(10**5):
            if (a%4)==0 and (a%400)==0 and (a%100)==0:
                print("Year is leap")
            else:
                print("Year is not leap")
else:
        print("Invalid Input")
