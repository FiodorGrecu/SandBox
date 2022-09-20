Feature: Calling Java method in feature file

  #To call java method from feature file
  #1. We need to create create object using def obj
  # 2. then set obj equal to by calling Java.type()
  #and pass the java class path(the package name and class name)
  #3. then if the method we are calling is non static we need to create object with new keyword
  #4. if the method static we can simple call by objName.StaticMethodName()
  

  Scenario: Calling  non-static Java Method
    * def javaClassObj = Java.type('com.noorteck.qa.features.APIUtil')
    * def result = new javaClassObj().converToUpper('john cena')
    * print result


  Scenario: Calling static Java Method
    * def javaClassObj = Java.type('com.noorteck.qa.features.APIUtil')
    * def result = javaClassObj.duplicate('FunDay')
    * print result

    
#Scenario: Calling Java Void Method
 #* def javaClassObj = Java.type('com.noorteck.qa.features.APIUtil')
 #* def result = javaClassObj.getResult('yes', 'no')
 #* print result