package com.entity.view;

import com.entity.PinkuensjhengshenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 贫困生申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("pinkuensjhengshenqing")
public class PinkuensjhengshenqingView extends PinkuensjhengshenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申请结果的值
		*/
		private String pinkuensjhengshenqingYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 身份
			*/
			private Integer shenfenTypes;
				/**
				* 身份的值
				*/
				private String shenfenValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public PinkuensjhengshenqingView() {

	}

	public PinkuensjhengshenqingView(PinkuensjhengshenqingEntity pinkuensjhengshenqingEntity) {
		try {
			BeanUtils.copyProperties(this, pinkuensjhengshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请结果的值
			*/
			public String getPinkuensjhengshenqingYesnoValue() {
				return pinkuensjhengshenqingYesnoValue;
			}
			/**
			* 设置： 申请结果的值
			*/
			public void setPinkuensjhengshenqingYesnoValue(String pinkuensjhengshenqingYesnoValue) {
				this.pinkuensjhengshenqingYesnoValue = pinkuensjhengshenqingYesnoValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 身份
					*/
					public Integer getShenfenTypes() {
						return shenfenTypes;
					}
					/**
					* 设置： 身份
					*/
					public void setShenfenTypes(Integer shenfenTypes) {
						this.shenfenTypes = shenfenTypes;
					}


						/**
						* 获取： 身份的值
						*/
						public String getShenfenValue() {
							return shenfenValue;
						}
						/**
						* 设置： 身份的值
						*/
						public void setShenfenValue(String shenfenValue) {
							this.shenfenValue = shenfenValue;
						}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}








}
