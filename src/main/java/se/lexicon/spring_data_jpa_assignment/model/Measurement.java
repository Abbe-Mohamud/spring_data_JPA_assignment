package se.lexicon.spring_data_jpa_assignment.model;

public enum Measurement {

    TSP(5),
    G(1),
    HG(100),
    KG(1000),
    ML(1),
    CL(10);



    private final int value;

    Measurement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



}
