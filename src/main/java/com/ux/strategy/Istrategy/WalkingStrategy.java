package com.ux.strategy.Istrategy;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("Calculamos ruta carretera origen " + origin + "destino " + destination);

    }
}