public class Dreieck extends Forms {


    public Dreieck(double xDrei, double yDrei, double zDrei){
        this.z = zDrei;
        this.x = xDrei;
        this.y = yDrei;

    }
    public double perimetreDrei(){
        double periDrei = x+y+z;
        return periDrei;

    }
    public double surfDrei(){
        double surfDrei = x*y/2;
        return  surfDrei;
    }

    @Override
    public String toString() {
        String triangle = "Le perimetre du triangle est: "+perimetreDrei()+" et sa Surface est: "+surfDrei();
        return triangle;
    }
}
