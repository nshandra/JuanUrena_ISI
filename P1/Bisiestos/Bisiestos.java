import java.util.*;

public class Bisiestos {
	public static boolean main(int año) {
	     //---> Añadida gestión de año negativo
	     if(año < 0) throw new IllegalArgumentException();
	     if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
	         return true;
	     }else{
	         return false;
	     }
	}
}
