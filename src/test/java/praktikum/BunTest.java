package praktikum;

import org.junit.Assert;
import org.junit.Test;

//добавлены тесты по замечаниям
public class BunTest {

    @Test
    public void bunGetExistingName() {
        Bun bun = new Bun("name", 14.1f);
        Assert.assertEquals("name", bun.getName());
    }

    @Test
    public void bunGetNullName() {
        Bun bun = new Bun(null, 14.1f);
        Assert.assertNull(bun.getName());
    }

    @Test
    public void bunGetPositivePrice() {
        Bun bun = new Bun("name", 14.1f);
        Assert.assertEquals(14.1f, bun.getPrice(), 0.0001);
    }

    @Test
    public void bunGetZeroPrice() {
        Bun bun = new Bun("name", 0f);
        Assert.assertEquals(0, bun.getPrice(), 0.0001);
    }

    @Test
    public void bunGetNegativePrice() {
        Bun bun = new Bun("name", -1.019f);
        Assert.assertEquals(-1.019f, bun.getPrice(), 0.0001);
    }

}