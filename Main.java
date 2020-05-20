package lession17;

/**
 * The Main class to work whith internal class
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Integer[] array = new Integer[20];
		System.out.println("Початковий масив: ");

		for (int i = 0; i < 20; i++) {
			array[i] = r.nextInt(100);
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		System.out.println("Вивід з початку до кінця, непарні замінено на 0 ");
		Collection c = new Collection(array);
		Iterator runNext = c.returnNext();
		while (runNext.hasNext()) {
			runNext.next();
		}

		System.out.println();
		System.out.println("Вивід з кінця на початок через одну ");

		Iterator runBack = c.returnBack();
		while (runBack.hasNext()) {
			runBack.next();
		}
		System.out.println();
		System.out.println("Вивід з кінця на початок кожен третій тільки непарні ");
		Iterator runBack2 = c.anonim();
		while (runBack2.hasNext()) {
			runBack2.next();
		}

		System.out.println();
		System.out.println("Вивід з початку кожен пятий якщо парний то - 100 ");
		Collection.locals();

		System.out.println();
		System.out.println("Вивід з початку кожен другий якщо парний то зробити непарним ");
		Collection.staticc();

	}
}
