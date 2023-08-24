public class Main {
    public static void main(String[] args) {
        Shelter s = new Shelter();

        Dog d = new Dog("a");
        Dog d1 = new Dog("b");
        Cat c = new Cat("c");
        Cat c1 = new Cat("d");

        Animal[] ar = {d,d1,c,c1};
        for (Animal animal : ar) {
            s.enqueue(animal);
        }
        s.dequeueDog();
        s.dequeueAny();
        for(int i = 0; i < s.animalQueue.size(); i++){
            System.out.println(s.animalQueue.get(i));
        }

    }
}
