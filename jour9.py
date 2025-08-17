#PGCD version récursive
#les variable
a= int(input("Entrez le premier nombre : "))
b= int(input("Entrez le deuxième nombre : "))
#la fonction
def pgcd(a, b):
    if b==0:
        return a
    else:
        return pgcd(b,a % b)
#affichage
print(pgcd(a,b))