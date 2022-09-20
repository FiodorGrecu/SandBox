package com.noorteck.qa.runner;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)


 @KarateOptions(features="classpath:com/noorteck/qa/features/US1-FindJobAPI.feature")

public class CallingDiffFeatureFileRunner {

}

/**
	Feature File 1: 	<US1-FindJobAPI.feature>
	Feature File 2:  	<US2-AddNewJobAPI.feature>
	
	Inside our feature file 1 we are calling another scenario which is located inside feature file 2
	
*/