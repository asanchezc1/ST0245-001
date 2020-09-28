
/**
 *lab 3
 * 
 * @author Andrea sanchez cortes
 * @version 1
 */
public class Data {    
    Long ID;
    double x;
    double y;
    String name;
    
    public Data(Long ID, double x, double y, String name) {
        this.ID = ID;
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public Data(long ID,double x, double y){
        this(ID,x,y," ");
    }
    public Long getID(){
        return this.ID;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public String getName(){
        return this.name;
    }
}