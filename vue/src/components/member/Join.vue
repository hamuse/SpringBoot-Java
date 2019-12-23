<template>
<div>
  <div id="host-header">
        <h1 align = "center">업체 회원 가입</h1>
      </div>
        <fieldset>
        <div><label for="hostName">아이디</label></div>
        <span><input type="text" v-model="userid" name="hostId" maxlength="20" ></span>
        </fieldset>
        <fieldset>
        <div><label for="hostName">비번</label></div>
        <input type="pw" v-model="passwd" name="hostPw" maxlength="20" autocomplete="off">
        </fieldset>
        <fieldset>
        <div><label for="hostName">이름</label></div>
        <div><input type="text" v-model="name" name="hostName" maxlength="20" ></div>
        </fieldset>
        <fieldset>
        <div><label for="hostName">생일</label></div>
        <div><input type="text" v-model="birthday" name="hostbir" maxlength="20" ></div>
        </fieldset>
        <div class="btnfield" style="text-align: center">
            <input type="submit" value="회원가입" @click.prevent="join">
        </div>
</div>
</template>
<script>
/* import {store} from "../../store" */
import axios from "axios"
export default{
    data(){

    return{
        context:'http://localhost:8080/',
        userid:'',
        passwd:'',
        name:'',
        birthday:''
        }
    },

    methods:{
        join(){
            alert(`${this.userid},${this.passwd},${this.name},${this.birthday}`)
        let url = `${this.context}/join`
        let data = {
            userid:this.userid,
            passwd:this.passwd,
            name:this.name,
            birthday:this.birthday
        }
        let headers ={
            'authorization': 'JWT fefege..',
              'Accept' : 'application/json',
              'Content-Type': 'application/json'
        }
        axios.post(url, data, headers)
        
        }
    }
}
</script>
<style scoped>
</style>