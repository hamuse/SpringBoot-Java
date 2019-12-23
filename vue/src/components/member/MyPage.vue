<template>
  <div class="back">
     <div align = "center"><h1>{{name}}님의 Mypage</h1></div>
      <div class="sub">
        <div class="pull-left rt size" >
           <fieldset style=" margin-top: 1%; height: 31.5%;border: 2px solid black;">
             <legend><h3>비밀번호 변경</h3></legend>
                <input type="text" name="pwd" size="20" placeholder="기존 비밀번호 입력" style="float: none; width: 70%;">
                <button style="height: 38%; width: 20%; float: right;">수정</button><br/><br/>
           <span><input type="text" name="newpwd" size="20" placeholder="변경할 비밀번호 입력" style="float: none;width: 70%;"></span>
           </fieldset>
           <fieldset style="margin-top: 1%; height: 31.5%;border: 2px solid black;">
              <legend><h3>연락처 변경</h3></legend>
                <input type="text" name="pwd" size="20" placeholder="변경할 연락처 입력" style="float: none;width: 70%;">
                <button style="width: 20%; float: right;">수정</button><br/><br/>
           </fieldset>
           <fieldset style="margin-top: 1%; height: 31.5%;border: 2px solid black;">
               <legend><h3>업체주소 변경</h3></legend>
                <input type="text" name="pwd" size="20" placeholder="변경할 주소 입력" style="float: none;width: 70%;">
                <button style="width: 20%; float: right;">수정</button><br/><br/>
           </fieldset>
        </div>
        <div class="pull-right size" >
            <fieldset style="height: 49%;border: 2px solid black;">
                <legend><h3>정보보기</h3></legend>
                <a href="#" ><h3>예약리스트 보기</h3></a>
                <a href="#" ><h3 align = "center">내업체 보기</h3></a>
                <a href="#" ><h3 align = "center">업체 등록 하기</h3></a>
            </fieldset>
            <fieldset style="margin-top: 1%; height: 47.5%; border: 2px solid black;">
              <legend><h3>등록업체 삭제</h3></legend>
              <select name="pat" id="pattype" style="height: 21.5px; vertical-align:middle;">
               <option value="LargeDog">업체1</option>
               <option value="LargeDog">업체2</option>
               <option value="SmallDog">업체3</option>
               <input type="text" placeholder="직접입력" style="float: none; width: 70%;">
              </select>
                <button style="width: 20%; float: right;">등록</button><br/><br/>
              <a href="#"><h2 align="center">회원탈퇴</h2></a>
            </fieldset>
        </div>
      </div>
    </div>
</template>
<script>
 import {store} from "../../store" 
export default{
		data(){
			return{
		name: store.state.name
		}
	}
}
</script>
<style scoped>
.back {width: 1100px; margin: 0 auto;}
.sub {width: 70%; height: 600px; margin: 0 auto; text-align: center;}
.pull-left {float: left;}
.pull-right {float: right;}
.top {margin-top: 1%;}
.rt {margin-right: 1%;}
.size {width: 49.5%; height: 100%;}
</style>