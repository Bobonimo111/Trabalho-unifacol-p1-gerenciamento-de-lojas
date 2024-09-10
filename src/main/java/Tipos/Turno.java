package Tipos;

public enum Turno {

    MANHA("05:00 - 14:00"),
    TARDE("13:30 - 21:30"),
    MADRUGADA("21:00 - 06:00");

    public final String horario;

    Turno(String horario) {
        this.horario = horario;
    }
}
