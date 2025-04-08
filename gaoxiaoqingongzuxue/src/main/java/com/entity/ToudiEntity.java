package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 简历投递
 *
 * @author 
 * @email
 */
@TableName("toudi")
public class ToudiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ToudiEntity() {

	}

	public ToudiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 简历
     */
    @TableField(value = "jianli_id")

    private Integer jianliId;


    /**
     * 招聘
     */
    @TableField(value = "zhaopin_id")

    private Integer zhaopinId;


    /**
     * 申请表
     */
    @TableField(value = "zhaopin_file")

    private String zhaopinFile;


    /**
     * 审核结果
     */
    @TableField(value = "toudi_yesno_types")

    private Integer toudiYesnoTypes;


    /**
     * 审核原因
     */
    @TableField(value = "toudi_yesno_text")

    private String toudiYesnoText;


    /**
     * 投递时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：简历
	 */
    public Integer getJianliId() {
        return jianliId;
    }


    /**
	 * 获取：简历
	 */

    public void setJianliId(Integer jianliId) {
        this.jianliId = jianliId;
    }
    /**
	 * 设置：招聘
	 */
    public Integer getZhaopinId() {
        return zhaopinId;
    }


    /**
	 * 获取：招聘
	 */

    public void setZhaopinId(Integer zhaopinId) {
        this.zhaopinId = zhaopinId;
    }
    /**
	 * 设置：申请表
	 */
    public String getZhaopinFile() {
        return zhaopinFile;
    }


    /**
	 * 获取：申请表
	 */

    public void setZhaopinFile(String zhaopinFile) {
        this.zhaopinFile = zhaopinFile;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getToudiYesnoTypes() {
        return toudiYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setToudiYesnoTypes(Integer toudiYesnoTypes) {
        this.toudiYesnoTypes = toudiYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getToudiYesnoText() {
        return toudiYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setToudiYesnoText(String toudiYesnoText) {
        this.toudiYesnoText = toudiYesnoText;
    }
    /**
	 * 设置：投递时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：投递时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Toudi{" +
            "id=" + id +
            ", jianliId=" + jianliId +
            ", zhaopinId=" + zhaopinId +
            ", zhaopinFile=" + zhaopinFile +
            ", toudiYesnoTypes=" + toudiYesnoTypes +
            ", toudiYesnoText=" + toudiYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
