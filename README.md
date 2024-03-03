**dans l'exercice 01 ,il ya une erreur dans l'instruction j++ et i-- , telque la correction de ses instrucions est  : j-- ,i++.
**dans l'exercice 02 le problem est le depacement de l'indexe du tableau count[],donc la correction constituer de supprimer l'egalite dans la condtion de boucle  
for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a' ]++;
            count[s2.charAt(i) - 'a' ]--;
        }
*

