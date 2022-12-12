package ss7.thuc_hanh.Animal_and_interface_Edible;
public class Animal {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        for (Animal animals : animal) {
            animals.makeSound();
        }
    }

    private void makeSound() {

    }
}

