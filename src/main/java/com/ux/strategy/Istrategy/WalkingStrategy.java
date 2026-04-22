package com.ux.strategy.Istrategy;

public class WalkingStrategy implements RoutesStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("Calculamos ruta carretera origen " + origin + "destino " + destination);

    }
}