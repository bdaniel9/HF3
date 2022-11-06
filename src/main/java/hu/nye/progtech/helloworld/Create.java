package hu.nye.progtech.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Create implements Interfacee {
    String nev;
    String nyelv;
    public void bekeres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a neved: ");
        nev = scanner.nextLine();

        System.out.println("Add meg a nyelvet: (hun,eng,haw,ger)");
        nyelv = scanner.nextLine();
    }
    public void kiiratas(){
        List nyelv_lista = new ArrayList();
        nyelv_lista.add("hun");
        nyelv_lista.add("eng");
        nyelv_lista.add("haw");
        nyelv_lista.add("ger");

        List koszontes_lista = new ArrayList();
        koszontes_lista.add("Szia");
        koszontes_lista.add("Hello");
        koszontes_lista.add("Aloha");
        koszontes_lista.add("Hallo");

        for (int i=0;i<nyelv_lista.size();i++){
            if(nyelv.equals(nyelv_lista.get(i))){
                System.out.println(koszontes_lista.get(i)+" "+nev+"!");
            }
            else{
                throw new RuntimeException("Ismeretlen nyelv.\nSzia "+nev+"!");
            }
        }
        }
    }

