package Hewan;

public class Tampil {
 
    public static void main (String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();
    
        Hewan anjing = new Anjing();
        anjing.munculSuara();

        Hewan serigala = new Serigala();
        serigala.munculSuara();
    }
 
}
