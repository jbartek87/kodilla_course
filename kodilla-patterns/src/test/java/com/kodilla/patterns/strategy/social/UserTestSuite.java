package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User johny = new YGeneration( "Johny Beck");
        User bob = new Millenials( "Bobby Butter" );
        User kim = new ZGeneration( "Kim Kardashian" );

        //When
        String johnyDefault = johny.socialPublisher.share();
        System.out.println(johny.getUserName() + " : " + johny.sharePost() + " " + johnyDefault);
        String bobDefault = bob.socialPublisher.share();
        System.out.println(bob.getUserName() + " : " + bob.sharePost() + " " + bobDefault);
        String kimDefault = kim.socialPublisher.share();
        System.out.println(kim.getUserName() + " : " + kim.sharePost() +  " " + kimDefault);

        //Then
        Assert.assertEquals( "Snapchat", johnyDefault );
        Assert.assertEquals( "Twitter", bobDefault );
        Assert.assertEquals( "Facebook", kimDefault );
    }


    @Test
    public void testIndividualSharingStrategies(){
        //Given
        User johny = new YGeneration( "Johny Beck" );
        //When
        String johnyDefault = johny.socialPublisher.share();
        System.out.println(johny.getUserName() + " : " + johny.sharePost() + " " + johnyDefault);
        johny.changeFavSocial( new TwitterPublisher());
        String johnyNewOne = johny.socialPublisher.share();
        System.out.println(johny.getUserName() + " : " + johny.sharePost() + " " + johnyNewOne);
        //Then
        Assert.assertEquals( "Snapchat", johnyDefault );
        Assert.assertEquals( "Twitter", johnyNewOne );

    }
}
