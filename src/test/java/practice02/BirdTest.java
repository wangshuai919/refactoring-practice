package practice02;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void getSpeed() {
        Bird europeanBird = new Bird(Bird.EUROPEAN);
        assertEquals(60, europeanBird.getSpeed(), 0.0);

        Bird africanBird = new Bird(Bird.AFRICAN);
        africanBird.setFactor(1.5);
        assertEquals(60 * 1.5, africanBird.getSpeed(), 0.0);

        Bird norwegianBird = new Bird(Bird.NORWEGIAN_BLUE);
        norwegianBird.setFactor(1.3);
        assertEquals(60 * 1.3 * 1.3, norwegianBird.getSpeed(), 0.0);
    }
}