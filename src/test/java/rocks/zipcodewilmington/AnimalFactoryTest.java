package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    public void createDog() {

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {

        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        //Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //***This way because you're testing the Animal Factory class***
        Cat calvin = AnimalFactory.createCat(givenName, givenBirthDate);

        // When (we retrieve data from the cat)
        String retrievedName = calvin.getName();
        Date retrievedBirthDate = calvin.getBirthDate();
        //Integer retrievedId = calvin.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        //Assert.assertEquals(givenId, retrievedId);

    }
}
