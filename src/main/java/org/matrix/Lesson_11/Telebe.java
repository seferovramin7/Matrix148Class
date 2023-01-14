package org.matrix.Lesson_11;

public class Telebe {
     String university = "Quincy";
    int siraNomresi;
    String ad;

    public Telebe(int siraNomresi, String ad) {
        this.siraNomresi = siraNomresi;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Telebe{" +
                "university='" + university + '\'' +
                ", siraNomresi=" + siraNomresi +
                ", ad='" + ad + '\'' +
                '}';
    }
}

class test {
    public static void main(String[] args) {
        Telebe Fuad = new Telebe(1500, "Fuad");
        Telebe max = new Telebe(1501, "Max");

        System.out.println(max.toString());
    }
}