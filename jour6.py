#tri par insertion
#definition tri par insertion
def tri_insertion(tab):
    n = len(tab)
    for i in range(1, n):
        valeur = tab[i]
        j = i - 1
        while j >= 0 and tab[j] > valeur:
            tab[j + 1] = tab[j]
            j = j - 1
            tab[j + 1] = valeur
    return tab
        