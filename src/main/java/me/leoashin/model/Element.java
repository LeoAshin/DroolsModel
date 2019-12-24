package me.leoashin.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @author leoashin
 * Create at 2019/12/24
 */
public class Element implements Serializable {

    private static final long serialVersionUID = 1683028172431920246L;

    protected String id;
    protected String name;
    protected GraphicInfo graphicInfo;
    protected String documentation;
    protected Map<String, String> otherAttributes;
}
