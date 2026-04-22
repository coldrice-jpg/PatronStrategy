package com.ux.strategy.Istrategy;

public class PublicTransportStrategy implements RoutesStrategy {

    @Override
    public void buildRoute(String origin, String destination) {

        System.out.println("Calculamos ruta transporte publico origen " + origin + "destino " + destination);

    }
}