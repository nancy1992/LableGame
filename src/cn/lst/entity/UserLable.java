package cn.lst.entity;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class UserLable implements Serializable {

	private static final long serialVersionUID = -2643222238806706085L;

	/** identifier field */
    private Integer id;

    /** persistent field */
    private String lable;

    /** full constructor */
    public UserLable(Integer id, String lable) {
        this.id = id;
        this.lable = lable;
    }

    /** default constructor */
    public UserLable() {
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
