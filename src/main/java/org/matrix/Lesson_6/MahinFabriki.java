package org.matrix.Lesson_6;

public class MahinFabriki {

    public static void main(String[] args) {

        SedanMashin skodaMashini = new SedanMashin();
        skodaMashini.setTypeOfEngine("V16");
        skodaMashini.setTypeOfVehicle("sport");
        skodaMashini.setVolumeOfEngine(5);

        SedanMashin toyota = new SedanMashin();
        toyota.setTypeOfEngine("Dizel");
        toyota.setTypeOfVehicle("Family Car");
        toyota.setVolumeOfEngine(2);

        YukMashin scania = new YukMashin();
        scania.setTypeOfEngine("Dizel");
        scania.setTypeOfVehicle("Truck");
        scania.setVolumeOfEngine(12);

    }

}
