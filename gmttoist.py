gday=input()
ghr=int(input())
gmin=int(input())
gtmin=(ghr*60)+gmin
t=gtmin+330
q=t//60
r=t%60
days=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
if(q>=24):
    if(gday==days[6]):
        print(days[0])
    else:
        for i in range(len(days)):
            if days[i]==gday:
                print(days[i+1])
    o=q-24
    print(o)
    print(r)
else:
    print(q)
    print(r)

    
    
