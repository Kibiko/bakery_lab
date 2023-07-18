import models.Cupcake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("Fancy","milk",2,3.99,true,3);
        cupcake.setToppings(new String[] {"Gold","Sprinkles","Balls"});
    }

    @Test
    public void canGetToppings(){
        String[] expected = {"Gold","Sprinkles","Balls"};
        assertThat(cupcake.getToppings()).isEqualTo(expected);
    }

    @Test
    public void canSetToppings(){
        cupcake.setToppings(new String[] {"Honey","Marzipan","Mars"});
        assertThat(cupcake.getToppings()).isEqualTo(new String[] {"Honey","Marzipan","Mars"});
    }

    @Test
    public void canGetName(){
        assertThat(cupcake.getName()).isEqualTo("Fancy");
    }

    @Test public void canSetName(){
        cupcake.setName("Non-vegan");
        assertThat(cupcake.getName()).isEqualTo("Non-vegan");
    }

    @Test
    public void canGetSellPrice(){
        assertThat(cupcake.getSellPrice()).isEqualTo(3.99);
    }

    @Test
    public void canSetSellPrice(){
        cupcake.setSellPrice(5);
        assertThat(cupcake.getSellPrice()).isEqualTo(5);
    }

    @Test
    public void canGetCost(){
        assertThat(cupcake.getCost()).isEqualTo(2);
    }

    @Test
    public void canSetCost(){
        cupcake.setCost(1.50);
        assertThat(cupcake.getCost()).isEqualTo(1.50);
    }

    @Test
    public void canCalcMargin(){
        assertThat(cupcake.calculateMargin()).isEqualTo(3.99-2);
    }

    @Test
    public void canGetFlavour(){
        assertThat(cupcake.getBaseFlavour()).isEqualTo("milk");
    }

    @Test
    public void canSetFlavour(){
        cupcake.setBaseFlavour("plain");
        assertThat(cupcake.getBaseFlavour()).isEqualTo("plain");
    }

    @Test
    public void canCheckVegan(){
        assertThat(cupcake.isVegan()).isEqualTo(true);
    }

    @Test
    public void canSetVegan(){
        cupcake.setVegan(false);
        assertThat(cupcake.isVegan()).isEqualTo(false);
    }

    @Test
    public void canCalcVegan(){
        assertThat(cupcake.calcSellPrice()).isEqualTo(4.49);
    }

    @Test
    public void canCalcNonVegan(){
        cupcake.setVegan(false);
        assertThat(cupcake.calcSellPrice()).isEqualTo(3.99);
    }

}
