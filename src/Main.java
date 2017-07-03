
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {


        // Dette er filen hvorfra vi tester jeres resultater.
        // I skal ikke kigge i den - det er snyd, for man kan finde svarene her.





























































		// Opg 1
		Exercices types = new Exercices();

		String output = changeOut(types, "print");
		System.out.println(response(1, output.length() > 0) + " " + output);

		// Opg 2
		HashMap<Class<?>, Integer> seen = new HashMap<Class<?>, Integer>();
		seen.put(int.class, 0); seen.put(double.class, 0); seen.put(char.class, 0); seen.put(boolean.class, 0); seen.put(String.class, 0);
		if(types.getClass().getDeclaredFields().length > 4) {
			for(Field f : types.getClass().getDeclaredFields()) {
				try {
					if((f.getType() == int.class && f.getInt(types) == 10)
							|| (f.getType() == double.class && f.getDouble(types) == 10.6)
							|| (f.getType() == char.class && f.getChar(types) == 'a')
							|| (f.getType() == boolean.class && f.getBoolean(types) == true)
							|| (f.getType() == String.class && f.get(types).equals("UNF"))) {
						seen.replace(f.getType(), seen.get(f.getType()) + 1);
					}
				} catch(IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(response(2, !seen.containsValue(0)));


		// Opg 3
		System.out.println(response(3, types.expression(13, 66, 4) == 849 && types.expression(43, 22, 5) == 908));


		// Opg 4
		System.out.println(response(4, types.bmi(70, 1.8) == 70/(1.8*1.8) && types.bmi(60, 1.5) == 60/(1.5*1.5)));


		// Opg 5.1
		System.out.println(response(5.1, types.bouncerDK(20) && !types.bouncerDK(16)));

		// Opg 5.2
		System.out.println(response(5.2, !types.bouncerUSA(20) && types.bouncerUSA(40)));

		// Opg 5.3
		System.out.println(response(5.3, types.groupDancing(40, 99, 300000) && !types.groupDancing(30, 17, 20)));


		// Opg 6.1
		System.out.println(response(6.1, !types.flotBouncer1(12.3, false)
				&& types.flotBouncer1(9.0, true)
				&& types.flotBouncer1(19.5, false)
				&& types.flotBouncer1(18.0, false)
				&& !types.flotBouncer1(17.999, false)
				&& types.flotBouncer1(60.7, true)));


		// Opg 6.2
		System.out.println(response(6.2, !types.flotBouncer2(30.0, false)
				&& !types.flotBouncer2(40.0, true)
				&& types.flotBouncer2(2.4, true)
				&& types.flotBouncer2(39.99999999, true)
				&& !types.flotBouncer2(50.6, false)));

		// Opg 6.3
		System.out.println(response(6.3, types.flotBouncer3(16, true)
				&& !types.flotBouncer3(17, false)
				&& !types.flotBouncer3(15.99, true)
				&& !types.flotBouncer3(25, false)
				&& !types.flotBouncer3(50, true)
				&& types.flotBouncer3(49.999, false)
				&& types.flotBouncer3(20, false)
				&& types.flotBouncer3(17, true)));


		// Opg7
		System.out.println(response(7, types.cashExchange(5000000, "DKK", "EUR") == 5000000 * 13.4476541 / 100
				&& types.cashExchange(types.cashExchange(5000000, "DKK", "EUR"), "EUR", "DKK") == 5000000
				&& types.cashExchange(23, "USD", "EUR") == 23 * 87.535014 / 100
				&& types.cashExchange(types.cashExchange(23, "USD", "EUR"), "EUR", "USD") == 23
				&& types.cashExchange(78.64, "USD", "DKK") == 78.64 * 100 / 15.3626
				&& types.cashExchange(types.cashExchange(78.64, "USD", "DKK"), "DKK", "USD") == 78.64
				&& types.cashExchange(0.33425324, "DKK", "DKK") == 0.33425324
				&& types.cashExchange(36436, "EUR", "EUR") == 36436
				&& types.cashExchange(436.33425324, "USD", "USD") == 436.33425324));


		// Opg8
		System.out.println(response(8, types.factorial(20) == 2432902008176640000L
				&& types.factorial(10) == 3628800));
	}



	public static String response(int opg, boolean bool) {
		if(bool) {
			return "Exercise " + opg + " is correct!";
		} else {
			return "Exercise " + opg + " is wrong.";
		}
	}

	public static String response(double opg, boolean bool) {
		if(bool) {
			return "Exercise " + opg + " is correct!";
		} else {
			return "Exercise " + opg + " is wrong.";
		}
	}


	public static String changeOut(Object instance, String method) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream stdout = System.out;
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		try {
			instance.getClass().getMethod(method).invoke(instance);
		} catch(NoSuchMethodException e) {
			e.printStackTrace();
		} catch(InvocationTargetException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		System.setOut(stdout);
		String output = new String(baos.toByteArray(), StandardCharsets.UTF_8).replace("\n", "");
		return output;
	}

}
