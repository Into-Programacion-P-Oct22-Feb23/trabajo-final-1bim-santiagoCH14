numero_grupo=1
parejas=1
s1="s1="
while numero_grupo <= 4:
    while parejas <= 2:
        if parejas %2==0:
            s1=s1+str(numero_grupo*11)
            s1=s1+"+"
        else:
            s1=s1+str(numero_grupo*12)
            s1=s1+"-"
        parejas=parejas+1
    parejas=1
    numero_grupo=numero_grupo+1
print(s1)
