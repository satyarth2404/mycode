from pprint import pprint
num=int(input())
D={}
for i in range(num):
    st=input()
    D[st]=[int(input()),int(input())]
m=int(input())
s1=0
for i in range(m):
    r=input()
    s=int(input())

    if s<=D[r][0]:
        D[r][0]=D[r][0]-s
        s1=s1+(D[r][1])*s
print(s1)
pprint(D)
