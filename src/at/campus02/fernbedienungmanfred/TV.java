package at.campus02.fernbedienungmanfred;

public class TV {
    private boolean istEin = false;
    private int kanal = 1;

    public int getKanal() {
        return kanal;
    }

    public void setKanal(int kanal) {
        this.kanal = kanal;
        System.out.println("Neuer Kanal: " + kanal);
    }

    public void an(){
        if (istEin == true){
            System.out.println("TV ist bereits an");
        }else {
            istEin = true;
            System.out.println("TV ist an");
        }
    }

    public void aus(){
        if (istEin == false){
            System.out.println("TV ist bereits aus");
        }else {
            istEin = false;
            System.out.println("TV ist aus");
        }
    }

    public void rauf(){
        //wenn audgeschaltet -> return immediately
        if (!istEin){
            return;
        }
        if (kanal == 40){
            kanal = 1;
        }else {
            kanal++;
        }
        System.out.println("Neuer Kanal: " + kanal);
    }

    public void runter(){
        //wenn audgeschaltet -> return immediately
        if (!istEin){
            return;
        }
        if (kanal == 1){
            kanal = 40;
        }else {
            kanal--;
        }
        System.out.println("Neuer Kanal: " + kanal);
    }

    public boolean istEin(){
      return istEin;
    }
}
