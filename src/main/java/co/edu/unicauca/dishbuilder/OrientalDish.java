
package co.edu.unicauca.dishbuilder;

import java.util.List;

/**
 *
 * @author Rivera
 */
public class OrientalDish extends Dish{
    private String orientalName;

    public OrientalDish() {
    }

    public OrientalDish(String name, String description, int price, EnumSize size, List<Dish> parts) {
        super(name, description, price, size, parts);
    }

    public OrientalDish(String arroz_oriental, String arroz_con_estilo_oriental_añadiendo_ingre, String string, int i, EnumSize ALL, String east_rice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getOrientalName() {
        return orientalName;
    }

    public void setOrientalName(String orientalName) {
        this.orientalName = orientalName;
    }
    
}
