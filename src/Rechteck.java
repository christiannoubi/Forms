public class Rechteck extends Forms {

    public Rechteck(double xRecht, double yRecht){
        this.x = xRecht;
        this.y = yRecht;
        counter++;
        counter++;
    }
    public double periRecht(){
        double periDrei = (x+y)*2;
        return periDrei;
    }
    public double surfRecht(){
        double surfDrei = (x*y)*2;
        return  surfDrei;
    }
    public String toString() {
        String rechteck = "Le perimetre du Rectangle est: "+periRecht()+" et sa Surface est : "+surfRecht();
        return rechteck;
    }
}
