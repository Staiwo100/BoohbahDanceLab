public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah Boohbah1 = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        Boohbah Boohbah2 = new Boohbah("Humbah", "Wiggle Wiggle");
        Boohbah Boohbah3 = new Boohbah("Jumbah", "Twirl of Joy");

        Boohbah[] arrayOfBoohbahs = {Boohbah1, Boohbah2, Boohbah3};
        DanceRoutine boohbahA = new DanceRoutine(arrayOfBoohbahs);

        System.out.println("Original Routine: ");
        System.out.println(boohbahA.buildRoutine());
        System.out.println("Modified Routine: ");
        System.out.println(boohbahA.modifyRoutine());
    }
}
