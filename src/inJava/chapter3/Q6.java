package inJava.chapter3;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Q6 {
	class Animal {
		int type;
		String name;
		int age;

		Animal(int type, String name, int age) {
			this.type = type;// 0 is dog, 1 is cat
			this.name = name;
			this.age = age;
		}
	}

	class Shelter {
		LinkedList<Animal> shelter = new LinkedList<Animal>();

		public void enqueue(Animal a) {
			shelter.offer(a);
		}

		public Animal dequeueAny() {
			if (shelter.isEmpty()) {
				throw new NoSuchElementException();
			} else
				return shelter.poll();
		}

		public Animal dequeueDog() {
			for (int i = 0; i < shelter.size(); i++) {
				if (shelter.get(i).type == 0)
					return shelter.remove(i);
			}
			throw new NoSuchElementException();
		}

		public Animal dequeueCat() {
			for (int i = 0; i < shelter.size(); i++) {
				if (shelter.get(i).type == 1)
					return shelter.remove(i);
			}
			throw new NoSuchElementException();
		}
	}
}
