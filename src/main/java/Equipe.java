// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class Equipe {

    private String pais,
                    estado,
                    esporte,
                    nomeClube;
    private double patrimonio;
    private String dataCriacao;

    public Equipe() {
        pais = "";
        estado = "";
        esporte = "";
        nomeClube = "";
        patrimonio = 0;
        dataCriacao = "";
    }

    // Construtor Sobrecarregado1
    public Equipe(String pais, String estado, String esporte, String nomeClube, double patrimonio, String dataCriacao) {
        this.pais = pais;
        this.estado = estado;
        this.esporte = esporte;
        this.nomeClube = nomeClube;
        this.patrimonio = patrimonio;
        this.dataCriacao = dataCriacao;
    }

    public String getPais() {
        return this.pais;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getEsporte() {
        return this.esporte;
    }

    public String getNomeClube() {
        return this.nomeClube;
    }

    public double getPatrimonio() {
        return this.patrimonio;
    }

    public String getDataCriacao(){
        return dataCriacao;
    }
    
    public void setPais(String pais) throws StringGrdException, StringVaziaException {
        if (pais.length() <= 25) {
            if (pais != "") {
                this.pais = pais;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setEstado(String estado) throws StringGrdException, StringVaziaException {
        if (estado.length() <= 25) {
            if (estado != "") {
                this.estado = estado;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setEsporte(String esporte) throws StringGrdException, StringVaziaException {
        if (esporte.length() <= 25) {
            if (esporte != "") {
                this.esporte = esporte;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setNomeClube(String nomeClube) throws StringGrdException, StringVaziaException {
        if (nomeClube.length() <= 25) {
            if (nomeClube != "") {
                this.nomeClube = nomeClube;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }

    }

    public void setPatrimonio(double patrimonio) throws ValPeqException {
        if (patrimonio >= 0) {
            this.patrimonio = patrimonio;
        } else {
            throw new ValPeqException();
        }
    }
    
    public void setDataCriacao(String dataCriacao) throws StringGrdException, StringVaziaException {
        if (dataCriacao.length() <= 25) {
            if (dataCriacao.length() > 0) {
                this.dataCriacao = dataCriacao;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }
    
}