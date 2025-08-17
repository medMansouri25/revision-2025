#construire une liste à partir d'une autre avec compréhension de la liste 
#variables
liste=input("entrer le site de nombre : ").strip().split()
liste = [int(x) for x in liste]   # conversion en entiers

# fonction
def rech_nb_pair(liste):
    pair = [x for x in liste if x % 2 == 0]   # comprehension de liste
    print("La liste de nombres pairs est :", pair)

    
#affichage
rech_nb_pair(liste)