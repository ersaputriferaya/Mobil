package mobil;

public class Toyota implements Car{
    
    private int speed;
    private boolean isStartEngine;
    
    public Toyota(){
        this.speed = 40;
    }
    @Override
    public void startEngine() {
        isStartEngine = true;
        System.out.println("MOBIL MENYALA....");
        System.out.println("Toyota Avanza Versi tertinggi");
    }
    @Override
    public void stopEngine() {
        isStartEngine = false;
        System.out.println("MOBIL TELAH DIMATIKAN");
    }
    @Override
    public void speedUp() {
        if(isStartEngine){
            if(this.speed == MAX_SPEED){
                System.out.println("KECEPATAN PADA MOBIL SUDAH SANGAT CEPAT");
                System.out.println("Sudah "+ this.getSpeed() + " Km/jam");
            }else{
                this.speed += 20;
                System.out.println("Kecepatan Sekarang : "+ this.getSpeed() + " Km/jam");
            }
        }else{
            System.out.println("Nyalakan Mobilnya Terlebih Dahulu!!!");
        }
    }
    @Override
    public void speedDown() {
        if(isStartEngine){
            if(this.speed == MIN_SPEED){
                System.out.println("Kecepatan = 0 Km/jam");
            }else{
                this.speed -= 20;
                System.out.println("Kecepatan Sekarang : "+ this.getSpeed() + " Km/jam");
            }
        }else{
            System.out.println("Nyalakan Mobilnya Terlebih Dahulu!!!");
        }
    }
     public int getSpeed(){
        return this.speed;
   } 
}

