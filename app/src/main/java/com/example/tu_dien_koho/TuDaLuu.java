package com.example.tu_dien_koho;

public class TuDaLuu {
    private String tuGoc;
    private String nghia;

    public TuDaLuu(String tuGoc, String nghia) {
        this.tuGoc = tuGoc;
        this.nghia = nghia;
    }

    public String getTuGoc() {
        return tuGoc;
    }

    public void setTuGoc(String tuGoc) {
        this.tuGoc = tuGoc;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }
}
