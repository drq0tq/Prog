package RendelesDecorator
        ;

import RendelesDecorator.RendelesDecorator;
import TermekFactory.Retes;
import TermekFactory.RetesFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RetesSutes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RetesFactory factory = new RetesFactory();
        List<Retes> tetelek = new ArrayList<>();

        do {

            System.out.println("Kérem válasszon rétest! \nVálasztható rétesek:");
            System.out.println("a) makos\nb) turos \nc) almas");

            String iz = br.readLine();


            while (!(iz.equals("makos") || iz.equals("turos") || iz.equals("almas"))) {
                System.out.println("Kérem próbálja meg újból!");
                iz = br.readLine();
            }


            Retes retes = factory.createRetes(iz);

       tetelek.add(retes);

            System.out.println("Szeretne még rendelni valamit?\nHa szeretne még rendelni kérem írja be hogy igen.");

        }while(br.readLine().equals("igen"));

       Rendeles rendel = new AlapAr(tetelek);

        System.out.println("Kérem válasszon hol kívánja elfogyasztani a rétest! A választott lehetőség betűjelét írja be (a/b)! \nVálasztható opciók:");
        System.out.println("a) elvitel\nb) helyben fogyasztás ");
        String fogyaszt = br.readLine();

        while (!(fogyaszt.equals("a") || fogyaszt.equals("b") )) {
            System.out.println("Kérem próbálja meg újból!");
            fogyaszt = br.readLine();
        }
        System.out.println("Kérem válasszon melyen kedvezmény szeretne felhasználni! A választott lehetőség betűjelét írja be! \nVálasztható opciók:");
        System.out.println("a) 10% kedvezmény \nb) 20% kedvezmény \nc) 500Ft kedvezmény \nd) nem használok fel kedvezményt");
        String kedvezmeny = br.readLine();

        while (!(kedvezmeny.equals("a") || kedvezmeny.equals("b") || kedvezmeny.equals("c") || kedvezmeny.equals("d") )) {
            System.out.println("Kérem próbálja meg újból!");
            kedvezmeny = br.readLine();
        }

switch (kedvezmeny) {
    case "a": rendel = new Kedvezmeny10(rendel);
        break;
    case "b": rendel = new Kedvezmeny20(rendel);
        break;
    case "c": rendel = new Kedvezmeny500(rendel);
        break;
}
    if (fogyaszt.equals("a")) {
        rendel = new PluszKtgSzallitas(rendel);
        System.out.println(  rendel.getAr() +"Ft");
    }
    else {
        System.out.println( rendel.getAr() +"Ft");
    }

        System.out.println("Köszönjük a rendelését!");



    }
}