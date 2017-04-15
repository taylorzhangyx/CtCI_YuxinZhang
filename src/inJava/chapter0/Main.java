package inJava.chapter0;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	class Animal{
	    public int type;//1-dog or 2-cat
	    public String name;

	    Animal(int type, String name){
	        this.type = type;
	        this.name = name;
	    }
	}
	class Animal_Shelter<Animal> {
	    LinkedList<Animal> list = new LinkedList<>();

	    public void enqueue(Animal animal) {
	        list.add(animal);
	    }

	    public Animal dequeueAny() {
	        return list.remove();
	    }

	    public Animal dequeueDog() {
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).type == 1) {
	                return list.remove(i);
	            }
	        }
	        return null;
	    }

	    public Animal dequeueCat(){
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).type == 2) {
	                return list.remove(i);
	            }
	        }
	        return null;
	    }
	}


}
