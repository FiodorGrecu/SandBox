package com.noorteck.qa.runner;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)

 @KarateOptions(features="classpath:com/noorteck/qa/helper/CallJavaMethod.feature")

public class CallingJavaMethodRunner {

}
