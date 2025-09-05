// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import java.util.List;

public class BDTecnico {
    private static Tecnico bdTec;
    private static BDTecnico bdTecUnic;
    
    private BDTecnico(){
        bdTec = new Tecnico();
    }
    
    //Singleton
    public static BDTecnico getInstancia(){
        if(bdTecUnic == null){
            bdTecUnic = new BDTecnico();
            return bdTecUnic;
        }
        return bdTecUnic;
    }
    
    public List<String> getCertificados(){
        return bdTec.getCertificados();
    }
    public List<String> getPremios(){
        return bdTec.getPremios();
    }
    public Tecnico getBdTec(){
        return bdTec;
    }
    
    //Gestão de certificados(Tecnico)
    public String consCertificado(String certificado){
        for(String s: bdTec.getCertificados()){
           if(s.equalsIgnoreCase(certificado)){
               return s;
           } 
        }
        return null;
    }//fim consCertificado
    
    public String cadCertificado(String certificado){
        if(consCertificado(certificado) == null){
            bdTec.getCertificados().add(certificado);
            return certificado;
        }
        return null;
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
    
    // Gestão de premios(Tecnico)
    public String consPremio(String premio){
        for(String s: bdTec.getPremios()){
           if(s.equalsIgnoreCase(premio)){
               return s;
           } 
        }
        return null;
    }//fim consPremio
    
    public String cadPremio(String premio){
        if(consPremio(premio) == null){
            bdTec.getPremios().add(premio);
            return premio;
        }
        return null;
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
    

    
    
}
