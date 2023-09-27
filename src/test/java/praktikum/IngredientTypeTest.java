package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTest {

    //добавлены тесты по замечаниям
    @Test
    public void values() {
        Assert.assertEquals(2, IngredientType.values().length);
    }

    @Test
    public void valueOfSauce() {
        Assert.assertEquals(IngredientType.SAUCE,
                IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void valueOfFilling() {
        Assert.assertEquals(IngredientType.FILLING,
                IngredientType.valueOf("FILLING"));
    }

}
