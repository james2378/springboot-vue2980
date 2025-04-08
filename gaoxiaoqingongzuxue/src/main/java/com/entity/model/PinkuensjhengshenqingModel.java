package com.entity.model;

import com.entity.PinkuensjhengshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 贫困生申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PinkuensjhengshenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String pinkuensjhengshenqingName;


    /**
     * 证明文件
     */
    private String pinkuensjhengshenqingFile;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请学生
     */
    private Integer yonghuId;


    /**
     * 申请结果
     */
    private Integer pinkuensjhengshenqingYesnoTypes;


    /**
     * 原因
     */
    private String pinkuensjhengshenqingYesnoText;


    /**
     * 假删
     */
    private Integer newsDelete;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getPinkuensjhengshenqingName() {
        return pinkuensjhengshenqingName;
    }


    /**
	 * 设置：标题
	 */
    public void setPinkuensjhengshenqingName(String pinkuensjhengshenqingName) {
        this.pinkuensjhengshenqingName = pinkuensjhengshenqingName;
    }
    /**
	 * 获取：证明文件
	 */
    public String getPinkuensjhengshenqingFile() {
        return pinkuensjhengshenqingFile;
    }


    /**
	 * 设置：证明文件
	 */
    public void setPinkuensjhengshenqingFile(String pinkuensjhengshenqingFile) {
        this.pinkuensjhengshenqingFile = pinkuensjhengshenqingFile;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：申请学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请结果
	 */
    public Integer getPinkuensjhengshenqingYesnoTypes() {
        return pinkuensjhengshenqingYesnoTypes;
    }


    /**
	 * 设置：申请结果
	 */
    public void setPinkuensjhengshenqingYesnoTypes(Integer pinkuensjhengshenqingYesnoTypes) {
        this.pinkuensjhengshenqingYesnoTypes = pinkuensjhengshenqingYesnoTypes;
    }
    /**
	 * 获取：原因
	 */
    public String getPinkuensjhengshenqingYesnoText() {
        return pinkuensjhengshenqingYesnoText;
    }


    /**
	 * 设置：原因
	 */
    public void setPinkuensjhengshenqingYesnoText(String pinkuensjhengshenqingYesnoText) {
        this.pinkuensjhengshenqingYesnoText = pinkuensjhengshenqingYesnoText;
    }
    /**
	 * 获取：假删
	 */
    public Integer getNewsDelete() {
        return newsDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setNewsDelete(Integer newsDelete) {
        this.newsDelete = newsDelete;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
