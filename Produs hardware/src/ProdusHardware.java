
public abstract class ProdusHardware {
    protected double pretValuta;
    protected double pretLei;
    protected double performanta;
    protected double punctaj;
    public ProdusHardware(double pretValuta,double punctaj){
        this.pretValuta=pretValuta;
        this.punctaj=punctaj;
                
    }
    public abstract void calculeazaPerformanta();
    public double calculeazaRaportPretLeiPerformanta(){
        calculeazaPerformanta();
        return pretLei/performanta;
    }
   
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Produs de tip ");
        sb.append(getClass().getSimpleName());
        sb.append(" pret lei ");
        sb.append(pretLei);
        sb.append(" Pret valuta");
        sb.append(pretValuta);
        sb.append(" Performanta");
        sb.append(performanta);
        sb.append(" Raport pret performanta"+ "; ");
        sb.append(calculeazaRaportPretLeiPerformanta());
        sb.append("\n");                                                                                                    sb.append("\n");
                         
                               
        return sb.toString();
        
    }
     
}
