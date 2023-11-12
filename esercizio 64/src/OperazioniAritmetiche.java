import java.math.BigDecimal;

public class OperazioniAritmetiche {

    public void eseguiOperazioni(BigDecimal num1, BigDecimal num2) {
        for (Operazione operazione : Operazione.values()) {
            BigDecimal risultato = calcolaOperazione(operazione, num1, num2);
            stampaRisultato(operazione, num1, num2, risultato);
        }
    }

    private BigDecimal calcolaOperazione(Operazione operazione, BigDecimal num1, BigDecimal num2) {
        switch (operazione) {
            case ADDIZIONE:
                return num1.add(num2);
            case SOTTRAZIONE:
                return num1.subtract(num2);
            case MOLTIPLICAZIONE:
                return num1.multiply(num2);
            case DIVISIONE:
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    System.out.println("Errore: divisione per zero");
                    return null;
                }
                return num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);
            case MIN:
                return num1.min(num2);
            case MAX:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Operazione non supportata: " + operazione);
        }
    }

    private void stampaRisultato(Operazione operazione, BigDecimal num1, BigDecimal num2, BigDecimal risultato) {
        System.out.println("Operazione: " + operazione.getSimbolo());
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Risultato: " + risultato);
        System.out.println();
    }
}