/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_brest;

/**
 *
 * @author elois
 */
public class Convertisseur {
    
    public int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public float CelsiusVersKelvin(float tCelsius) {
        nbConversions++;
        return tCelsius + 273;
    }

    public float KelvinVersCelsius(float tKelvin) {
        nbConversions++;
        return tKelvin - 273;
    }

    public float FarenheitVersCelsius(float tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5 / 9;
    }

    public float CelsiusVersFarenheit(float tCelsius) {
        nbConversions++;
        return tCelsius * 9 / 5 + 32;
    }

    public float FarenheitVersKelvin(float tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5 / 9 + 273;
    }

    public float KelvinVersFarenheit(float tKelvin) {
        nbConversions++;
        return (tKelvin - 273) * 9 / 5 + 32;
    }

    @Override
    public String toString() {
        return "Nombre de conversions " + nbConversions;
    }
}
