package mobil;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Car mobilioTipeE = new Honda();
        Car avanzaVeloz = new Toyota();
        
        CarUser ersa = new CarUser(mobilioTipeE);
        CarUser putri = new CarUser(avanzaVeloz);
        
        while(true){
            int pilih;
            System.out.println("[1] Honda Mobilio Tipe E\n"
                             + "[2] Toyota Avanza Veloz\n"+
                               "[0] Exit");
            System.out.print("Pilih Mobil> ");
            pilih = input.nextInt();
        
        int aksi;
        if(pilih == 1){
            System.out.println("===== Honda =====");
        while(true){
            System.out.println("===PENGGUNAAN INTERFACE PADA MOBIL===");
            System.out.println("[1] Nyalakan Mobil");
            System.out.println("[2] Matikan Mobil");
            System.out.println("[3] Mempercepat Kecepatan Mobil");
            System.out.println("[4] Menurunkan Kecepatan Mobil");
            System.out.println("[0] Selesai Mengendarai Mobil");
            System.out.println("--------------------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();
            
            if(aksi == 1){
               ersa.turnStartEngineTheCar();
            }else if(aksi == 2){
               ersa.turnStopEngineTheCar();
            }else if(aksi == 3){
               ersa.makeCarSpeedUp();
            }else if(aksi == 4){
               ersa.makeCarSpeedDown();
            }else if(aksi == 0){
                System.exit(0);
            }else{
                System.out.println("Aksi Yang Di Pilih Salah");
            }
            }
        }else if(pilih == 2){
            System.out.println("===== Toyota =====");
            while(true){
            System.out.println("===PENGGUNAAN INTERFACE PADA MOBIL===");
            System.out.println("[1] Nyalakan Mobil");
            System.out.println("[2] Matikan Mobil");
            System.out.println("[3] Mempercepat Kecepatan Mobil");
            System.out.println("[4] Menurunkan Kecepatan Mobil");
            System.out.println("[0] Selesai Mengendarai Mobil");
            System.out.println("--------------------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();
            
            if(aksi == 1){
               putri.turnStartEngineTheCar();
            }else if(aksi == 2){
               putri.turnStopEngineTheCar();
            }else if(aksi == 3){
               putri.makeCarSpeedUp();
            }else if(aksi == 4){
               putri.makeCarSpeedDown();
            }else if(aksi == 0){
                System.exit(0);
            }else{
                System.out.println("Aksi Yang Di Pilih Salah");
            }
        }
    
    }
        else if(pilih == 0){
            System.exit(0);
        }
        else{
            System.out.println("Mobil Tidak Tersedia");
        }
}
}
}

    
    

