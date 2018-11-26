package Bisiestoest;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



public class bisiestotest 
{
int a=2000;
int b=2059;
int c=2012;
int d=1900;

@Test public void bisiestoTest()
{
	assertTrue("Si bisiesto",bisiesto.main(a));
	assertFalse("No bisiesto",bisiesto.main(b));
	assertTrue("Si bisiesto",bisiesto.main(c));
	assertFalse("No bisiesto",bisiesto.main(d));
}
	

}
