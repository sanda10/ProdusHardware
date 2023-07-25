



/**
 *
 * @author Sanda
 */
public class PlacaVideo extends ProdusHardware{
    public static double valuta =4.93;//4.80
    public static int punctajMaxim =100;//150

    public PlacaVideo(double pretValuta, double punctaj) {
        super(pretValuta, punctaj);
    }

    
  
    public void calculeazaPerformanta() {
        
        performanta = punctaj/punctajMaxim * 100;
    }
    public void calculeazaPretLei(){
        
        pretLei=pretValuta*valuta;
    }
                
        
    }
    
    

