package com.ux.strategy.context;

import com.ux.strategy.Istrategy.*;

import java.util.Scanner;

public class Navigator {

    public static void main(String[] args) {


        RouteStrategy strategy = new PublicTransportStrategy();

        strategy.buildRoute("Xalapa", "CDMX");


        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el tipo de navegacion: 1. Road. \n2. Public Transport. \n3. Walking. \n4. Flight");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                strategy = new RoadStrategy();
                break;
            case 2:
                strategy = new PublicTransportStrategy();
                break;
            case 3:
                strategy = new WalkingStrategy();
                break;
            case 4:
                strategy = new FlightStrategy();
                break;
            default:
                System.out.println("Opcion no valida, usando strategy por defecto.");
                strategy = new RoadStrategy();

        }


    }

}
