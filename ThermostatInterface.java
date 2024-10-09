package com.vendor;

/**
 * The ThermostatInterface provides methods to set and get the temperature
 * for thermostat implementations.
 */
public interface ThermostatInterface {
    /**
     * Sets the desired temperature for the thermostat.
     *
     * @param temperature the temperature to be set
     */
    void setTemperature(double temperature);

    /**
     * Retrieves the current temperature set on the thermostat.
     *
     * @return the current temperature
     */
    double getTemperature();
}
