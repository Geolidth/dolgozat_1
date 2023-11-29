/*
* File: Controller.java
* Author: Csajbók-Reményi László
* Copyright: 2023, Csajbók-Reményi László
* Group: Szoft II/1/E
* Date: 2023-11-29
* Github: https://github.com/Geolidth/dolgozat_1.git
* Licenc: GNU GPL
*/

public class Controller implements Controllable{
    public void Controller(){
        initComponents();
    }

    public void initComponents(){
        start();
        stop();
        restart();
    }
    @Override
    public void start() {
        System.out.println("Működik a start() metódus!");
    }

    @Override
    public void stop() {
        System.out.println("Működik a stop() metódus!");
    }

    @Override
    public void restart() {
        System.out.println("Működik a restart() metódus!");
    }
    
}
