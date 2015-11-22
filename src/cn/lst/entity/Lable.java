package cn.lst.entity;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class Lable implements Serializable {

	private static final long serialVersionUID = -5681713898115183210L;

	/** identifier field */
    private Integer id;

    /** persistent field */
    private String lable;

    /** full constructor */
    public Lable(Integer id, String lable) {
        this.id = id;
        this.lable = lable;
    }

    /** default constructor */
    public Lable() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLable() {
        return this.lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

}
