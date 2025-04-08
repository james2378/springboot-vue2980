<template>
	<div>
		<el-form class="detail-form-content" ref="ruleForm" :model="ruleForm" label-width="80px">
			<el-row>
				<el-col :span="12">
					<el-form-item v-if="flag=='gongsi'" label='公司名称' prop="gongsiName">
						<el-input v-model="ruleForm.gongsiName" placeholder='公司名称' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='gongsi'" label='所在行业' prop="hanyeTypes">
						<el-select v-model="ruleForm.hanyeTypes" placeholder='请选择所在行业'>
							<el-option v-for="(item,index) in hanyeTypesOptions" v-bind:key="item.codeIndex"
								:label="item.indexName" :value="item.codeIndex">
							</el-option>
						</el-select>
					</el-form-item>
				</el-col>
				<el-col :span="12">
					<el-form-item v-if="flag=='gongsi'" label='联系方式' prop="gongsiPhone">
						<el-input v-model="ruleForm.gongsiPhone" placeholder='联系方式' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='gongsi'" label='邮箱' prop="gongsiEmail">
						<el-input v-model="ruleForm.gongsiEmail" placeholder='邮箱' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='gongsi'" label='营业执照展示' prop="gongsiPhoto">
						<file-upload tip="点击上传照片" action="file/upload" :limit="3" :multiple="true"
							:fileUrls="ruleForm.gongsiPhoto?ruleForm.gongsiPhoto:''" @change="gongsiPhotoUploadChange">
						</file-upload>
					</el-form-item>
				</el-col>
				<el-col :span="24">
					<el-form-item v-if="flag=='gongsi'" label="公司简介" prop="gongsiContent">
						<editor style="min-width: 200px; max-width: 600px;" v-model="ruleForm.gongsiContent"
							class="editor" action="file/upload">
						</editor>
					</el-form-item>
				</el-col>
				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label='用户姓名' prop="yonghuName">
						<el-input v-model="ruleForm.yonghuName" placeholder='用户姓名' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label='头像' prop="yonghuPhoto">
						<file-upload tip="点击上传照片" action="file/upload" :limit="3" :multiple="true"
							:fileUrls="ruleForm.yonghuPhoto?ruleForm.yonghuPhoto:''" @change="yonghuPhotoUploadChange">
						</file-upload>
					</el-form-item>
				</el-col>
				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label='用户手机号' prop="yonghuPhone">
						<el-input v-model="ruleForm.yonghuPhone" placeholder='用户手机号' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label='用户身份证号' prop="yonghuIdNumber">
						<el-input v-model="ruleForm.yonghuIdNumber" placeholder='用户身份证号' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label='邮箱' prop="yonghuEmail">
						<el-input v-model="ruleForm.yonghuEmail" placeholder='邮箱' clearable></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label='身份' prop="shenfenTypes">
						<el-select v-model="ruleForm.shenfenTypes" placeholder='请选择身份' disabled>
							<el-option v-for="(item,index) in shenfenTypesOptions" v-bind:key="item.codeIndex"
								:label="item.indexName" :value="item.codeIndex">
							</el-option>
						</el-select>
					</el-form-item>
				</el-col>
				<el-form-item v-if="flag=='users'" label="用户名" prop="username">
					<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
				</el-form-item>
				<el-col :span="12">
					<el-form-item v-if="flag=='yonghu'" label="性别" prop="sexTypes">
						<el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
							<el-option v-for="(item,index) in sexTypesOptions" v-bind:key="item.codeIndex"
								:label="item.indexName" :value="item.codeIndex">
							</el-option>
						</el-select>
					</el-form-item>
				</el-col>
				<el-col :span="24">
					<el-form-item>
						<el-button type="primary" @click="onUpdateHandler">修 改</el-button>
					</el-form-item>
				</el-col>
			</el-row>
		</el-form>
	</div>
</template>
<script>
	// 数字，邮件，手机，url，身份证校验
	import {
		isNumber,
		isIntNumer,
		isEmail,
		isMobile,
		isPhone,
		isURL,
		checkIdCard
	} from "@/utils/validate";

	export default {
		data() {
			return {
				ruleForm: {},
				flag: '',
				usersFlag: false,
				sexTypesOptions: [],
				hanyeTypesOptions: [],
				shenfenTypesOptions: [],
			};
		},
		mounted() {
			//获取当前登录用户的信息
			var table = this.$storage.get("sessionTable");
			this.sessionTable = this.$storage.get("sessionTable");
			this.role = this.$storage.get("role");
			if (this.role != "管理员") {}

			this.flag = table;
			this.$http({
				url: `${this.$storage.get("sessionTable")}/session`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code === 0) {
					this.ruleForm = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			this.$http({
				url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code === 0) {
					this.sexTypesOptions = data.data.list;
				} else {
					this.$message.error(data.msg);
				}
			});
			this.$http({
				url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=hanye_types`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code === 0) {
					this.hanyeTypesOptions = data.data.list;
				} else {
					this.$message.error(data.msg);
				}
			});
			this.$http({
				url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=shenfen_types`,
				method: "get"
			}).then(({
				data
			}) => {
				if (data && data.code === 0) {
					this.shenfenTypesOptions = data.data.list;
				} else {
					this.$message.error(data.msg);
				}
			});
		},
		methods: {
			gongsiPhotoUploadChange(fileUrls) {
				this.ruleForm.gongsiPhoto = fileUrls;
			},
			yonghuPhotoUploadChange(fileUrls) {
				this.ruleForm.yonghuPhoto = fileUrls;
			},

			onUpdateHandler() {
				if ((!this.ruleForm.gongsiName) && 'gongsi' == this.flag) {
					this.$message.error('公司名称不能为空');
					return
				}

				if ((!this.ruleForm.hanyeTypes) && 'gongsi' == this.flag) {
					this.$message.error('所在行业不能为空');
					return
				}

				if ((!this.ruleForm.gongsiPhone) && 'gongsi' == this.flag) {
					this.$message.error('联系方式不能为空');
					return
				}

				if ('gongsi' == this.flag && this.ruleForm.gongsiEmail && (!isEmail(this.ruleForm.gongsiEmail))) {
					this.$message.error(`邮箱应输入邮箱格式`);
					return
				}
				if ((!this.ruleForm.gongsiPhoto) && 'gongsi' == this.flag) {
					this.$message.error('营业执照展示不能为空');
					return
				}

				if ((!this.ruleForm.gongsiContent) && 'gongsi' == this.flag) {
					this.$message.error('公司简介不能为空');
					return
				}

				if ((!this.ruleForm.yonghuName) && 'yonghu' == this.flag) {
					this.$message.error('用户姓名不能为空');
					return
				}

				if ((!this.ruleForm.yonghuPhoto) && 'yonghu' == this.flag) {
					this.$message.error('头像不能为空');
					return
				}

				if ('yonghu' == this.flag && this.ruleForm.yonghuPhone && (!isMobile(this.ruleForm.yonghuPhone))) {
					this.$message.error(`手机应输入手机格式`);
					return
				}
				if ((!this.ruleForm.yonghuIdNumber) && 'yonghu' == this.flag) {
					this.$message.error('用户身份证号不能为空');
					return
				}

				if ('yonghu' == this.flag && this.ruleForm.yonghuEmail && (!isEmail(this.ruleForm.yonghuEmail))) {
					this.$message.error(`邮箱应输入邮箱格式`);
					return
				}
				if ((!this.ruleForm.shenfenTypes) && 'yonghu' == this.flag) {
					this.$message.error('身份不能为空');
					return
				}

				if ((!this.ruleForm.sexTypes) && this.flag != 'users') {
					this.$message.error('性别不能为空');
					return
				}
				if ('users' == this.flag && this.ruleForm.username.trim().length < 1) {
					this.$message.error(`用户名不能为空`);
					return
				}
				this.$http({
					url: `${this.$storage.get("sessionTable")}/update`,
					method: "post",
					data: this.ruleForm
				}).then(({
					data
				}) => {
					if (data && data.code === 0) {
						this.$message({
							message: "修改信息成功",
							type: "success",
							duration: 1500,
							onClose: () => {}
						});
					} else {
						this.$message.error(data.msg);
					}
				});
			}
		}
	};
</script>
<style lang="scss" scoped>
</style>
