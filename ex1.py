son=set()
daug=set()
nson=int(input())
for i in range(nson):
    item=input()
    son=son|{item}
ndaug=int(input())
for i in range(ndaug):
    item=input()
    daug=daug|{item}
print("Items common in both list :",son&daug)
print("Items only by his son :",son-daug)
print("Items only by his daughter :",daug-son)

