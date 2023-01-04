package Figure;

public abstract class Shape {

    public String figureName(){
        return this.getClass().getSimpleName();
    }

    abstract boolean isExist();
}
