import models.Cheesecake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheesecakeTest {

    Cheesecake cheesecake;

    @BeforeEach
    public void setUp(){
        cheesecake = new Cheesecake("New York","vanilla",5,7.50,false,true,"digestives");
    }

    @Test
    public void canGetBaked(){
        assertThat(cheesecake.getBaked()).isEqualTo(true);
    }

    @Test
    public void canSetBaked(){
        cheesecake.setBaked(false);
        assertThat(cheesecake.getBaked()).isEqualTo(false);
    }

    @Test
    public void canGetBase(){
        assertThat(cheesecake.getBase()).isEqualTo("digestives");
    }

    @Test
    public void canSetBase(){
        cheesecake.setBase("hobknobs");
        assertThat(cheesecake.getBase()).isEqualTo("hobknobs");
    }

    @Test
    public void canGetName(){
        assertThat(cheesecake.getName()).isEqualTo("New York");
    }

    @Test
    public void canSetName(){
        cheesecake.setName("Unbaked");
        assertThat(cheesecake.getName()).isEqualTo("Unbaked");
    }

    @Test
    public void canGetSellPrice(){
        assertThat(cheesecake.getSellPrice()).isEqualTo(7.50);
    }

    @Test
    public void canSetSellPrice(){
        cheesecake.setSellPrice(10);
        assertThat(cheesecake.getSellPrice()).isEqualTo(10);
    }

    @Test
    public void canGetCost(){
        assertThat(cheesecake.getCost()).isEqualTo(5);
    }

    @Test
    public void canSetCost(){
        cheesecake.setCost(6);
        assertThat(cheesecake.getCost()).isEqualTo(6);
    }

    @Test
    public void canCalcMargin(){
        assertThat(cheesecake.calculateMargin()).isEqualTo(7.50-5);
    }

    @Test
    public void canGetFlavour(){
        assertThat(cheesecake.getBaseFlavour()).isEqualTo("vanilla");
    }

    @Test
    public void canSetFlavour(){
        cheesecake.setBaseFlavour("lemon");
        assertThat(cheesecake.getBaseFlavour()).isEqualTo("lemon");
    }

    @Test
    public void canCheckVegan(){
        assertThat(cheesecake.isVegan()).isEqualTo(false);
    }

    @Test
    public void canSetVegan(){
        cheesecake.setVegan(true);
        assertThat(cheesecake.isVegan()).isEqualTo(true);
    }

    @Test
    public void canCalcSellPriceDigestives(){
        cheesecake.setBase("digestives");
        assertThat(cheesecake.calcSellPrice()).isEqualTo(9.50);
    }

    @Test
    public void canCalcSellPriceHobknobs(){
        cheesecake.setBase("hobknobs");
        assertThat(cheesecake.calcSellPrice()).isEqualTo(8.50);
    }

    @Test
    public void canCalcSellPriceOther(){
        cheesecake.setBase("shortcake");
        assertThat(cheesecake.calcSellPrice()).isEqualTo(7.50);
    }

    @Test
    public void getEggsBaked(){
        assertThat(cheesecake.getEggsNeeded()).isEqualTo(2);
    }

    @Test
    public void getEggsNonBaked(){
        cheesecake.setBaked(false);
        assertThat(cheesecake.getEggsNeeded()).isEqualTo(0);
    }

    @Test
    public void canCheckProfitable(){
        assertThat(cheesecake.isProfitable()).isEqualTo(true);
    }

    @Test
    public void canCheckNonProfitable(){
        cheesecake.setCost(25);
        assertThat(cheesecake.isProfitable()).isEqualTo(false);
    }

}
