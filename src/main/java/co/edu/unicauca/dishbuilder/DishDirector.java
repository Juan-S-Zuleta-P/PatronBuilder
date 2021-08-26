
package co.edu.unicauca.dishbuilder;

/**
 *
 * @author Rivera
 */
public class DishDirector {
    private DishBuilder dishBuilder;

    public DishDirector() {
    }
    
    public DishDirector(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }
    
    public void setDishBuilder(DishBuilder dishBuilder){}
    
    public Dish getDish(){ return null;}
    
    public void buildDish(){}
}
