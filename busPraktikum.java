public class busPraktikum {
    private double penumpang, maxpenumpang, counter, penumpangBaru;

    //konstruktor
    public busPraktikum(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
        counter = 0;
        penumpangBaru = 0;
    }

    //method mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if(temp>=maxpenumpang) {
            System.out.println("overload penumpang");
        }else{
            this.penumpang = temp;
            counter++;
            penumpangBaru +=penumpang;
        }
    }

    public void getPenumpang(double penumpang){
        double temp;
        temp = (double) this.penumpang - penumpang;
        if(temp<0){
            System.out.println("jumlah penumpang tidak bisa kurang dari 0");
        }else{
            this.penumpang = temp;
            counter--;
            penumpangBaru-=penumpang;
        }
    }

    public double getAverage(){
        if(counter==0){
            return 0;
        }else{
            return penumpangBaru/counter;
        }
    }

    public void cetak(){
        System.out.println("penumpang sekaarang ="+penumpang);
        System.out.println("penumpang seharusnya adalah="+maxpenumpang);
        System.out.println("rata-rata berat penumpang ="+getAverage());
    }
}