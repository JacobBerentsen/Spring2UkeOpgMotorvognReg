package com.example.spring2ukeopgmotorvognreg;

public class Bil {
        private String persnr, navn, adresse, bilnr, bilmerke, biltype;

        public Bil(String persnr, String navn, String adresse, String bilnr, String bilmerke, String biltype) {
            this.persnr = persnr;
            this.navn = navn;
            this.adresse = adresse;
            this.bilnr = bilnr;
            this.bilmerke = bilmerke;
            this.biltype = biltype;
        }

        public Bil() { }


        public String getPersnr() { return persnr; }
        public String getNavn() { return navn; }
        public String getAdresse() { return adresse; }
        public String getBilnr() {return bilnr; }
        public String getBilmerke() {return bilmerke;}
        public String getBiltype() {return biltype;}

        public void setPersnr(String persnr) {this.persnr = persnr;}
        public void setNavn(String navn) { this.navn = navn; }
        public void setAdresse(String adresse) { this.adresse = adresse; }

    public void setBilnr(String bilnr) {
        this.bilnr = bilnr;
    }

    public void setBilmerke(String bilmerke) {
        this.bilmerke = bilmerke;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }
}


