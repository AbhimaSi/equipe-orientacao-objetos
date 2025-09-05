// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import java.util.ArrayList;

public final class Tecnico extends Contratado implements SalBonus {

    private ArrayList<String> certificados;
    private ArrayList<String> premios;
    private double salExtra;

    public Tecnico() {
        certificados = new ArrayList<String>();
        premios = new ArrayList<String>();
        salExtra = 0;
    }

    // Construtor Sobrecarregado
    public Tecnico(ArrayList<String> certificados, ArrayList<String> premios) {
        this.certificados = certificados;
        this.premios = premios;
    }

    // Método Sobrescrito
    public void calcPremio(double premio, int numMembros) {
        // Reparticao do premio a+6:b+1:c
        double valRep = (premio / (numMembros + 7)) * 2;
        setSalExtra(valRep);

    }

    public ArrayList<String> getCertificados() {
        return this.certificados;
    }

    public ArrayList<String> getPremios() {
        return this.premios;
    }

    public double getSalExtra() {
        return this.salExtra;
    }

    public void setCertificados(ArrayList<String> certificados) {
        this.certificados = certificados;
    }

    public void setPremios(ArrayList<String> premios) {
        this.premios = premios;
    }

    public void setSalExtra(double salExtra) {
        this.salExtra = salExtra;
    }

}
