package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportTest {

    @Test
    public void move() {

        Car objCar = new Car();
        Aeroplane objAero = new Aeroplane();
        String x= "SAA";
        //System.out.println(objAero + "aa" + objCar);

        Assert.assertEquals(objAero.move(),x);
        //s

    }
    @Test
    public void move1() {

        Car objCar = new Car();

        String x= "Polo";
        //System.out.println(objAero + "aa" + objCar);

        Assert.assertEquals(objCar.move(),x);
    }

    @Test
    public void move2() {

       Car objTrans = new Car();
        String dTrans = "i am father";





        Assert.assertEquals(dTrans,objTrans.objT.move());

    }

}