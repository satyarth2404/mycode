import sys
sys.argv[0]
arguments=sys.argv[1:]
count=len(arguments)
for x in range(1,len(sys.argv)):
    print("Argument:",sys.argv[x])
print(len(sys.argv))
if ((len(sys.argv))!=2):
    print("Usage:python cla.py")
    sys.exit(1)
