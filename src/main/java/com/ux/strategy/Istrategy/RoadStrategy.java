package com.ux.strategy.Istrategy;

public class RoadStrategy implements RoutesStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("Calculamos ruta origin " + origin + "destino " + destination);

    }
}
