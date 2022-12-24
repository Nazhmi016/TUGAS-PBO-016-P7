abstract class Profil {
    public abstract void Data(String nama, String berdiri, String moto);
    public void mbio(){
        System.out.println("Profil perusahaan");
    }
    interface Profil2{
        String Perintis=" H. Sujana";
        String alamat=" Jalan Margatapa No.16";
        void perintis();
        void Alamat();
    }
}
