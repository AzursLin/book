<template>
  <div id="myBg" class="myBg" style="height: 100%">
    <el-row>
      <el-form :model="ruleForm2" :rules="rules2" ref="ruleForm2" label-position="left" label-width="0px" class="demo-ruleForm login-container">
        <h3 class="title">系统登录</h3>
        <el-form-item prop="account">
          <el-input type="text" v-model="ruleForm2.account" auto-complete="off" placeholder="账号"></el-input>
        </el-form-item>
        <el-form-item prop="checkPass">
          <el-input type="password" @keyup.enter.native="handleSubmit2" v-model="ruleForm2.checkPass" auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <el-checkbox v-model="checked" checked class="remember">记住密码</el-checkbox>
        <el-form-item style="width:100%;">
          <el-button type="primary" style="width:100%;" @click.native.prevent="handleSubmit2" :loading="logining">登录</el-button>
        </el-form-item>
      </el-form>
    </el-row>
  </div>

</template>

<script>
  import { login } from '../api/api';
  //import NProgress from 'nprogress'
  export default {
    data() {
      return {
        logining: false,
        ruleForm2: {
          account: '',
          checkPass: ''
        },
        rules2: {
          account: [
            { required: true, message: '请输入账号', trigger: 'blur' },
            //{ validator: validaePass }
          ],
          checkPass: [
            { required: true, message: '请输入密码', trigger: 'blur' },
            //{ validator: validaePass2 }
          ]
        },
        checked: true
      };
    },
    methods: {
      handleSubmit2(ev) {
        var _this = this;
        //把Jason转换为字符串
        var querystring = require('querystring');
        var loginParams = querystring.stringify({
          'userName':this.ruleForm2.account,
          'pass':this.ruleForm2.checkPass
        });
        login(loginParams).then(data => {
          this.logining = false;
          //NProgress.done();
          let { ret, msg,Data} = data;
          if(ret === 1){
            this.$message({
              message: msg,
              type: 'info'
            });
            sessionStorage.setItem('userName', JSON.stringify(this.ruleForm2.account));
            this.$router.push({ path: '/UserInfo' });
          } else {
            console.log("123")
            this.$message({
              message: msg,
              type: 'error'
            });
          }
        });

      }
    },
    mounted() {
     /* this.checked = JSON.parse(localStorage.getItem('passRemember'));
      this.ruleForm2.account = JSON.parse(localStorage.getItem('tmpAct'));
      if(this.checked === true) {
        this.ruleForm2.checkPass = JSON.parse(localStorage.getItem('tmpPass'));
      }*/
    }
  }
</script>

<style lang="scss" scoped>
  .myBg {
    background: url("../../static/img/di.jpg");
  }
  .login-container {
    /*box-shadow: 0 0px 8px 0 rgba(0, 0, 0, 0.06), 0 1px 0px 0 rgba(0, 0, 0, 0.02);*/
    -webkit-border-radius: 5px;
    border-radius: 5px;
    -moz-border-radius: 5px;
    background-clip: padding-box;
    margin: 180px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
    .title {
      margin: 0px auto 40px auto;
      text-align: center;
      color: #505458;
    }
    .remember {
      margin: 0px 0px 35px 0px;
    }
  }
</style>
