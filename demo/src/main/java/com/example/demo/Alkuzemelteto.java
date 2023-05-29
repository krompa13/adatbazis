package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class Alkuzemelteto {
        @Id
        private String Alk_ID;
        private String name;
        private String hiba;
        private String birthday;
        private String laptopszam;

        public Alkuzemelteto(String name, String hiba, String birthday, String laptopszam) {
            this.name = name;
            this.hiba = hiba;
            this.birthday = birthday;
            this.laptopszam=laptopszam;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHiba() {
        return hiba;
    }

    public void setHiba(String hiba) {
        this.hiba = hiba;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLaptopszam() {
        return laptopszam;
    }

    public void setLaptopszam(String laptopszam) {
        this.laptopszam = laptopszam;
    }
}
