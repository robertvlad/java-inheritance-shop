# java-inheritance-shop

## Todo
Creare la classe `Prodotto` che gestisce i *prodotti dello shop*. 

Un `prodotto` è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva

Usate opportunamente i livelli di accesso (`public`, `protected`, `private`), i *costruttori*, i *metodi getter e setter* ed eventuali altri metodi di “utilità” per fare in modo che:
- il *codice prodotto* sia accessibile *solo in lettura*
- *gli altri attributi* siano accessibili *sia in lettura che in scrittura*
- *il prodotto* esponga sia un metodo *per avere il prezzo base* che uno *per avere il prezzo comprensivo di iva formattato*

Il negozio gestisce diversi tipi di `prodotto`: 
- `Smarphone`, caratterizzati anche dal *codice IMEI e dalla quantità di memoria*
- `Televisori`, caratterizzati dalle *dimensioni e dalla proprietà di essere smart oppure no*
- `Cuffie`, caratterizzate dal *colore e se sono wireless o cablate*

Utilizzate l’*ereditarietà* per riutilizzare il codice di `Prodotto` nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

Generare classe `Shop` a parte, dove inserire il `main` e testare le varie componenti del progetto.

### N.B.:
Generare inoltre il metodo `toString` (*sensato*) per tutte le classi.

### BONUS
Create una classe `Catalogo` aggiuntiva con un altro metodo `main`, in cui chiedete all’utente di valorizzare un catalogo di prodotti con dati inseriti tramite `Scanner`. 

Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno `Smarphone` o un `Televisore` o `Cuffie` e in base alla scelta dell’utente utilizzate il *costruttore opportuno*.

Al termine dell’inserimento stampate il *catalogo* (fate l’`override` del metodo `toString` per restituire le informazioni da stampare per ogni classe).
