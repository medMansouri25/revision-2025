
#Programme qui devine un nombre entre 1 et 100
#les import
import random
#variable
nombre = 0
radom = random.bytes(1, 100)
print(radom)
#fonction qui devine le nombre
def deviner(nombre,random):
    while True :
        try: 
            nombre = int(input("Merci de rentrer un nombre entre 1 et 100: "))
            if nombre < random :
                print("C'est plus grand")
            if nombre > random :
                print("C'est plus petit")
            elif nombre == random :
                print("bravo")
                break
        except ValueError:
            print("Veuillez rentrer un nombre")
#Affichage
deviner(nombre,radom)