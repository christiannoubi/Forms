public class Kreis extends Forms {

    public Kreis(double xKreis){
        this.x = xKreis;
        counter++;
    }
    public double periKreis(){
        double perimetre = x*2*Math.PI;
        return perimetre ;
    }
    public double surfKreis(){
        double surfkreise = x*x*Math.PI;
        return  surfkreise;
    }
    public String toString() {
        String kreis = "Le perimetre du cercle est: "+periKreis()+" et sa Surface est: "+surfKreis();
        return kreis;
    }
}
