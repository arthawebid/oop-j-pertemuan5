package pertemuan501;

/**
 *
 * @author Made Artha
 * TGL: 8 April 2025
 */
public class Pertemuan501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jajan pancong = new jajan();
        
        //pancong.bentuk = "lonjong";
        pancong.setBentuk("lonjong");
        
        pancong.rasa = "Suka-Suka";
        pancong.harga = 5000;
        pancong.warna = "pink";
        
        System.out.println("Bentuknya: "+pancong.getBentuk());
                
    }
    
}