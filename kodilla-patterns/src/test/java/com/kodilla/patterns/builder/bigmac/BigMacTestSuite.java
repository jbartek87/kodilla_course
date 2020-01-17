package com.kodilla.patterns.builder.bigmac;

import builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
            public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bon( true )
                .burgers( 2 )
                .sauce( "1000 wysp" )
                .ingredients( "onion" )
                .ingredients( "cheese" )
                .ingredients( "raw meat" )
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals( 2, howManyIngredients );
    }
}
