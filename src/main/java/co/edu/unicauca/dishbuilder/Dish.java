
package co.edu.unicauca.dishbuilder;

import java.util.List;

/**
 *
 * @author Rivera
 */
public class Dish {

    private String name;
    private String description;
    private int price;
    private EnumSize size;
    private List<Dish> parts;
    
    public Dish() {
    }

    public Dish(String name, String description, int price, EnumSize size, List<Dish> parts) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.parts = parts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EnumSize getSize() {
        return size;
    }

    public void setSize(EnumSize size) {
        this.size = size;
    }

    public List<Dish> getParts() {
        return parts;
    }

    public void setParts(List<Dish> parts) {
        this.parts = parts;
    }
    
    
}
