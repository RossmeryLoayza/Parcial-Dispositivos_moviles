package com.example.applicationparcial;

public class Preguntas {

    private String preguntasT [];

    {
        preguntasT = new String[]{
                "El resultado de 2+2 es ___",
                "Todo número multiplicado por 0 da",
                "El resultado de 3+4*2 es ___",
                "¿Quién es el padre de las matemáticas?",
                "¿Cuál no es una rama de las matemáticas?",
                "El resultado de -3+(-8) es ___",
                "¿Cual es el lado más largo de un triángulo rectángulo?"
        };
    }

    private String respuestas [][];

    {
        respuestas = new String[][]{
                {"4", "6" , "8"},
                {"El mismo número", "0" , "1"},
                {"14", "11" , "N.A."},
                {"Pitágoras", "Descartes" , "Euclides"},
                {"Geometrís", "Estadística" , "Mecánica"},
                {"5", "-11" , "11"},
                {"Angulo", "Hipotenusa" , "Lado"}
        };
    }

    private String respuestas_correctas [];

    {
        respuestas_correctas = new String[]{
            "4", "El mismo número", "11", "Pitágoras", "Mecánica", "-11", "Hipotenusa"
        };
    }

    public String get_preg(int a){
        String preg = preguntasT[a];
        return preg;
    }

    public String get_opcion1(int a){
        String res = respuestas[a][0];
        return res;
    }

    public String get_opcion2(int a){
        String res= respuestas[a][1];
        return res;
    }

    public String get_opcion3(int a){
        String res = respuestas[a][2];
        return res;
    }

    public String get_respuesta_correcta(int a){
        String rc = respuestas_correctas[a];
        return rc;
    }
}
