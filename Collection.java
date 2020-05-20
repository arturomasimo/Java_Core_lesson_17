package lession17;

public class Collection {
	private static Number[] array;

	public Collection(Number[] arrayIn) {
		Collection.array = arrayIn;
	}

	public class RunNext implements Iterator {
		private int length = 0;

		@Override
		public boolean hasNext() {
			if (length < array.length)
				return true;
			else
				return false;
		}

		@Override
		public void next() {
			int poz = length;
			length = length + 1;
			if ((Integer) (array[poz]) % 2 == 1)
				System.out.print(0 + " ");
			// array[poz]=0;
			else
				System.out.print(array[poz] + " ");
		}
	}

	public RunNext returnNext() {
		return new RunNext();
	}

	public class RunBack implements Iterator {
		private int length = array.length - 1;

		@Override
		public boolean hasNext() {
			if (length >= 0)
				return true;
			else
				return false;
		}

		@Override
		public void next() {
			int poz = length;
			length = length - 2;
			System.out.print(array[poz] + " ");
		}

	}

	public RunBack returnBack() {
		return new RunBack();
	}

	Iterator anonim() {
		return new Iterator() {
			private int length = array.length - 1;

			@Override
			public boolean hasNext() {
				if (length >= 0)
					return true;
				else
					return false;
			}

			@Override
			public void next() {
				int poz = length;
				length = length - 3;
				if ((Integer) array[poz] % 2 == 1) {
					System.out.print(array[poz] + " ");
				}

			}
		};

	}

	private Iterator local() {
		class Locall implements Iterator {
			private int length = 0;

			@Override
			public boolean hasNext() {
				if (length < array.length)
					return true;
				else
					return false;
			}

			@Override
			public void next() {
				int poz = length;
				length = length + 5;
				if ((Integer) (array[poz]) % 2 == 0) {
					int tmp = (Integer) (array[poz]) - 100;
					System.out.print(tmp + " ");
					// array[poz]=0;
				}
			}
		}
		return new Locall();
	}

	public static void locals() {
		Collection c = new Collection(array);
		Iterator runBack3 = c.local();
		while (runBack3.hasNext()) {
			runBack3.next();
		}

	}

	private static class Staticc implements Iterator {
		private int length = 0;

		@Override
		public boolean hasNext() {
			if (length < array.length)
				return true;
			else
				return false;
		}

		@Override
		public void next() {
			int poz = length;
			length = length + 2;
			if ((Integer) (array[poz]) % 2 == 0) {
				int tmp = (Integer) (array[poz]) - 1;
				System.out.print(tmp + " ");
				// array[poz]=0;
			}
		}

	}

	public Staticc runStatic() {
		return new Staticc();
	}

	public static void staticc() {
		Collection c = new Collection(array);
		Iterator runBack4 = c.runStatic();
		while (runBack4.hasNext()) {
			runBack4.next();
		}

	}

}
