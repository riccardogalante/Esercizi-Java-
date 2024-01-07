class CarattereUnicode {
    private String inputString;

    // Costruttore che accetta una stringa e un indice
    public CarattereUnicode(String inputString) {
        this.inputString = inputString;
    }

    // Metodo per ottenere il carattere Unicode in un indice specifico
    public String ottieniCarattereUnicode(int indice) {
        StringBuilder risultato = new StringBuilder();

        // Verifica che l'indice sia valido
        if (indice >= 0 && indice < inputString.length()) {
            char carattere = inputString.charAt(indice);
            risultato.append("Il carattere Unicode all'indice ").append(indice).append(" è: ").append((int) carattere);
        } else {
            risultato.append("Errore: Indice non valido");
        }

        return risultato.toString();
    }
}