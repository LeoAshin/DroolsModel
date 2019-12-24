package me.leoashin.model;

import java.io.Serializable;

/**
 * @author leoashin
 * Create at 2019/12/24
 */
public class GraphicInfo implements Serializable {

    private static final long serialVersionUID = 3247167895152615117L;

    private String id;
    private Double x;
    private Double y;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
