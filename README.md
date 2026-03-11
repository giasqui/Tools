# SmartScan Pro 🚀

**SmartScan Pro** è un'utilità Java progettata per automatizzare l'acquisizione di documenti digitali, eBook o gallerie fotografiche direttamente dallo schermo, convertendoli istantaneamente in un file **Microsoft Word (.docx)** ottimizzato per il riconoscimento ottico dei caratteri (**OCR**).

## 🛠 Funzionalità Principali

- **Selezione Area Dinamica**: Definisci con precisione l'area dello schermo da catturare tramite un overlay grafico intuitivo.
- **Automazione Click**: Imposta un punto di click automatico per gestire il cambio pagina (es. per lettori eBook o PDF).
- **Gestione Margini in CM**: Configura i margini del documento Word direttamente in centimetri (Top, Bottom, Left, Right) tramite la UI.
- **Ottimizzazione OCR**: Inserimento delle immagini con rapporto 1:1 (pixel-to-EMU) e scaling proporzionale di sicurezza per evitare distorsioni che potrebbero compromettere il riconoscimento del testo in Adobe Acrobat o altri software.
- **Interfaccia Organizzata**: GUI suddivisa in sezioni logiche (Configurazione, Area, Click, Margini) per un flusso di lavoro rapido.

## 📋 Requisiti

- **Java JDK**: 8 o superiore.
- **Librerie**: Apache POI (per la gestione dei file .docx).
- **Sistema Operativo**: Windows (testato), macOS o Linux (richiede permessi per l'acquisizione dello schermo e il controllo del mouse).

## 🚀 Come si usa

1. **Configurazione File**: Scegli la cartella di destinazione e il nome del file. Imposta il numero di pagine totali da scansionare.
2. **Selezione Area**: Clicca su "Cattura Area" e trascina il mouse per inquadrare la zona del documento.
3. **Punto Click**: Clicca su "Rileva Punto" e seleziona il tasto "Avanti" del software che stai scansionando.
4. **Margini**: Inserisci i margini desiderati in cm (default 0 per massimizzare l'area).
5. **Avvio**: Clicca su "AVVIA SCANSIONE". Avrai 5 secondi di tempo per posizionarti sulla finestra corretta prima che il processo inizi.

## 🏗 Struttura Progetto

```text
smart-scan-pro/
├── src/
│   ├── it/giasqui/
│   │   ├── SmartScanGUI.java    # Interfaccia e logica principale
│   │   └── timestamp/           # Utility per la gestione del tempo
├── lib/                         # Librerie Apache POI (se non si usa Maven)
└── README.md