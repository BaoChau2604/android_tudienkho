package com.example.tu_dien_koho;

import androidx.annotation.NonNull;

public class TuDaTra {
    private String tudatra;
    private String nghia;

    public TuDaTra(String tudatra, String nghia) {
        this.tudatra = tudatra;
        this.nghia = nghia;
    }

    public String getTudatra() {
        return tudatra;
    }

    public void setTudatra(String tudatra) {
        this.tudatra = tudatra;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
