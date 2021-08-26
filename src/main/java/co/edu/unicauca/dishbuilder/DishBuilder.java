
package co.edu.unicauca.dishbuilder;

/**
 *
 * @author Rivera
 */
public abstract class DishBuilder {
    
    protected Dish dish;

    public DishBuilder(Dish dish) {
        this.dish = dish;
    }
    
    public abstract void setcore();
    
    public abstract void addParts();
    
    public abstract void setSize();
    
    public abstract Dish getDish();
       
    
    public abstract void setDish(Dish dish);
    
}
