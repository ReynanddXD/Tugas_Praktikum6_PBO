package Soal2;

public class Soal2_looping {
    
    public void tabelPerkalian (int nilai){
        if (nilai >= 10){
            System.out.println("Nilai tidak boleh lebih atau sama dengan 10");
        }else {
            System.out.println("Tabel Perkalian " + nilai + " x " + nilai + ":");
            
            // untuk awalan atasan tabel
            System.out.print("\t");
            for (int i = 1; i <= nilai; i++){
                System.out.print(i + "\t");
            }
            System.out.println();
            
            // untuk sampingan dan isi tabel
            for (int i = 1; i <= nilai ;i++){
                System.out.print(i + "\t");
                for (int j = 1; j <= nilai ;j++){
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }
    }
}
