package com.ux.strategy.context;

import com.ux.strategy.Istrategy.PublicTransportStrategy;
import com.ux.strategy.Istrategy.RoadStrategy;
import com.ux.strategy.Istrategy.RoutesStrategy;
import com.ux.strategy.Istrategy.WalkingStrategy;

public class Navigator {

    public static void main(String[] args) {

        RoutesStrategy strategy = new PublicTransportStrategy();

        strategy.buildRoute("Xalapa", "CDMX");

        strategy = new WalkingStrategy();
        strategy.buildRoute("Johan Sebastian Bach", "Paseo de los fresnos");

        strategy = new RoadStrategy();
        strategy.buildRoute("Xalapa", "Veracruz");


    }

}
