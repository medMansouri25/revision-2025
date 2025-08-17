#maximum d'une liste

#Varible
liste=input("Entrez une liste de nombres séparés par des espaces: ").strip().split()
#vérification de la cliste
if liste==[]:
    print("Veuillez entrer une liste non vide.")
    exit()
else:
    liste = [float(i) for i in liste]
    #pour visualiser le fait que strip efface les virgule inutiles
    print("La liste est:", liste)
    
#Fonction qui calcule le maximum
def maximum(liste):
    max=liste[0]
    for i in liste:
        if i > max:
            max = i
    return max
#Affichage
print("Le maximum de la liste est:", maximum(liste))

    