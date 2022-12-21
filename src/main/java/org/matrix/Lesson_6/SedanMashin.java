package org.matrix.Lesson_6;

public class SedanMashin {

    String typeOfVehicle;
    String typeOfEngine;
    int volumeOfEngine;

    public SedanMashin(String typeOfVehicle, String typeOfEngine, int volumeOfEngine) {
        this.typeOfVehicle = typeOfVehicle;
        this.typeOfEngine = typeOfEngine;
        this.volumeOfEngine = volumeOfEngine;
    }

    public SedanMashin(String typeOfVehicle, String typeOfEngine) {
        this.typeOfVehicle = typeOfVehicle;
        this.typeOfEngine = typeOfEngine;
    }

    public SedanMashin(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public SedanMashin() {
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public int getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(int volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    @Override
    public String toString() {
        return "tip " + typeOfVehicle + "\n"  +
                "motor " + typeOfEngine + "\n" +
                "hecm " + volumeOfEngine ;
    }
}
