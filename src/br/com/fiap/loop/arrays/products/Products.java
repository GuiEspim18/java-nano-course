package br.com.fiap.loop.arrays.products;

import java.io.Serial;
import java.io.Serializable;

public class Products implements Serializable {

    @Serial private static final long serialVersionUID = 1L;

    private String type;
    private String description;
    private float value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Produto [tipo= " + this.type + ", descrição= " + this.description + ", valor= " + this.value + "]";
    }
}
