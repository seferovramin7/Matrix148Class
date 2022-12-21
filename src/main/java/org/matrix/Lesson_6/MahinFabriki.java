package org.matrix.Lesson_6;

public class MahinFabriki {

    int b;
    static int c;

    public static void main(String[] args) {

        int a;

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

        System.out.println(toyota.getVolumeOfEngine());


        SedanMashin volvo = new SedanMashin("SUV", "V8", 2);
        System.out.println(volvo);

        SedanMashin jeep = new SedanMashin("SUV", "V8");

        SedanMashin gmc = new SedanMashin("SUV");



    }
}
