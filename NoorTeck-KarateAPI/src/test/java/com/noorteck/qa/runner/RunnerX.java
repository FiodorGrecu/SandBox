package com.noorteck.qa.runner;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)

@KarateOptions(features="classpath:com/noorteck/qa/features/FINAL_VERSION.feature")
// @KarateOptions(features="classpath:com/noorteck/qa/features/US1-FindJobAPI.feature")

//@KarateOptions(features="classpath:com/noorteck/qa/features/demotest.feature")
public class RunnerX {

}
