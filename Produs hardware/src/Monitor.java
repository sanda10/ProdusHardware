

public class Monitor extends ProdusHardware{
   
    public static double valuta =4.8;//4.80
    public static int punctajMaxim =150;//150

    public Monitor(double pretValuta, double punctaj) {
        super(pretValuta, punctaj);
    }

    
    @Override
    public void calculeazaPerformanta() {
      
        performanta = punctaj/punctajMaxim * 100;
    }
    public void calculeazaPretLei(){
       
        pretLei=pretValuta*valuta;
    }
                
        
}
