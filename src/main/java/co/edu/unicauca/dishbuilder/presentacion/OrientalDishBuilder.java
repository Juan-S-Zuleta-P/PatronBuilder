package co.edu.unicauca.dishbuilder.presentacion;

import co.edu.unicauca.dishbuilder.Dish;
import co.edu.unicauca.dishbuilder.DishBuilder;
import co.edu.unicauca.dishbuilder.EnumSize;
import co.edu.unicauca.dishbuilder.OrientalDish;

/**
 *
 * @author Rivera
 */
public class OrientalDishBuilder extends DishBuilder {

    public OrientalDishBuilder(Dish dish) {
        super(dish);
    }

    @Override
    public void setCore() {
        this.setDish(new OrientalDish("Arroz oriental", "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas", "", 56000, EnumSize.ALL, "East rice"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Ramen", "Ramen con tofu", "", 3000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Coffee", "Cafe oriental", "", 5000, EnumSize.HALF));
    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

    @Override
    public Dish getDish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDish(Dish dish) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
