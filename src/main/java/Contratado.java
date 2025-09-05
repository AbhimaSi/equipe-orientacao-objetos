// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class Contratado {

    private String nome;
    private int idade,
            cpf;
    private String setor,
            cargo;
    private double salario;
    private String dataContrat;

    //Construtor Default
    public Contratado() {
        nome = "";
        idade = 0;
        cpf = 0;
        setor = "";
        cargo = "";
        salario = 0;
        dataContrat = "";
    }

    //Construtor Sobrecarregado
    public Contratado(String nome, int idade, int cpf, String setor, String cargo, double salario, String dataContrat) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.dataContrat = dataContrat;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getSetor() {
        return this.setor;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getDataContrat() {
        return this.dataContrat;
    }

    public void setNome(String nome) throws StringGrdException, StringVaziaException {
        if (nome.length() <= 25) {
            if (nome != "") {
                this.nome = nome;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setIdade(int idade) throws IdadePeqException {
        if (idade >= 18) {
            this.idade = idade;
        } else {
            throw new IdadePeqException();
        }
    }

    public void setCpf(int cpf) throws CpfPeqException, CpfGrdException {
        if (cpf > 0) {
            if (cpf <= 999999999) {
                this.cpf = cpf;
            } else {
                throw new CpfGrdException();
            }
        } else {
            throw new CpfPeqException();
        }
    }

    public void setSetor(String setor) throws StringGrdException, StringVaziaException {
        if (setor.length() <= 25) {
            if (setor != "") {
                this.setor = setor;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setCargo(String cargo) throws StringGrdException, StringVaziaException {
        if (cargo.length() <= 25) {
            if (cargo != "") {
                this.cargo = cargo;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setSalario(double salario) throws SalPeqException {
        if (salario >= 1400d) {
            this.salario = salario;
        } else {
            throw new SalPeqException();
        }
    }

    public void setDataContrat(String dataContrat) throws StringGrdException, StringVaziaException {
        if (dataContrat.length() <= 25) {
            if (dataContrat != "") {
                this.dataContrat = dataContrat;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }
}
