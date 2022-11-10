package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void add() {
        DogHouse.clear();

        Dog dog = new Dog("Naruto", new Date(), 1);
        Dog dog1 = new Dog("Sasuke", new Date(), 2);
        Dog dog2 = new Dog("Sakura", new Date(), 3);

        DogHouse.add(dog); //add cat

        int expected = 1;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeID() {

        DogHouse.clear();

        Dog dog = new Dog("Naruto", new Date(), 1);
        Dog dog1 = new Dog("Sasuke", new Date(), 2);
        Dog dog2 = new Dog("Sakura", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog1);
        DogHouse.add(dog2);

        DogHouse.remove(1);

        int expected = 2;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

        CatHouse.clear();
    }
    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeDog() {

        DogHouse.clear();

        Dog dog = new Dog("Naruto", new Date(), 1);
        Dog dog1 = new Dog("Sasuke", new Date(), 2);
        Dog dog2 = new Dog("Sakura", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog1);
        DogHouse.add(dog2);

        DogHouse.remove(dog);

        int expected = 2;

        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

        DogHouse.clear();

    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getCatById() {
        Dog dog = new Dog("Naruto", new Date(), 1);
        Dog dog1 = new Dog("Sasuke", new Date(), 2);
        Dog dog2 = new Dog("Sakura", new Date(), 3);

        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);

        DogHouse.getDogById(1).getName();

        String expected = "Naruto";

        String actual = DogHouse.getDogById(1).getName();

        Assert.assertEquals(expected, actual);

        CatHouse.clear();
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
