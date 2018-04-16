mvn install jacoco:report
# Projet DevOps

## TODO :
* javadoc
* tests unitaire
* Code Coverage


## Fonctionnalités

Cette bibliothèque permet de créer un Dataframe, sorte de tableau en deux dimensions capable d'accueillir des colonnes labelisées de type variable

Exemple:

|     | Col1 | ColB | Col3 |
|:---:|:----:|:----:|:----:|
| 1   | 1.0  |1521  |"A"   |
| 2   | 1.1  |248   |"Jeu" |
| 3   | 6.8  |698   |"Dev" |
| 4   | 4.1  |4564  |"Ops" |
| 5   | 0.01 |4888  |"End" |


L'un des constructeur est capable de lire un fichier CSV et le convertir (voir section Import par fichier CSV)

Il est possible d'ajouter une colonne à un Dataframe déjà crée, soit en l'ajoutant a la fin, soit en l'ajoutant a un index prédéfini (passé en paramètre).

On peut afficher des lignes du Dataframe des façons suivantes:
 -  affichage d'une ligne en passant l'index de la ligne
- affichage de l'intégralité du Dataframe
- affichage des x première lignes du Dataframe (5 par défaut)
- affichage des x dernières lignes du Dataframe (5 par défaut)

Il est possible de crée un Dataframe a partir d'un autre, en spécifiant soit les index des lignes que l'on souhaite conserver, soit en spécifiant les labels des colonnes que l'on souhaite conserver.

Pour plus de détails, consulter la javadoc


### Import par fichier CSV
Le fichier CSV requiert un format spécifique pour pouvoir être parsé. La première ligne doit contenir les labels des colonnes et les suivantes les valeurs. Il faut que chaque ligne aie la même longueur et que les valeurs d'une colonne soient du même type.

Exemple :

    "Col1","ColB","Col3"
    1.0,1521,"A"
    1.1,248,"Jeu"
    6.8,698,"Dev"
    4.1,4564,"Ops"
    0.01,4888,"End"


## Choix d'outils
Java 8

Junit 4.12 pour les tests unitaires

Maven pour la compilation et la gestion du projet

Travis CI pour l'intégration continue

## Code coverage et Javadoc

	mvn install
    mvn jacoco:report
    mvn javadoc:javadoc
    mvn javadoc:test-javadoc
    mvn site

## Feedback

Des difficultés d'apprentissage avec Maven, la documentation est parfois difficile à comprendre.

Niveau développement, le code demandé n'est ni trop court, ni trop long, ce qui permet de faire du développement et des tests tout au long du projet sans être surchargé de travail.
