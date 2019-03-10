/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaDuplamenteEncadeada;

/**
 *
 * @author pablo
 */
public class Onibus {
    private String encarrocadeira;
    private String carroceria;
    private String marcaMotor;
    private String modelMotor;
    private int prefixo;
    private Onibus proximoBus;
    private Onibus anteriorBus;

    Onibus(String encarrocadeira, String carroceria, String marcaMotor,String modeloMotor, int prefixo){
        this.encarrocadeira=encarrocadeira;
        this.carroceria=carroceria;
        this.marcaMotor=marcaMotor;
        this.modelMotor=modeloMotor;
        this.prefixo=prefixo;
    }

    public String getEncarrocadeira() {
        return encarrocadeira;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public String getModelMotor() {
        return modelMotor;
    }

    public Onibus getProximoBus() {
        return proximoBus;
    }

    public int getPrefixo(){
        return prefixo;
    }
    public void setProximoBus(Onibus onibus){
        this.proximoBus=onibus;
    }
    public void setAnteriorBus(Onibus onibus){
        this.anteriorBus=onibus;
    }

    public Onibus getAnteriorBus(){
        return anteriorBus;
    }


}
