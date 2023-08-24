import java.util.LinkedList;

public class Shelter {
    Shelter(){}
    public LinkedList<Animal> animalQueue = new LinkedList<>();

    public void enqueue(Animal animal){
        animalQueue.add(animal);
    }

    public void dequeueAny(){
        animalQueue.poll(); //removes first element in the queue
    }

    public void dequeueDog(){
        for(Animal a : animalQueue){
            if(a instanceof Dog){
                animalQueue.remove(a);
                break;
            }
        }
    }

    public void dequeueCat(){
        for(Animal a : animalQueue){
            if(a instanceof Cat){
                animalQueue.remove(a);
                break;
            }
        }
    }

}
