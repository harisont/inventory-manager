## Testo dell'esercizio
Scrivere una app che gestisce un negozio (scegliere la tipologia di prodotti), più in particolare i prodotti venduti nel negozio.
La app utilizza un database SQLite tramite l'interfaccia Room in cui sono memorizzati i dati dei prodotti:
- codice identificativo
- nome 
- descrizione
- prezzo
- quantità presente nel negozio

L'utente (gestore del negozio) puo' svolgere le seguenti operazioni:
1. inserire un nuovo prodotto
2. caricare i dati di una fattura da parte del fornitore: per ogni prodotto arrivato (da scegliere mediante una listview) indicare la quantità in più
3. caricare i dati di una vendita: per ogni prodotto venduto (da scegliere mediante una listview) indicare la quantità venduta
4. visualizzare l'inventario del negozio, cioè i prodotti esistenti con le quantità (da decidere se visualizzare anche i prodotti non più disponibili).
inventory-manager
