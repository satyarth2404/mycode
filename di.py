from pprint import pprint
seq=input()
neq=input()
D={}
for i in range(len(seq)):
    D[seq[i]]=neq[i]
del D['=']
del D['*']
pprint(D)



        
