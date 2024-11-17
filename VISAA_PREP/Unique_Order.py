k = int(input())
a = list(map(int, input().split()))
u_e = []
for i in a:
    if i not in u_e:
        u_e.append(i)
print(*u_e)
