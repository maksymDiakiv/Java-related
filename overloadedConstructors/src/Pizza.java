public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }
    Pizza(String bread, String sauce, String cheese, String topping){//overloaded
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
