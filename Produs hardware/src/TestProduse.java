
public class TestProduse {
    
    public static void main(String[] args) {
        ProdusHardware[] p=new ProdusHardware[8];
        p[0]=new PlacaVideo(130,72);
        p[1]=new Monitor(249,78);
    p[2]=new PlacaVideo(108, 77.79);
     p[3]=new Monitor(224,93);
     p[4]=new PlacaVideo(152,72.55);
      p[5]=new Monitor(249,96);
      p[6]=new PlacaVideo(53,54.69);
       p[7]=new Monitor(275,107);
       for(int i=0; i<8; i++){
           p[i].calculeazaPerformanta();
           if(p[i] instanceof PlacaVideo) ((PlacaVideo) p[i]).calculeazaPretLei();
          else((Monitor) p[i]).calculeazaPretLei();
            System.out.println(p[i].toString());
       }
    }
}
