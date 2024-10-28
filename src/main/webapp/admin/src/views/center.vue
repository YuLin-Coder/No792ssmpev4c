<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengju'"  label="卫生局账号" prop="weishengjuzhanghao">
          <el-input v-model="ruleForm.weishengjuzhanghao" readonly              placeholder="卫生局账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengju'"  label="负责人姓名" prop="fuzerenxingming">
          <el-input v-model="ruleForm.fuzerenxingming"               placeholder="负责人姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengju'"  label="管辖区域" prop="guanxiaquyu">
          <el-input v-model="ruleForm.guanxiaquyu"               placeholder="管辖区域" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengju'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengju'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='weishengju'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="weishengjuzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengyuan'"  label="卫生院账号" prop="weishengyuanzhanghao">
          <el-input v-model="ruleForm.weishengyuanzhanghao" readonly              placeholder="卫生院账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengyuan'"  label="负责人姓名" prop="fuzerenxingming">
          <el-input v-model="ruleForm.fuzerenxingming"               placeholder="负责人姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='weishengyuan'"  label="管辖区域" prop="guanxiaquyu">
          <el-select v-model="ruleForm.guanxiaquyu" placeholder="请选择管辖区域">
            <el-option
                v-for="(item,index) in weishengyuanguanxiaquyuOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengyuan'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengyuan'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='weishengyuan'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="weishengyuanzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengshi'"  label="卫生室账号" prop="weishengshizhanghao">
          <el-input v-model="ruleForm.weishengshizhanghao" readonly              placeholder="卫生室账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengshi'"  label="负责人姓名" prop="fuzerenxingming">
          <el-input v-model="ruleForm.fuzerenxingming"               placeholder="负责人姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengshi'"  label="卫生室名" prop="weishengshiming">
          <el-input v-model="ruleForm.weishengshiming"               placeholder="卫生室名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='weishengshi'"  label="所属区域" prop="suoshuquyu">
          <el-select v-model="ruleForm.suoshuquyu" placeholder="请选择所属区域">
            <el-option
                v-for="(item,index) in weishengshisuoshuquyuOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengshi'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='weishengshi'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='weishengshi'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="weishengshizhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yaopingongyingshang'"  label="供应商账号" prop="gongyingshangzhanghao">
          <el-input v-model="ruleForm.gongyingshangzhanghao" readonly              placeholder="供应商账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yaopingongyingshang'"  label="销售代理" prop="xiaoshoudaili">
          <el-input v-model="ruleForm.xiaoshoudaili"               placeholder="销售代理" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yaopingongyingshang'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yaopingongyingshang'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='yaopingongyingshang'" label="照片" prop="zhaopian">
          <file-upload
          tip="点击上传照片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
          @change="yaopingongyingshangzhaopianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
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
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      weishengyuanguanxiaquyuOptions: [],
      weishengshisuoshuquyuOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.$http({
      url: `option/quyuxinxi/quyuming`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.weishengyuanguanxiaquyuOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.$http({
      url: `option/quyuxinxi/quyuming`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.weishengshisuoshuquyuOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    weishengjuzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    weishengyuanzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    weishengshizhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    yaopingongyingshangzhaopianUploadChange(fileUrls) {
        this.ruleForm.zhaopian = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.weishengjuzhanghao)&& 'weishengju'==this.flag){
        this.$message.error('卫生局账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'weishengju'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.fuzerenxingming)&& 'weishengju'==this.flag){
        this.$message.error('负责人姓名不能为空');
        return
      }
      if( 'weishengju' ==this.flag && this.ruleForm.lianxidianhua&&(!isPhone(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入电话格式`);
        return
      }
      if( 'weishengju' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
      if((!this.ruleForm.weishengyuanzhanghao)&& 'weishengyuan'==this.flag){
        this.$message.error('卫生院账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'weishengyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.fuzerenxingming)&& 'weishengyuan'==this.flag){
        this.$message.error('负责人姓名不能为空');
        return
      }
      if( 'weishengyuan' ==this.flag && this.ruleForm.lianxidianhua&&(!isPhone(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入电话格式`);
        return
      }
      if( 'weishengyuan' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
      if((!this.ruleForm.weishengshizhanghao)&& 'weishengshi'==this.flag){
        this.$message.error('卫生室账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'weishengshi'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.fuzerenxingming)&& 'weishengshi'==this.flag){
        this.$message.error('负责人姓名不能为空');
        return
      }
      if( 'weishengshi' ==this.flag && this.ruleForm.lianxidianhua&&(!isPhone(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入电话格式`);
        return
      }
      if( 'weishengshi' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
      if((!this.ruleForm.gongyingshangzhanghao)&& 'yaopingongyingshang'==this.flag){
        this.$message.error('供应商账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'yaopingongyingshang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.xiaoshoudaili)&& 'yaopingongyingshang'==this.flag){
        this.$message.error('销售代理不能为空');
        return
      }
      if( 'yaopingongyingshang' ==this.flag && this.ruleForm.lianxidianhua&&(!isPhone(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入电话格式`);
        return
      }
      if( 'yaopingongyingshang' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
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
