abstract class TravelToHome{
    // Template method
    
    public final void travel() {
        packBags(); //step 1
        bookTickets(); //step 2
        catchBus(); //step 3
        reachHome(); //step 4
    }

    abstract void packBags();
    abstract void bookTickets();
    abstract void catchBus();
    abstract void reachHome();

}

class BusTravel extends TravelToHome {
    @Override
    void packBags() {
        System.out.println("Packing bags for bus travel.");
    }

    @Override
    void bookTickets() {
        System.out.println("Booking bus tickets.");
    }

    @Override
    void catchBus() {
        System.out.println("Catching the bus to home.");
    }

    @Override
    void reachHome() {
        System.out.println("Reached home by bus.");
    }   
}


class TrainTravel extends TravelToHome {
    @Override
    void packBags() {
        System.out.println("Packing bags for train travel.");
    }

    @Override
    void bookTickets() {
        System.out.println("Booking train tickets.");
    }

    @Override
    void catchBus() {
        System.out.println("Catching the train to home.");
    }

    @Override
    void reachHome() {
        System.out.println("Reached home by train.");
    }
}


//create main class TemplateMethodPattern
public class TemplateMethodPattern {
    public static void main(String[] args) {
        // Create instances of TravelToHome
        TravelToHome busTravel = new BusTravel();
        TravelToHome trainTravel = new TrainTravel();

        // Uncomment the following lines to test TrainTravel
        // System.out.println("\nTrain Travel:");
        trainTravel.travel();

        // Call the travel method
        System.out.println("Bus Travel:");
        busTravel.travel();      
    
    }         
}



interface A {
    int a = 5;
}

interface B {
    int b = 10;
}

class C implements A, B {
    int c = 15;


}