public class Perusahaan extends Profil{
    @Override
    public void Data(String nama, String berdiri, String moto){
        System.out.println("Nama           :  "+nama);
        System.out.println("TTL            :  "+berdiri);
        System.out.println("No Telp        :  "+moto);
    }
}
