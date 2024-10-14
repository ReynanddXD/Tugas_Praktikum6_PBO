package Soal1;

public class Soal1_looping {
    
    // a. Menghitung Deret bilangan prima dan bukan dari 0 – 20 dengan Hasilnya menggunkan for loop
    public void cetakPrima(){
        System.out.println("a. Deret Bilangan Prima dan Bukan (0-20):");

        for (int i = 0; i <= 20; i++){
            if (i <= 1){
                System.out.println(i + " adalah bukan bilangan prima.");
            } else{
                boolean isPrima = true;
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrima = false;
                        break;
                    }
                }
                if (isPrima){
                    System.out.println(i + " adalah bilangan prima.");
                } else{
                    System.out.println(i + " adalah bukan bilangan prima.");
                }
            }
        }
    }
    
    
    // b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20 dengan Hasilnya menggunakan while loop
    public void cetakGenapGanjil() {
        System.out.println("\nb. Deret Bilangan Ganjil dan Genap (0-20):");
        
        int nomor = 0;
        while (nomor <= 20){
            if (nomor % 2 == 0){
                System.out.println(nomor + " adalah bilangan genap.");
            }else{
                System.out.println(nomor + " adalah bilangan ganjil.");
            }
            nomor++;
        }
    }

    
    // c. Huruf Z – A menggunakan for loop
    public void cetakHuruf(){
        System.out.println("\nc. Deret Huruf Z - A:");
        
        for (char a = 'Z'; a >= 'A'; a--){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    
    // d. Lagu “Anak Ayam Turun N” menggunakan do-while loop
    public void anakAyamTurun(int jumlah){
        System.out.println("\nd. Lagu Anak Ayam Turun " + jumlah + ":");
        
        do{
            if (jumlah > 1){
                System.out.println("Anak ayam turun " + jumlah + ", mati satu tinggal " + (jumlah - 1));
            }else if (jumlah == 1){
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya");
            }
            jumlah--;
        }while (jumlah > 0);
    }
}
