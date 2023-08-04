package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class SneakersTest {

    Sneakers testSneakers;
    @Test
    void setId() {
        //Given
        int expected = 42;

        //When
        Sneakers testSneakers = new Sneakers();
        testSneakers.setId(expected);
        //Then
      Assertions.assertEquals(expected, testSneakers.getId());
    }

    @Test
    void setName() {
        //Given
        String expected = "OZWEEGO";
        //When
        testSneakers.setName(expected);
        //Then
        Assertions.assertEquals(expected, testSneakers.getName());
    }

    @Test
    void setBrand() {
        //Given
        String expected = "Adidas";
        //When
        testSneakers.setBrand(expected);
        //Then
        Assertions.assertEquals(expected, testSneakers.getBrand());

    }

    @Test
    void setSport() {
        //Given
        String expected = "Soccer";
        //When
        testSneakers.setName(expected);
        //Then
        Assertions.assertEquals(expected, testSneakers.getName());

    }

    @Test
    void setSize() {
        //Given
        float expected = 7.5F;

        //When
        Sneakers testSneakers = new Sneakers();
        testSneakers.setSize(expected);
        //Then
        Assertions.assertEquals(expected, testSneakers.getSize());
    }

    @Test
    void setQty() {
        //Given
        int expected = 100;

        //When
        Sneakers testSneakers = new Sneakers();
        testSneakers.setQty(expected);
        //Then
        Assertions.assertEquals(expected, testSneakers.getQty());
    }

    @Test
    void setPrice() {
        //Given
        float expected = 120.00F;

        //When
        Sneakers testSneakers = new Sneakers();
        testSneakers.setPrice(expected);
        //Then
        Assertions.assertEquals(expected, testSneakers.getPrice());
    }
    }
}
