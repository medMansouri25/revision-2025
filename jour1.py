#Programme qui calcule périmétre l'aire
#varible
longueur=0.0
largeur=0.0
#saisie des valeurs
longueur=float(input("Merci de rentrer la valeur de la longueur:"))
largeur=float(input("Merci de rentrer la valeur de largeur:"))

#foction calcule l'aire
def aire (longueur,largeur):
    return longueur*largeur

#fonction calcule le périmétre
def perimetre(longueur,largeur):
    return 2*(largeur+longueur)

#affichage
if longueur>0 and largeur>0:
    print("L'aire est de:",aire(longueur,largeur))
    print("Le périmétre est de:",perimetre(longueur,largeur))
    
else:
    print("Veuillez rentrer des valeurs positives")