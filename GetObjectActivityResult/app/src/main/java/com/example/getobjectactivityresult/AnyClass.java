package com.example.getobjectactivityresult;

public class AnyClass {

    private Integer      cont_id   = 0;
    private Integer      caucie_id   = 0;
    private String   observation = "";



    public AnyClass() {

    }

    public AnyClass(Integer cont_id, Integer caucie_id, String observation) {
        this.cont_id = cont_id;
        this.caucie_id = caucie_id;
        this.observation = observation;
    }

    public int getCont_id() {
        return cont_id;
    }


    public int getCaucie_id() {
        return caucie_id;
    }

    public String getObservation() {
        return observation;
    }


}
