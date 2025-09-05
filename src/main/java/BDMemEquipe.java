// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDMemEquipe {
    private static BDMemEquipe bdMemEquipeUnic;
    private static List<Jogador> bdJog;
    private static List<Presidente> bdPres;
    private static Tecnico bdTec;
    
    private static int numMandatoPres;
    
    private BDMemEquipe(){
        
        bdJog = new ArrayList<Jogador>();
        bdPres = new ArrayList<Presidente>();
        
        bdTec = new Tecnico();
        
        numMandatoPres = 0;
    }
    
    //Singleton
    public static BDMemEquipe getInstancia(){
        if(bdMemEquipeUnic == null){
            bdMemEquipeUnic = new BDMemEquipe();
            return bdMemEquipeUnic;
        }
        return bdMemEquipeUnic;
    }
    
    public List<Jogador> getBdJog(){
        return bdJog;
    }
    
    public Tecnico getBdTec(){
        return bdTec;
    }
    
    public List<Presidente> getBdPres(){
        return bdPres;
    }
    
    public int getNumMembros(){
        int numMembros = 0;
        if(bdPres.size() > 0){
            numMembros++;
        }
        if(bdTec.getCpf() != 0){
            numMembros++;
        }
        numMembros += bdJog.size();
        return numMembros;
    }
    
    public int getNumMandatoPres(){
        return numMandatoPres;
    }
    
    //Gestão de Jogador (métodos sobrecarregados)
    public Jogador consMemCpf(Jogador jogador){
        for(Jogador j: bdJog){
            if(jogador.getCpf() == j.getCpf()){
                return j;
            }
        }
        return null;
    }//fim consMemCpf
    
    public Jogador cadMemCpf(Jogador jogador){
        if(consMemCpf(jogador) == null){
            bdJog.add(jogador);
            return jogador;
        }
        return null;
    }//fim cadMemCpf
    
    public Jogador attMemCpf(Jogador jogador){
        if(consMemCpf(jogador) != null){
            for(int i = 0; i < bdJog.size(); i++){
                if(jogador.getCpf() == bdJog.get(i).getCpf()){
                    bdJog.set(i, jogador);
                    return bdJog.get(i);
                }
            }
        }
        return null;
    }//fim attMemCpf
    
    public Jogador delMemCpf(Jogador jogador){
        if(consMemCpf(jogador) != null){
            for(int i = 0; i < bdJog.size(); i++){
                if(jogador.getCpf() == bdJog.get(i).getCpf()){
                    bdJog.remove(i);
                    return jogador;
                }
            }
        }
        return null;
    }//fim delMemCpf

    //Gestão de Tecnico (métodos sobrecarregados)
    public Tecnico consMemCpf(Tecnico tecnico){
        if(bdTec.getCpf() != 0){
            return bdTec;
        }
        return null;
    }//fim consMemCpf
    
    public Tecnico cadMemCpf(Tecnico tecnico){
        if(consMemCpf(tecnico) == null){
            bdTec = tecnico;
            return bdTec;
        }
        return null;
    }//fim cadMemCpf
    
    public Tecnico attMemCpf(Tecnico tecnico){
        if(consMemCpf(tecnico) != null){
            try{
                bdTec.setCpf(tecnico.getCpf());
                bdTec.setNome(tecnico.getNome());
                bdTec.setIdade(tecnico.getIdade());
                bdTec.setSetor(tecnico.getSetor());
                bdTec.setCargo(tecnico.getCargo());
                bdTec.setSalario(tecnico.getSalario());
                bdTec.setDataContrat(tecnico.getDataContrat());
                return bdTec;
                
            } 
            catch (CpfPeqException ex) {} 
            catch (CpfGrdException ex) {}
            catch (StringGrdException ex) {} 
            catch (StringVaziaException ex) {} 
            catch (IdadePeqException ex) {} 
            catch (SalPeqException ex) {}
            

        }
        return null;
    }//fim attMemCpf
    
    public Tecnico delMemCpf(Tecnico tecnico){
        if(consMemCpf(tecnico) != null){
            bdTec = new Tecnico();
            return tecnico;
        }
        return null;
    }//fim delMemCpf
    
    //Gestão de certificados(Tecnico)
    public String consCertificado(String certificado){
        for(String s: bdTec.getCertificados()){
           if(s.equalsIgnoreCase(certificado)){
               return s;
           } 
        }
        return null;
    }//fim consCertificado
    
    public String cadCertificado(String certificado) throws StringVaziaException, StringGrdException{
        if(certificado.length() > 0){
            if(certificado.length() <= 25){
                if(consCertificado(certificado) == null){
                    bdTec.getCertificados().add(certificado);
                    return certificado;
                }
                return null;
            }
            else{
                throw new StringGrdException();
            }
        }        
        else{
            throw new StringVaziaException();
        }
    }//fim cadCertificado

    
    public String delCertificado(String certificado){
        if(consCertificado(certificado) != null){
            for(int i = 0; i < bdTec.getCertificados().size(); i++){
                if(bdTec.getCertificados().get(i).equalsIgnoreCase(certificado)){
                    bdTec.getCertificados().remove(i);
                    return certificado;
                }
            }
        }
        return null;
    }//fim delCertificado
    
    public void limpaCertificados(){
        bdTec.getCertificados().clear();
    }//fim limpaCertificados
    
    // Gestão de premios(Tecnico)
    public String consPremio(String premio){
        for(String s: bdTec.getPremios()){
           if(s.equalsIgnoreCase(premio)){
               return s;
           } 
        }
        return null;
    }//fim consPremio
    
    public String cadPremio(String premio) throws StringGrdException, StringVaziaException{
        if(premio.length() > 0){
            if(premio.length() <= 25){
                if(consPremio(premio) == null){
                    bdTec.getPremios().add(premio);
                    return premio;
                }
                return null;
            }
            else{
                throw new StringGrdException();
            }
        }        
        else{
            throw new StringVaziaException();
        }
    }//fim CadPremio
    
    public String delPremio(String premio){
        if(consPremio(premio) != null){
            for(int i = 0; i < bdTec.getPremios().size(); i++){
                if(bdTec.getPremios().get(i).equalsIgnoreCase(premio)){
                    bdTec.getPremios().remove(i);
                    return premio;
                }
            }
        }
        return null;
    }//fim delPremio
    
    public void limpaPremios(){
        bdTec.getPremios().clear();
    }//fim limpaPremios
    
    
    //Gestão de Presidente (métodos sobrecarregados)
    public Presidente consMemCpf(Presidente presidente){
        for(Presidente p: bdPres){
            if(presidente.getCpf() == p.getCpf()){
                return p;
            }
        }
        return null;
    }//fim consMemCpf
    
    public Presidente consPresNumMandato(Presidente presidente){
        for(Presidente p: bdPres){
            if(presidente.getNumMandato() == p.getNumMandato()){
                return p;
            }
        }
        return null;
    }//fim consPresNumMandato
    
    public Presidente cadMemCpf(Presidente presidente){
        if(consMemCpf(presidente) == null){
            try{
                presidente.setNumMandato(numMandatoPres+1);
                bdPres.add(presidente);
                numMandatoPres++;
                return presidente;
            }
            catch(ValPeqException vpe){
                JOptionPane.showMessageDialog(null, "Número de Mandato Inválido.", "ERRO de Cadastro", 0);
            }
        }
        return null;
    }//fim cadMemCpf
    
    public Presidente attMemCpf(Presidente presidente){
        if(consMemCpf(presidente) != null){
            for(int i = 0; i < bdPres.size(); i++){
                if(presidente.getCpf() == bdPres.get(i).getCpf()){
                    bdPres.set(i, presidente);
                    return bdPres.get(i);
                }
            }
        }
        return null;
    }//fim attMemCpf
    
    public Presidente attPresNumMandato(Presidente presidente){
            if(consPresNumMandato(presidente) != null){
            for(int i = 0; i < bdPres.size(); i++){
                if(presidente.getNumMandato() == bdPres.get(i).getNumMandato()){
                    bdPres.set(i, presidente);
                    return bdPres.get(i);
                }
            }
        }
        return null;
    }//fim attPresNumMandato
    
    public Presidente delMemCpf(Presidente presidente){
        if(consMemCpf(presidente) != null){
            for(int i = 0; i < bdPres.size(); i++){
                if(presidente.getCpf() == bdPres.get(i).getCpf()){
                    bdPres.remove(i);
                    return presidente;
                }
            }
        }
        return null;
    }//fim delMemCpf
    
    public Presidente delPresNumMandato(Presidente presidente){
        if(consPresNumMandato(presidente) != null){
            for(int i = 0; i < bdPres.size(); i++){
                if(presidente.getNumMandato() == bdPres.get(i).getNumMandato()){
                    bdPres.remove(i);
                    return presidente;
                }
            }
        }
        return null;
    }//fim delPresNumMandato
    
    public boolean valEquipe(){
        if(bdJog.size() > 0 && bdPres.size() > 0 && bdTec.getCpf() != 0){
            return true;
        }
        return false;//fim valEquipe
    }
    
    public void distPremio(double premio){
        int numMem = getNumMembros();
        
        for(Jogador j: bdJog){
            j.calcPremio(premio, numMem);
        }
        bdPres.get(bdPres.size() - 1).calcPremio(premio, numMem);
        bdTec.calcPremio(premio, numMem);
        
    }//fim distPremio
    
    public void limparDist(){
        for(Jogador j: bdJog){
            j.setSalExtra(0);
        }
        bdPres.getLast().setSalExtra(0);
        bdTec.setSalExtra(0);
    }//fim limparDist
    
    public void limparBD(){
        bdJog.clear();
        bdTec = new Tecnico();
        bdPres.clear();
        
        numMandatoPres = 0;
    }//fim limparBD
    
}
