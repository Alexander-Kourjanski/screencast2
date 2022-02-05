import static org.junit.Assert.*;

import org.junit.*;

public class screencast1tester {
    @Test
    public void testsumarg(){
        assertEquals(6, screencast1.sumargs(2, 3));
    }
}

//Windows
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" screencast1tester.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore screen1ast1tester

//Linux
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar Screencast1.java Screencast1Tester.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore screenCastTester


//Login
//ssh cs15lwi22aio@ieng6.ucsd.edu

//Repository Transfer
//scp -r . cs15lwi22aio@ieng6.ucsd.edu:~/CSE_15L_ScreenCast1
//scp -r . cs15lwi22aio@ieng6.ucsd.edu:~/lib

//Git Clone
//git clone link
