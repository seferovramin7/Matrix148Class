package org.matrix.Lesson_5;

public class Shagird {
    int nomresi;
    String adi;

    public Shagird(int nomresi, String adi) {
        this.nomresi = nomresi;
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "Shagird{" +
                "nomresi=" + nomresi +
                ", adi='" + adi + '\'' +
                '}';
    }
}
