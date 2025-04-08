package com.entity.vo;

import com.entity.PinkuensjhengshenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 贫困生申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("pinkuensjhengshenqing")
public class PinkuensjhengshenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "pinkuensjhengshenqing_name")
    private String pinkuensjhengshenqingName;


    /**
     * 证明文件
     */

    @TableField(value = "pinkuensjhengshenqing_file")
    private String pinkuensjhengshenqingFile;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 申请结果
     */

    @TableField(value = "pinkuensjhengshenqing_yesno_types")
    private Integer pinkuensjhengshenqingYesnoTypes;


    /**
     * 原因
     */

    @TableField(value = "pinkuensjhengshenqing_yesno_text")
    private String pinkuensjhengshenqingYesnoText;


    /**
     * 假删
     */

    @TableField(value = "news_delete")
    private Integer newsDelete;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：标题
	 */
    public String getPinkuensjhengshenqingName() {
        return pinkuensjhengshenqingName;
    }


    /**
	 * 获取：标题
	 */

    public void setPinkuensjhengshenqingName(String pinkuensjhengshenqingName) {
        this.pinkuensjhengshenqingName = pinkuensjhengshenqingName;
    }
    /**
	 * 设置：证明文件
	 */
    public String getPinkuensjhengshenqingFile() {
        return pinkuensjhengshenqingFile;
    }


    /**
	 * 获取：证明文件
	 */

    public void setPinkuensjhengshenqingFile(String pinkuensjhengshenqingFile) {
        this.pinkuensjhengshenqingFile = pinkuensjhengshenqingFile;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申请学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请结果
	 */
    public Integer getPinkuensjhengshenqingYesnoTypes() {
        return pinkuensjhengshenqingYesnoTypes;
    }


    /**
	 * 获取：申请结果
	 */

    public void setPinkuensjhengshenqingYesnoTypes(Integer pinkuensjhengshenqingYesnoTypes) {
        this.pinkuensjhengshenqingYesnoTypes = pinkuensjhengshenqingYesnoTypes;
    }
    /**
	 * 设置：原因
	 */
    public String getPinkuensjhengshenqingYesnoText() {
        return pinkuensjhengshenqingYesnoText;
    }


    /**
	 * 获取：原因
	 */

    public void setPinkuensjhengshenqingYesnoText(String pinkuensjhengshenqingYesnoText) {
        this.pinkuensjhengshenqingYesnoText = pinkuensjhengshenqingYesnoText;
    }
    /**
	 * 设置：假删
	 */
    public Integer getNewsDelete() {
        return newsDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setNewsDelete(Integer newsDelete) {
        this.newsDelete = newsDelete;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
