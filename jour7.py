#recherche dichotomique
#fonction recherche dichotomique
def rech_dicho(liste):
    debut=0
    fin=len(liste)-1
    while debut<=fin:
        milieu=(debut+fin)//2
        if liste[milieu]==cible:
            return milieu
        elif liste[milieu]<cible:
            debut=milieu+1
        else:
            fin=milieu-1
    return -1

#test de la fonction
liste=input("entrer liste souhaité : ").strip().split()
cible=input("entrer cible souhaité : ").strip()
print(rech_dicho(liste))
            