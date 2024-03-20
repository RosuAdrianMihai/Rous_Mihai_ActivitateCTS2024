package model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements  AbstractReteta {
    private String numeMedicament;
    private Map<String, Double> compozitieMedicament;
    private Double gramajMedicament;

    private Reteta() {
    }

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramajMedicament) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;

        Double sumaGramajCompozitie = 0.0;
        for(Double gramaj : this.compozitieMedicament.values()){
            sumaGramajCompozitie += gramaj;
        };

        if(sumaGramajCompozitie != gramajMedicament){
            throw new RuntimeException("Gramaj invalid");
        }
    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta retetaClonata = new Reteta();
        retetaClonata.numeMedicament = this.numeMedicament;
        retetaClonata.compozitieMedicament = new HashMap<>();
        for(String cheie: this.compozitieMedicament.keySet()){
            retetaClonata.compozitieMedicament.put(cheie, this.compozitieMedicament.get(cheie));
        }

        retetaClonata.gramajMedicament = this.gramajMedicament;
        return retetaClonata;
    }
}
