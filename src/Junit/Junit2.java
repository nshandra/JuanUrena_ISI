package Junit;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



public class Junit2 
{
int a=2000;
int b=2059;
int c=2012;
int d=1900;

@Test public void bisiestoTest()
{
	assertTrue("Si bisiesto",Junit.main(a));
	assertFalse("No bisiesto",Junit.main(b));
	assertTrue("Si bisiesto",Junit.main(c));
	assertFalse("No bisiesto",Junit.main(d));
}
	

}
