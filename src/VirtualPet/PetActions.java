package VirtualPet;
// abstract behaviors that the pet can perform. the pet can implement this interface to perform different actions
// such as eating, drinking, and playing.
public interface PetActions {
        void feed();
        void drink();
        void play();
}