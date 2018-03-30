# Maze
Proiect realizat in Java ce rezolva un mic labirint.

CityMap:

In CityMap citesc din fisier matricea: citim primele 2 valori si le salvam ca fiind numarul de linii si coloane
apoi trecem pe urmatorul rand si continuam sa citim randurile ca Stringuri. Imparitm String-ul intr-o serie
de char-uri si continuam sa le adaugam in matricea noastra. Intoarcem matricea completa cu X,  , R si J.

Ulterior, avem nevoie de pozitia caracterelor pentru a putea calcula distantele de la ei la celelalte puncte din
matrice. Parcurgem matricea si cand gasim R, respectiv J, intoarcem o variabiala de tip Character --->

Character:

In aceasta clasa avem coordonate i si j pentru caracterul respectiv si setteri si getteri pentru a le putea accesa;

QueueRJ:

Reprezinta un set de date: coorodnatele i si j ale unui caracter. Ulterior, vom introduce cate un set de date de
acest tip intr-o lista inlantuita ce urmeaza regula unei cozi: FIFO. 

FindingRJ:

Metoda roadFromRtoJ reprezinta o adaptare a algoritmului lui Lee. Primeste ca parametrii harta si coordonatele
caracterului. Stiind coordonatele acestuia, pornim din jurul lui catre toti vecinii lui vizitabili (sa existe in 
matrice, sa fie nevizitati <sa nu fie trecuti de 2 ori in acea lista inlantuita> si caracterele noastre sa poate trece
prin acea parte din matrice, elementul sa fie egal cu ' '). Dupa ce am verificat "vizitabilitatea" lor, ii adaugam in
Lista pentru a studia "vizibilitatea" vecinilor lor, astfel vom trece prin toate elementele matricii. Vom repeta 
algoritmul pana cand lista noastra va fii goala, pentru ca noi extragem din lista elemente pentru a le afla vecinii
vizitabili. De fiecare data cand ne indepartam de punctul caracterului, se mareste distanta de la el pana in punctul
in care ne aflam; aceste costurisunt salvate in matricea de cost pe care o returnam.

Game:

In aceasta clasa se alfa main-ul. Alegem un minim care este inital egal cu cea mai mare valoare atribuita unui int. Aflam 
coordoantele celor doua caractere pentru a le putea calcula matricea de cost. Dupa ce am aflat-o, aflam care e cel mai
mic numar egal de pasi pe care il pot face amandoi, acesta este nou nostru minim. Parcurgem din nou matricea de cost a
celor doua caractere pentru a afla de data aceasta punctul de intalnire. Cum stim deja numarul de pasi, cand gasim locul
in care matricea de cost este egala cu minimul, retinem pozitia locului. In cele din urma, scrim in fisier numarul de pasi
facuti de cei doi si locurile in care s-ar putea intalni.
