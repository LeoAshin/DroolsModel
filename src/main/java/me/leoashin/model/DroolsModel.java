package me.leoashin.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leoashin
 * Create at 2019/12/19
 * 核心类
 */
public class DroolsModel implements Serializable {

    private static final long serialVersionUID = 5382191094656576003L;

    private List<Element> elements;
    private String droolsProcessName;
    private String droolsProcessId;
    private List<String> imports;

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public String getDroolsProcessName() {
        return droolsProcessName;
    }

    public void setDroolsProcessName(String droolsProcessName) {
        this.droolsProcessName = droolsProcessName;
    }

    public String getDroolsProcessId() {
        return droolsProcessId;
    }

    public void setDroolsProcessId(String droolsProcessId) {
        this.droolsProcessId = droolsProcessId;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }
}
