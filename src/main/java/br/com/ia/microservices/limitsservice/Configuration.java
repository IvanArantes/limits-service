package br.com.ia.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This bean is responsable for binding the value from the bootstrap.properties into its properties.
 */
@Component
@ConfigurationProperties("limits-service") //This tells spring where to find the configuration on bootstrap.properties by
//its prefix
public class Configuration {

    private int minimum;
    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
