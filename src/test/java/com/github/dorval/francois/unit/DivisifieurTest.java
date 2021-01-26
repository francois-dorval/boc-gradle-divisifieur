package com.github.dorval.francois.unit;

import com.github.dorval.francois.business.Divisifieur;
import org.junit.Assert;
import org.junit.Test;

public class DivisifieurTest {

    @Test
    public void testUnitaire(){
        int result = Divisifieur.diviser(10, 0);
        Assert.assertEquals(result, 1);
    }
}
