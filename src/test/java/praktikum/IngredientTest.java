package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//добавлены тесты по замечаниям
public class IngredientTest {

    private Ingredient ingredient;

    @Before
    public void init() {
        ingredient = new Ingredient(IngredientType.SAUCE, "name", 14.1f);
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(14.1f, ingredient.getPrice(), 0.0001);
    }

    @Test
    public void getName() {
        Assert.assertEquals("name", ingredient.getName());
    }

    @Test
    public void getType() {
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }


    @Test
    public void getNullType() {
        ingredient.type = null;
        Assert.assertNull(ingredient.getType());
    }
}
