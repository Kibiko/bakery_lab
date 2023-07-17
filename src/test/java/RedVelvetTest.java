import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RedVelvetTest {

    RedVelvet redvelvet;

    @BeforeEach
    public void setUp(){
        redvelvet = new RedVelvet("Classic","red_velvet",3.50,9.99,false,3);
    }

    @Test
    public void canGetLayers(){
        assertThat(redvelvet.getLayers()).isEqualTo(3);
    }

    @Test
    public void canSetLayers(){
        redvelvet.setLayers(2);
        assertThat(redvelvet.getLayers()).isEqualTo(2);
    }

    @Test
    public void canGetName(){
        assertThat(redvelvet.getName()).isEqualTo("Classic");
    }

    @Test
    public void canSetName(){
        redvelvet.setName("Birthday");
        assertThat(redvelvet.getName()).isEqualTo("Birthday");
    }

    @Test
    public void canGetSellPrice(){
        assertThat(redvelvet.getSellPrice()).isEqualTo(9.99);
    }

    @Test
    public void canSetSellPrice(){
        redvelvet.setSellPrice(11.99);
        assertThat(redvelvet.getSellPrice()).isEqualTo(11.99);
    }

    @Test
    public void canGetCost(){
        assertThat(redvelvet.getCost()).isEqualTo(3.50);
    }

    @Test
    public void canSetCost(){
        redvelvet.setCost(4);
        assertThat(redvelvet.getCost()).isEqualTo(4);
    }

    @Test
    public void canCalcMargin(){
        assertThat(redvelvet.calculateMargin()).isEqualTo(9.99-3.50);
    }

    @Test
    public void canGetFlavour(){
        assertThat(redvelvet.getBaseFlavour()).isEqualTo("red_velvet");
    }

    @Test
    public void canSetFlavour(){
        redvelvet.setBaseFlavour("white_velvet");
        assertThat(redvelvet.getBaseFlavour()).isEqualTo("white_velvet");
    }

    @Test
    public void canCheckVegan(){
        assertThat(redvelvet.isVegan()).isEqualTo(false);
    }

    @Test
    public void canSetVegan(){
        redvelvet.setVegan(true);
        assertThat(redvelvet.isVegan()).isEqualTo(true);
    }


}
