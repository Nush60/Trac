package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Main {

    public static void main(String[] args) {
        City dnepr = new City();
        dnepr.setName("Dnepr");
        dnepr.setPopulation(1_000_000);

        City kiev = new City();
        kiev.setName("Kiev");
        kiev.setPopulation(3_000_000);

        City lviv = new City();
        lviv.setName("Lviv");
        lviv.setPopulation(700_000);

        City varshava = new City();
        varshava.setName("Varshava");
        varshava.setPopulation(2_000_000);

        Route route = new Route();
        route.setDistance(500);
        route.setFromCity(dnepr);
        route.setToCity(kiev);

        Route route2 = new Route();
        route2.setDistance(500);
        route2.setFromCity(kiev);
        route2.setToCity(dnepr);

        Route route3 = new Route();
        route3.setDistance(900);
        route3.setFromCity(dnepr);
        route3.setToCity(lviv);

        Route route4 = new Route();
        route4.setDistance(900);
        route4.setFromCity(lviv);
        route4.setToCity(dnepr);

        Route route5 = new Route();
        route5.setDistance(1300);
        route5.setFromCity(dnepr);
        route5.setToCity(varshava);

        Track track = new Track();
        track.setName("Volvo");
        track.setTank(100);
        track.setConsumption(10);
        track.setCurrentCity(dnepr);


        System.out.println(track);
        System.out.println("Track moved: ");
        track.move(route);
        track.filling(route);
        track.sumDistance(route);
        System.out.println(track);
    }

}
