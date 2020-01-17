package builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final boolean bon;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;


    public static class BigmacBuilder {
        private boolean bon;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bon(boolean withSezam) {
            this.bon = withSezam;
            return this;
        }

        public BigmacBuilder burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers;
            return this;
        }

        public BigmacBuilder sauce(String sauceMenu) {
            if (sauceMenu == "standard" || sauceMenu == "1000 wysp" || sauceMenu == "barbecue") {
                this.sauce = sauceMenu;
                return this;
            } else
                System.out.println( "There is no such sauce" );
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {

            if (ingredient == "salad" || ingredient == "onion" || ingredient == "becon"
                    || ingredient == "cucumber" || ingredient == "chili" || ingredient == "mushrooms"
                    || ingredient == "shrimps" || ingredient == "cheese") {
                ingredients.add( ingredient );
                return this;
            } else
                System.out.println( "There is no such ingredient" );
            return this;
        }

        public Bigmac build(){
            return new Bigmac( bon, burgers,sauce,ingredients );
        }
    }

    private Bigmac(final boolean bon , final int burgers , final String sauce , List<String> ingredients) {
        this.bon = bon;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public boolean isBon() {
        return bon;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BIGMAC{" +
                "bon with sezam ='" + bon + '\'' +
                "number of burgers ='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
