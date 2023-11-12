import java.math.BigDecimal;

enum Operazione {
    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZIONE("*"),
    DIVISIONE("/"),
    MIN("min"),
    MAX("max");

    private String simbolo;

    Operazione(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}

public class Start {

    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("10.5");
        BigDecimal numero2 = new BigDecimal("5.2");

        OperazioniAritmetiche calcolatore = new OperazioniAritmetiche();
        calcolatore.eseguiOperazioni(numero1, numero2);
    }
}