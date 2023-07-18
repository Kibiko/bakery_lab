import interfaces.IEggsNeeded;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BakeryTest {

    Bakery bakery;
    Cake cake;
    RedVelvet redVelvet;
    Cheesecake cheesecake;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery("Japandi models.Bakery");
        redVelvet = new RedVelvet("Classic","red_velvet",5,10,false,3);
        cheesecake = new Cheesecake("New York","vanilla",7,11,false,true,"hobknobs");
        Cupcake cupcake = new Cupcake("Fancy","milk",2,4,true,3);
        bakery.addCakeToStock(redVelvet);
        bakery.addCakeToStock(cheesecake);
        bakery.addCakeToStock(cupcake);
    }

    @Test
    public void canGetName(){
        assertThat(bakery.getName()).isEqualTo("Japandi models.Bakery");
    }

    @Test
    public void canSetName(){
        bakery.setName("Katrine's Bakes");
        assertThat(bakery.getName()).isEqualTo("Katrine's Bakes");
    }

    @Test
    public void canGetStock(){
        assertThat(bakery.getStock().size()).isEqualTo(bakery.getStockCount());
    }

    @Test
    public void canGetStockCount(){
        assertThat(bakery.getStockCount()).isEqualTo(3);
    }

    @Test
    public void canAddCake(){
        cake = new Cheesecake("Chocolate","chocolate",6,12,false,false,"digestives");
        bakery.addCakeToStock(cake);
        assertThat(bakery.getStockCount()).isEqualTo(4);
    }

    @Test
    public void canRemoveCake(){
        bakery.removeCakeFromStock(redVelvet);
        assertThat(bakery.getStockCount()).isEqualTo(2);
    }

    @Test
    public void canGetTill(){
        assertThat(bakery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        bakery.setTill(50);
        assertThat(bakery.getTill()).isEqualTo(50);
    }

    @Test
    public void canGetProfit(){
        assertThat(bakery.getStockProfit()).isEqualTo(11);
    }

    @Test
    public void canGetEggCakes(){
        bakery.addEggCakes(redVelvet);
        assertThat(bakery.getEggCakes().size()).isEqualTo(1);
    }

    @Test
    public void canAddEggCakes(){
        bakery.addEggCakes(redVelvet);
        bakery.addEggCakes(cheesecake);
        assertThat(bakery.getEggCakes().size()).isEqualTo(2);
    }

}
