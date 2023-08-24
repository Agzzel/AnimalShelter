import java.util.LinkedList;

public class Shelter {
    Shelter(){}
    public LinkedList<Animal> animalQueue;

    void enqueue(Animal animal){
        animalQueue.add(animal);
    }

    void dequeueAny(){
        animalQueue.poll(); //removes first element in the queue
    }
}
