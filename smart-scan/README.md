# SmartScan Pro 🚀

**SmartScan Pro** è un'utilità Java progettata per automatizzare l'acquisizione di documenti digitali, eBook o gallerie fotografiche direttamente dallo schermo, convertendoli istantaneamente in un file **Microsoft Word (.docx)** ottimizzato per il riconoscimento ottico dei caratteri (**OCR**).

---

## 🛠 Funzionalità Principali

* **Selezione Area Dinamica**: Definisci con precisione l'area dello schermo da catturare tramite un overlay grafico.
* **Automazione Click**: Imposta un punto di click automatico per gestire il cambio pagina automatico.
* **Gestione Margini in CM**: Configura i margini del documento Word direttamente in centimetri.
* **Ottimizzazione OCR**: Rapporto 1:1 e scaling proporzionale per evitare distorsioni dei caratteri.

---

## 🚀 Compilazione ed Esecuzione

### Opzione A: Tramite Maven (Consigliata)
Questa modalità scarica automaticamente le librerie necessarie (Apache POI).

1.  **Compilazione**: 
    Apri il terminale nella cartella `smart-scan` e digita:
    ```bash
    mvn clean package
    ```
2.  **Esecuzione**:
    Dopo la compilazione, troverai il file nella cartella `target`. Eseguilo con:
    ```bash
    java -jar target/smart-scan-pro-1.9.jar
    ```

### Opzione B: Tramite IDE (Eclipse/IntelliJ)
1.  Importa il progetto come **"Existing Maven Project"**.
2.  Fai clic destro sulla classe `SmartScanGUI.java`.
3.  Seleziona **Run As** > **Java Application**.

---

## 📋 Requisiti Tecnici

* **Java JDK**: 8 o superiore.
* **Dipendenze**: Apache POI 5.2.3 (gestite tramite il file `pom.xml`).

---

## 🏗 Struttura del Repository (Tools)

Il progetto è ospitato all'interno del repository collettivo `Tools`:

```text
Tools/
├── .gitignore           # Esclude file temporanei e .metadata
└── smart-scan/          # Root del progetto SmartScan Pro
    ├── src/             # Codice sorgente Java
    ├── pom.xml          # Configurazione Maven e dipendenze
    └── README.md        # Questa guida

```
    
---

## 🔧 Risoluzione Problemi

* **Errore Classpath**: Se l'IDE segnala librerie mancanti (es. `lowagie`), esegui un "Maven Update Project" (Alt+F5 in Eclipse).
* **Permessi**: Su sistemi moderni è necessario eseguire l'IDE come Amministratore per permettere al `Robot` di catturare lo schermo.
* **Coordinate**: Non ridimensionare la finestra del documento dopo aver preso le coordinate dell'area.

---
*Sviluppato per semplificare la digitalizzazione dei documenti.*