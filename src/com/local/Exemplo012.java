package com.local;

import java.time.LocalTime;

public class Exemplo012 {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(agora);

        System.out.println(maisUmaHora);
    }
}
