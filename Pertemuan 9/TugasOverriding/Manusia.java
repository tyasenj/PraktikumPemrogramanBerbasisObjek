package TugasOverriding;

public class Manusia {
    public void bernafas() {
        System.out.println("Manusia sedang bernafas");
    }

    public void makan() {
        System.out.println("Manusia sedang makan");
    }
}

class Mahasiswa extends Manusia {
    public void makan() {
        System.out.println("Mahasiswa sedang makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}

class Dosen extends Manusia {
    public void makan() {
        System.out.println("Dosen sedang makan");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur");
    }
}
