package com.ux.strategy.Istrategy;

public class FlightStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("Calculamos ruta de vuelo origen " + origin + "destino " + destination);

    }
}
