// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public final class Presidente extends Contratado implements SalBonus {

    private String tipoEleicao;
    private int numMandato;
    private double salExtra;

    public Presidente() {
        tipoEleicao = "";
        numMandato = 0;
        salExtra = 0;
    }

    // Construtor Sobrecarregado
    public Presidente(String tipoEleicao, int numMandato) {
        this.tipoEleicao = tipoEleicao;
        this.numMandato = numMandato;
    }

    // Método Sobrescrito
    public void calcPremio(double premio, int numMembros) {
        // Reparticao do premio a+6:b+1:c
        double valRep = (premio / (numMembros + 7)) * 1;
        setSalExtra(valRep);
    }

    public String getTipoEleicao() {
        return this.tipoEleicao;
    }

    public int getNumMandato() {
        return this.numMandato;
    }

    public double getSalExtra() {
        return this.salExtra;
    }

    public void setTipoEleicao(String tipoEleicao) throws EntradaIncorretaException {
        if (tipoEleicao.equalsIgnoreCase("Direta") || tipoEleicao.equalsIgnoreCase("Indireta")) {
            this.tipoEleicao = tipoEleicao;
        } else {
            throw new EntradaIncorretaException();
        }
    }

    public void setNumMandato(int numMandato) throws ValPeqException {
        if (numMandato > 0) {
            this.numMandato = numMandato;
        } else {
            throw new ValPeqException();
        }
    }

    public void setSalExtra(double salExtra) {
        this.salExtra = salExtra;
    }

}
